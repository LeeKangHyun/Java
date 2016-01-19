// URL 상세 정보 추출하기
var http = require('http');
var url = require('url'); // URL 분석기 준비

var httpServer = http.createServer(function(request, response) {
  
  if (request.url == '/favicon.ico') {
    response.end();
    return;
  }

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
  response.write("<h1>URL 상세정보</h1>\n");
  
  // URL 분석기를 통해 분석한 결과 얻기
  var urlInfo = url.parse(request.url);
  
  // URL 분석 결과 
  response.write("urlInfo.href=" + urlInfo.href + "<br>\n");
  response.write("urlInfo.pathname=" + urlInfo.pathname + "<br>\n");
  response.write("urlInfo.search=" + urlInfo.search + "<br>\n");
  response.write("urlInfo.query=" + urlInfo.query + "<br>\n");
  
  response.write("</body>\n");
  response.write("</html>\n");
  
  response.end();
});

httpServer.listen(8989);
console.log("서버 실행중...");

