// Five intentional syntax diagnostics are kept in this one entry file.
console.log("JavaScript error 1";             // 1: missing closing parenthesis
function brokenTwo() {                        // 2: unclosed function
  console.log("JavaScript error 2");
const brokenThree = {;                        // 3: invalid object literal
const brokenFour = `unterminated template;    // 4: unterminated template
const brokenFive = ;                          // 5: missing initializer
