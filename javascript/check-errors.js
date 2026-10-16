const { spawnSync } = require("node:child_process");
const files = [
  "error_01.js",
  "error_02.js",
  "error_03.js",
  "error_04.js",
  "error_05.js",
];

let failures = 0;
for (const file of files) {
  const result = spawnSync(process.execPath, ["--check", file], { encoding: "utf8" });
  if (result.status !== 0) {
    failures += 1;
    process.stderr.write(`FILE: ${file}\n${result.stderr || result.stdout}\n`);
  }
}
process.exitCode = failures === 0 ? 0 : 1;
