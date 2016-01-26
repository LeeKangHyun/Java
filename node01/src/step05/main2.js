/* 노드 모듈 만들고 사용하기 */
const calc = require("./sub2.js");

var calcObj = calc();

console.log("10 + 20 = ", calcObj.plus(10, 20));
console.log("10 - 20 = ", calcObj.minus(10, 20));
console.log("10 * 20 = ", calcObj.multiple(10, 20));
console.log("10 / 20 = ", calcObj.divide(10, 20));
