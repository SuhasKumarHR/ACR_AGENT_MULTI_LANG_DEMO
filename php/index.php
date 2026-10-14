<?php
// Five intentional parse diagnostics are kept in this one entry file.
echo "missing semicolon"                       // 1: missing semicolon
if (true) { echo "unclosed block"              // 2: unclosed block
function brokenFunction($value {                // 3: malformed parameter list
$items = [1, 2, 3;                              // 4: malformed array
$value = ;                                      // 5: missing expression
