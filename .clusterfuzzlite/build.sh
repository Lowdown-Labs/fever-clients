#!/bin/bash -eu
for d in "$SRC"/*/; do
  if [ -d "${d}clients/python" ]; then repo="$d"; break; fi
done
pip3 install --no-cache-dir "${repo}clients/python"
compile_python_fuzzer "${repo}fuzz/deserialize_fuzzer.py"
