#!/usr/bin/env bash
set -euo pipefail

REPO_ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
lang="${1:?usage: smoke.sh <language>}"
dir="${REPO_ROOT}/clients/${lang}"
[ -d "$dir" ] || { echo "clients/${lang} does not exist — run scripts/generate.sh first" >&2; exit 1; }

case "$lang" in
  python)
    python3 -m pip install --quiet build
    (cd "$dir" && python3 -m build --wheel --sdist --outdir dist/)
    ;;
  typescript)
    (cd "$dir" && npm install --no-audit --no-fund && npm run build)
    ;;
  go)
    (cd "$dir" && go build ./... && go vet ./...)
    ;;
  ruby)
    (cd "$dir" && gem build fever_client.gemspec --output fever_client.gem)
    ;;
  java)
    (cd "$dir" && mvn --batch-mode --quiet -DskipTests package)
    ;;
  rust)
    (cd "$dir" && cargo check)
    ;;
  php)
    (cd "$dir" && composer validate --no-check-publish)
    find "$dir/lib" -name '*.php' -print0 | xargs -0 -n1 php -l > /dev/null
    ;;
  csharp)
    (cd "$dir" && dotnet build --configuration Release)
    ;;
  *)
    echo "unknown language: $lang" >&2
    exit 1
    ;;
esac

echo "smoke ok: ${lang}"
