import ast
import io
import os
import re
import sys
import tokenize

PY_KEEP = re.compile(
    r"(noqa|type:\s*ignore|pragma:\s*no\s*cover|pylint|pyright|isort|fmt:\s*(on|off|skip))",
    re.I,
)
RUBY_KEEP = re.compile(r"^#\s*(frozen_string_literal|encoding|coding|warn_indent|typed)\s*:")
GO_KEEP = re.compile(r"^//(go:|line |\+build|nolint)")
TS_KEEP = re.compile(r"(@ts-(ignore|nocheck|expect-error)|tslint|eslint)")

EXT_MAP = {
    ".py": "python",
    ".go": "go",
    ".ts": "typescript",
    ".java": "java",
    ".rb": "ruby",
    ".php": "php",
    ".rs": "rust",
    ".cs": "csharp",
    ".xml": "xml",
    ".csproj": "xml",
    ".sh": "hash",
    ".yaml": "hash",
    ".yml": "hash",
}
NAME_MAP = {
    ".gitignore": "hash",
    ".openapi-generator-ignore": "hash",
    ".dockerignore": "hash",
}

def strip_python(src):
    try:
        tree = ast.parse(src)
    except SyntaxError:
        return src
    lines = src.splitlines(keepends=True)
    delete = set()
    cut = {}

    for node in ast.walk(tree):
        body = getattr(node, "body", None)
        if not isinstance(body, list) or not body:
            continue
        bare = [
            stmt
            for stmt in body
            if isinstance(stmt, ast.Expr)
            and isinstance(stmt.value, ast.Constant)
            and isinstance(stmt.value.value, str)
        ]
        if not bare:
            continue
        only = len(bare) == len(body) and isinstance(
            node, (ast.FunctionDef, ast.AsyncFunctionDef, ast.ClassDef)
        )
        for k, stmt in enumerate(bare):
            lo, hi = stmt.lineno, stmt.end_lineno
            if only and k == 0:
                lines[lo - 1] = " " * stmt.col_offset + "pass\n"
                for ln in range(lo + 1, hi + 1):
                    delete.add(ln)
            else:
                for ln in range(lo, hi + 1):
                    delete.add(ln)

    try:
        toks = tokenize.generate_tokens(io.StringIO(src).readline)
        for tok in toks:
            if tok.type != tokenize.COMMENT:
                continue
            if PY_KEEP.search(tok.string):
                continue
            srow, scol = tok.start
            if srow in delete:
                continue
            if lines[srow - 1][:scol].strip() == "":
                delete.add(srow)
            else:
                cut[srow] = scol
    except tokenize.TokenError:
        return src

    out = []
    for i, line in enumerate(lines, start=1):
        if i in delete:
            continue
        if i in cut:
            line = line[: cut[i]].rstrip() + "\n"
        out.append(line)
    return collapse_blanks_python("".join(out))

def collapse_blanks_python(text):
    lines = text.splitlines(keepends=True)
    protected = set()
    try:
        for tok in tokenize.generate_tokens(io.StringIO(text).readline):
            if tok.type == tokenize.STRING and tok.end[0] > tok.start[0]:
                for ln in range(tok.start[0], tok.end[0] + 1):
                    protected.add(ln)
    except tokenize.TokenError:
        return text
    out = []
    blank_run = 0
    for i, line in enumerate(lines, start=1):
        if line.strip() == "" and i not in protected:
            blank_run += 1
            if blank_run > 1:
                continue
        else:
            blank_run = 0
        out.append(line)
    text = "".join(out).lstrip("\n")
    if not text.endswith("\n"):
        text += "\n"
    return text

def strip_cfamily(src, dq=True, sq=True, bt=None, cs_prefixes=False, markers=("//",), keep=None):
    out = []
    i, n = 0, len(src)
    state = None
    line = []
    line_code = False
    line_commented = False

    def emit(ch):
        nonlocal line_code
        line.append(ch)
        if not ch.isspace():
            line_code = True

    def flush_line():
        nonlocal line, line_code, line_commented
        s = "".join(line).rstrip()
        if s:
            out.append(s + "\n")
        elif not line_commented and out and out[-1] != "\n":
            out.append("\n")
        line = []
        line_code = False
        line_commented = False

    while i < n:
        c = src[i]
        if state is None:
            if cs_prefixes and c in "@$":
                j = i
                while j < n and src[j] in "@$":
                    j += 1
                if j < n and src[j] == '"':
                    for ch in src[i : j + 1]:
                        emit(ch)
                    state = "verb" if "@" in src[i:j] else "dq"
                    i = j + 1
                    continue
            if dq and c == '"':
                emit(c)
                state = "dq"
                i += 1
                continue
            if sq and c == "'":
                emit(c)
                state = "sq"
                i += 1
                continue
            if bt and c == "`":
                emit(c)
                state = "bt"
                i += 1
                continue
            hit = False
            for m in markers:
                if not src.startswith(m, i):
                    continue
                if m == "#" and i + 1 < n and src[i + 1] == "[":
                    continue
                eol = src.find("\n", i)
                if eol == -1:
                    eol = n
                line_commented = True
                if keep and keep.search(src[i:eol]):
                    for ch in src[i:eol]:
                        emit(ch)
                i = eol
                hit = True
                break
            if hit:
                continue
            if src.startswith("/*", i):
                e = src.find("*/", i + 2)
                if e == -1:
                    e = n - 2
                line_commented = True
                if keep and keep.search(src[i : e + 2]):
                    for ch in src[i : e + 2]:
                        emit(ch)
                else:
                    for k in range(i, e + 2):
                        if src[k] == "\n":
                            flush_line()
                i = e + 2
                continue
            if c == "\n":
                flush_line()
                i += 1
                continue
            emit(c)
            i += 1
            continue
        if state in ("dq", "sq"):
            emit(c)
            if c == "\\" and i + 1 < n:
                emit(src[i + 1])
                i += 2
                continue
            if (state == "dq" and c == '"') or (state == "sq" and c == "'"):
                state = None
            i += 1
            continue
        if state == "bt":
            emit(c)
            if bt == "esc" and c == "\\" and i + 1 < n:
                emit(src[i + 1])
                i += 2
                continue
            if c == "`":
                state = None
            i += 1
            continue
        if state == "verb":
            emit(c)
            if c == '"':
                if i + 1 < n and src[i + 1] == '"':
                    emit('"')
                    i += 2
                    continue
                state = None
            i += 1
            continue
    s = "".join(line).rstrip()
    if s:
        out.append(s + "\n")
    return "".join(out)

