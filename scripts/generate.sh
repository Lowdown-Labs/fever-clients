#!/usr/bin/env bash
set -euo pipefail

REPO_ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
cd "$REPO_ROOT"

GENERATOR_IMAGE="${GENERATOR_IMAGE:-openapitools/openapi-generator-cli:v7.25.0@sha256:2ab0a9680222de65dc9d3baf861aa02b99e1b80c211d8221ebf3ae8f8a102524}"
VERSION="${VERSION:-0.0.0-dev}"

command -v python3 >/dev/null || { echo "python3 is required for the comment strip pass" >&2; exit 1; }

ALL_LANGS=(python typescript go ruby java rust php csharp)
if [ "$#" -gt 0 ]; then
  LANGS=("$@")
else
  LANGS=("${ALL_LANGS[@]}")
fi

stamp_config() {
  local src="$1" dst="$2"
  sed -E "s/^([[:space:]]*)(packageVersion|gemVersion|npmVersion|artifactVersion): .*/\1\2: \"${VERSION}\"/" \
    "$src" > "$dst"
}

clean_generator_noise() {
  rm -rf \
    "$1/.openapi-generator" \
    "$1/.travis.yml" \
    "$1/.gitlab-ci.yml" \
    "$1/appveyor.yml" \
    "$1/git_push.sh" \
    "$1/.github" \
    "$1/openapitools.json"
}

for lang in "${LANGS[@]}"; do
  config="generator/${lang}.yaml"
  [ -f "$config" ] || { echo "no generator config for '$lang'" >&2; exit 1; }

  out="clients/${lang}"
  rm -rf "$out"
  mkdir -p "$out"

  echo "==> ${lang} (${GENERATOR_IMAGE})"
  tmpconfig="generator/.tmp-${lang}.yaml"
  stamp_config "$config" "$tmpconfig"
  docker run --rm \
    -u "$(id -u):$(id -g)" \
    -v "${REPO_ROOT}:/local" \
    "$GENERATOR_IMAGE" generate \
      --config "/local/${tmpconfig}"
  rm -f "$tmpconfig"

  clean_generator_noise "$out"
  python3 "${REPO_ROOT}/scripts/strip_comments.py" "$out"

  case "$lang" in
    go)
      (cd "$out" && go mod tidy)
      ;;
    csharp)
      sln=$(ls "$out"/*.sln 2>/dev/null | head -1 || true)
      if [ -n "$sln" ]; then
        guid=$(grep -m1 '^Project(' "$sln" | grep -oP '\{[0-9A-Fa-f-]{36}\}' | sed -n 2p || true)
        if [ -n "$guid" ]; then
          sed -i "s/${guid}/{A15A1A01-5AFE-4AFE-8AFE-FE7C11E70001}/g" "$sln"
        fi
      fi
      ;;
  esac
done

echo "done. 'git status' shows the drift; commit clients/ together with spec/."
