// HTML 출력하기
var http = require('http');

var httpServer = http.createServer(function(request, response) {
  console.log("요청처리");
  
  response.writeHead(200, {// 응답헤더
    'Content-Type': 'text/html; charset=UTF-8'
  });
  response.write("<!DOCTYPE html>\n");
  response.write("<html>\n");
  response.write("<head>\n");
  response.write("<meta charset=\'UTF-8\'>\n");
  response.write("<title>테스트</title>\n");
  response.write("</head>\n");
  response.write("<body>\n");
  response.write("<h1>node.js 테스트</h1>\n");
  response.write("<p>안녕하세요!</p>\n");
  response.write("</body>\n");
  response.write("</html>\n");
  
  response.end();
});

httpServer.listen(8989);
console.log("서버 실행중...");

