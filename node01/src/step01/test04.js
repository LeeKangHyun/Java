// 웹 서버 만들기
// 1) HTTP 라이브러리 객체 임포트
var http = require('http');

// 2) HTTP 요청을 처리할 객체를 준비한다.
// => http.createServer([요청이 들어올 때 마다 호출되는 함수])
var httpServer = http.createServer(function(request, response) {
  console.log("ohora...");
  
  // 주의! 응답을 완료하고 싶으면 반드시 다음의 명령을 실행하라!
  response.end();
});

// 3) HTTP 서버 실행하기
httpServer.listen(8989);

console.log("서버 실행중...");

