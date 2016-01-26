/* 노드 모듈 만들고 사용하기 */
const sub1 = require("./sub1.js");
const sub2 = require("./sub2.js");

console.log("10 + 20 = ", sub1.plus(10, 20));
console.log("10 - 20 = ", sub1.minus(10, 20));
console.log("10 * 20 = ", sub2.multiple(10, 20));
console.log("10 / 20 = ", sub2.divide(10, 20));