def strip_ruby(src):
    out = []
    in_block = False
    for line in src.splitlines(keepends=True):
        if in_block:
            if line.startswith("=end"):
                in_block = False
            continue
        if line.startswith("=begin"):
            in_block = True
            continue
        s = line.lstrip()
        if s.startswith("#"):
            if RUBY_KEEP.match(s):
                out.append(line)
            continue
        idx = line.find("#")
        if idx > 0 and not any(ch in line[:idx] for ch in "\"'/"):
            line = line[:idx].rstrip() + "\n"
        out.append(line)
    text = "".join(out).lstrip("\n")
    if not text.endswith("\n"):
        text += "\n"
    return text

def strip_rust(src):
    out = []
    in_block = False
    for line in src.splitlines(keepends=True):
        s = line.strip()
        if in_block:
            if "*/" in line:
                in_block = False
            continue
        if s.startswith("//"):
            continue
        if s.startswith("/*"):
            if "*/" not in line[line.index("/*") + 2 :]:
                in_block = True
            continue
        out.append(line)
    text = "".join(out).lstrip("\n")
    if not text.endswith("\n"):
        text += "\n"
    return text

def strip_xml(src):
    text = re.sub(r"<!--.*?-->", "", src, flags=re.S)
    out = []
    for line in text.splitlines(keepends=True):
        if line.strip():
            out.append(line.rstrip() + "\n")
    return "".join(out)

def strip_hash(src):
    out = []
    for i, line in enumerate(src.splitlines(keepends=True)):
        s = line.lstrip()
        if s.startswith("#"):
            if i == 0 and s.startswith("#!"):
                out.append(line)
            continue
        out.append(line)
    text = "".join(out)
    text = re.sub(r"\n{3,}", "\n\n", text).lstrip("\n")
    if not text.endswith("\n"):
        text += "\n"
    return text

def strip_file(path, kind):
    with open(path, "r", encoding="utf-8") as fh:
        src = fh.read()
    if "\r" in src:
        return False
    if kind == "python":
        out = strip_python(src)
    elif kind == "go":
        out = strip_cfamily(src, bt="raw", keep=GO_KEEP)
    elif kind == "typescript":
        out = strip_cfamily(src, bt="esc", keep=TS_KEEP)
    elif kind == "java":
        out = strip_cfamily(src)
    elif kind == "csharp":
        out = strip_cfamily(src, cs_prefixes=True)
    elif kind == "php":
        out = strip_cfamily(src, markers=("//", "#"))
    elif kind == "ruby":
        out = strip_ruby(src)
    elif kind == "rust":
        out = strip_rust(src)
    elif kind == "xml":
        out = strip_xml(src)
    elif kind == "hash":
        out = strip_hash(src)
    else:
        return False
    if out != src:
        with open(path, "w", encoding="utf-8") as fh:
            fh.write(out)
        return True
    return False

def main(argv):
    if len(argv) < 2:
        print("usage: strip_comments.py <path> [<path>...]", file=sys.stderr)
        return 1
    changed = 0
    scanned = 0
    for arg in argv:
        paths = []
        if os.path.isdir(arg):
            for root, dirs, files in os.walk(arg):
                dirs[:] = [d for d in dirs if d not in ("node_modules", "target", "dist", ".git")]
                for f in files:
                    paths.append(os.path.join(root, f))
        else:
            paths.append(arg)
        for path in sorted(paths):
            kind = NAME_MAP.get(os.path.basename(path)) or EXT_MAP.get(
                os.path.splitext(path)[1].lower()
            )
            if not kind:
                continue
            scanned += 1
            if strip_file(path, kind):
                changed += 1
    print(f"strip_comments: {changed} changed of {scanned} scanned")
    return 0

if __name__ == "__main__":
    sys.exit(main(sys.argv))
