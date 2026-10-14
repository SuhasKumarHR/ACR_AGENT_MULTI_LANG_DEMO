# ACR_AGENT multi-language failure fixtures

This repository is a deterministic test target for ACR_AGENT. It contains one
small project directory for each supported language. Each directory contains
**five independent build or syntax errors in that language's main entry file** so the worker can demonstrate
failure detection, KNN classification, AI diagnosis, patching, verification,
rollback, and retry behavior.

The root `acr-project.json` documents the available projects. In the ACR_AGENT
dashboard, select the language that you want to run; do not use Auto detect for
this multi-project fixture because the repository intentionally contains more
than one language.

Supported fixture folders:

`python`, `javascript`, `typescript`, `java`, `c`, `cpp`, `csharp`, `go`,
`rust`, `php`, and `kotlin`.

The errors are intentionally educational and should not be used as production
source code. A successful healing run should leave the fixture repaired only in
the worker's temporary clone and should publish a real branch/PR when GitHub
credentials are configured.

Each selected language now has one source entry file containing all five
intentional failures (`main.*`, `index.*`, or `src/main.rs`/`src/index.ts`).
This keeps a run focused on one file and makes the red/green GitHub diff easy
to review. Select exactly one language in ACR_AGENT; the fixture is not meant
to be run as one combined multi-language build.
