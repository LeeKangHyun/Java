// URL 상세 정보 추출하기
var http = require('http');
var url = require('url'); // URL 분석기 준비
var querystring = require('querystring'); // 쿼리 스트링 분석기 준비

var httpServer = http.createServer(function(request, response) {
  
  var urlInfo = url.parse(request.url);

  response.writeHead(200, {// 응답헤더
    'Content-Type': 'text/html; charset=UTF-8'
  });
  
  if (urlInfo.pathname != '/calc') {
    response.write("<!DOCTYPE html>\n");
    response.write("<html>\n");
    response.write("<head>\n");
    response.write("<meta charset=\'UTF-8\'>\n");
    response.write("<title>오류</title>\n");
    response.write("</head>\n");
    response.write("<body>\n");
    response.write("<h1>오류</h1>\n");
    response.write("</body>\n");
    response.write("</html>\n");
    response.end();
    return;
  }
  
  response.write("<!DOCTYPE html>\n");
  response.write("<html>\n");
  response.write("<head>\n");
  response.write("<meta charset=\'UTF-8\'>\n");
  response.write("<title>테스트</title>\n");
  response.write("</head>\n");
  response.write("<body>\n");
  response.write("<h1>연산결과</h1>\n");
  
  
  var params = querystring.parse(urlInfo.query);
  var a = parseInt(params.a), b = parseInt(params.b), op = params.op;
  var sum;
  
  if (op == '+') {
    sum = a + b;
  }
  else if (op == '-') {
    sum = a - b;
  }
  else if (op == '*') {
    sum = a * b;
  }
  else if (op == '/') {
    sum = a / b;
  }
  
  response.write(a + ' ' + op + ' ' + b + ' = ' + sum);

  
  response.write("</body>\n");
  response.write("</html>\n");
  
  response.end();
});

httpServer.listen(8989);
console.log("서버 실행중...");

