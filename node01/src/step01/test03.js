// 함수 선언과 사용
var a = 100;
var b = 20;

// 변수에 함수 객체를 할당하는 것은 호이스팅 대상이 아니다.
// 따라서 아래의 함수는 사용하기 전에 정의해야 한다.
var minus = function(v1, v2) {
  return v1 - v2;
}
console.log("a + b = ", plus(a,b));
console.log("a - b = ", minus(a,b));

// 호이스팅(hoisting) 때문에 아래의 함수 선언은 자동으로 코드의 맨 위로 올라간다.
// 따라서 아래 함수를 사용하는 코드가 함수 정의 위에 있어도 된다.
function plus(v1, v2) {
  return v1 + v2;
}