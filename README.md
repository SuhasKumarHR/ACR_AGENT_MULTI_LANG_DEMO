# ACR_AGENT multi-language failure fixtures

This repository is a deterministic test target for ACR_AGENT. It contains one
small project directory for each supported language. Each directory contains
**five independent build or syntax errors** so the worker can demonstrate
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
