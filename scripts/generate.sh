#!/usr/bin/env bash
# Regenerate the SDK clients from spec/openapi.json.
#
# The generator image is pinned by digest: what generates the code you ship is
# exactly what generated the code that was reviewed. Bump deliberately.
#
#   scripts/generate.sh              # all languages, dev version stamp
#   scripts/generate.sh python go    # subset
#   VERSION=1.2.3 scripts/generate.sh # stamp package manifests with a version
#
# After running, `git status` shows the drift. CI runs this and fails on diff,
# so clients/ is always provably in sync with spec/openapi.json.
set -euo pipefail

REPO_ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
cd "$REPO_ROOT"

GENERATOR_IMAGE="${GENERATOR_IMAGE:-openapitools/openapi-generator-cli:v7.25.0@sha256:2ab0a9680222de65dc9d3baf861aa02b99e1b80c211d8221ebf3ae8f8a102524}"
VERSION="${VERSION:-0.0.0-dev}"

ALL_LANGS=(python typescript go ruby java rust php csharp)
if [ "$#" -gt 0 ]; then
  LANGS=("$@")
else
  LANGS=("${ALL_LANGS[@]}")
fi

# Each generator family names its version knob differently, and -p overrides
# do NOT beat the config file for all of them (java keeps the file's
# artifactVersion). So the version is stamped into a temp copy of the config —
# one mechanism that works for every generator.
stamp_config() {
  local src="$1" dst="$2"
  sed -E "s/^([[:space:]]*)(packageVersion|gemVersion|npmVersion|artifactVersion): .*/\1\2: \"${VERSION}\"/" \
    "$src" > "$dst"
}

# Files the generator emits that we never commit: its own CI, VCS helpers,
# bookkeeping. Our repo supplies all of that itself.
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

  # Per-language post-fixups: make the generated tree self-consistent.
  case "$lang" in
    go)
      # The generated *_test.go files import testify, which the generated
      # go.mod omits — resolve module files once, here, so CI builds clean.
      (cd "$out" && go mod tidy)
      ;;
    csharp)
      # The generator re-rolls the .sln project GUID on every run, which is
      # pure churn against the drift check. Pin it to a constant (the GUID is
      # referenced only inside the .sln itself).
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
