//응답하기
var http = require('http');

var httpServer = http.createServer(function(request, response) {
  response.writeHead(200, {// 응답헤더
    'Content-Type': 'text/plain; charset=UTF-8'
  });
  response.write("Hello\n");
  response.write("안녕하세요\n");
  response.end();
});

httpServer.listen(8989);
console.log("서버 실행중...");

