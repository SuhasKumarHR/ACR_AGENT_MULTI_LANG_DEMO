// Five intentional type-checking diagnostics are kept in this one entry file.
const valueOne: number = "not a number";      // 1: wrong type
function returnNumber(): number {
  return "not a number";                      // 2: wrong return type
}
interface Config { port: number }
const config: Config = { port: 3000 };
console.log(config.host);                      // 3: missing property
function add(left: number, right: number): number { return left + right; }
console.log(add(1, "2"));                     // 4: wrong argument type
const enabled: boolean = 1;                   // 5: wrong type
console.log(valueOne, returnNumber(), enabled);
