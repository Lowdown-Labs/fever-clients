# Security policy

## Reporting

This repo is private to the Lowdown Labs org for now. Members: open an issue
or ping the maintainers directly. After it goes public this file gains a
private-reporting channel.

## What "trusted SDK" means here

Every client in `clients/` is machine-generated from one input
(`spec/openapi.json`) by one pinned tool
(`openapitools/openapi-generator-cli:v7.25.0@sha256:2ab0a9…`). The chain that
produces a release:

1. **Spec gate** — the spec must validate under the pinned generator image;
   spec changes arrive only as reviewed PRs from the lowdown_lab sync
   automation (`FEVER_CLIENTS_TOKEN`, scoped to this repo).
2. **Scan gate** (`security.yml`, every PR/push + weekly):
   - gitleaks — no secrets in history
   - Trivy filesystem scan — every dependency manifest, fixable
     HIGH/CRITICAL fails the build (`ignore-unfixed: true`)
   - pip-audit, npm audit (`--omit=dev --audit-level=high`), govulncheck
3. **Human gate** — CODEOWNERS review on every merge; generated code is never
   hand-edited (CI regenerates and diffs to prove it).
4. **Release provenance** — SBOM (`sbom.spdx.json`) and `checksums.txt`
   attached to every release; verify downloads with `sha256sum -c`.

Generated clients also inherit the upstream dependency posture of
openapi-generator's templates — the weekly scheduled scan exists precisely so
a newly disclosed CVE in a client dependency fails loudly even when nothing
changed here.

## Known gaps (pre-public hardening list)

- Actions referenced by tag, not SHA — dependabot keeps them fresh; pin SHAs
  before going public.
- No SARIF/code-scanning upload (needs GHAS on private repos).
- No artifact attestation / signed tags yet.
- No registry signing (PyPI/npm publishing doesn't exist yet by design).
