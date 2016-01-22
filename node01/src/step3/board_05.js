//요청 핸들러를 맵으로 관리한다.
var http = require('http');
var mysql = require('mysql');
var url = require('url');
var dateFormat = require('dateformat');

//1) DB 커넥션 준비
var connection = mysql.createConnection({
    host     : 'localhost',
    user     : 'java76',
    password : '1111',
    database : 'java76db'
});

connection.connect();

//요청 핸들러 맵 객체를 준비한다.
var handlerMap = {};

handlerMap["/board/list.do"] = function(request, response) {
    var urlInfo = url.parse(request.url, true);
    response.writeHead(200, {
        'Content-Type': 'text/html; charset=UTF-8'
    });

    connection.query('select bno, title, views, cre_dt from board', 
            function(err, rows, fields) {
        if (err) throw err;
        response.write("<!DOCTYPE html>\n");
        response.write("<html>\n");
        response.write("<head>\n");
        response.write("<meta charset=\'UTF-8\'>\n");
        response.write("<title>게시판</title>\n");
        response.write("</head>\n");
        response.write("<body>\n");
        response.write("<h1>게시물 목록</h1>\n");
        response.write("<table border='1'>\n");
        response.write("<tr>\n");
        response.write("<th>번호</th><th>제목</th><th>조회수</th><th>작성일</th>");
        response.write("</tr>\n");

        for (var i = 0; i < rows.length; i++) {
            response.write("<tr>\n");
            response.write("<td>" + rows[i].bno +"</td>\n");
            response.write("<td><a href='detail.do?no=" + rows[i].bno + "'>" 
                    + rows[i].title + "</a></td>\n");
            response.write("<td>" + rows[i].views + "</td>\n");
            response.write("<td>" + dateFormat(rows[i].cre_dt, "yyyy-m-dd") + "</td>\n");
            response.write("</tr>\n");
        } 
        response.write("</table>\n");
        response.write("</body>\n");
        response.write("</html>\n");
        response.end();
    });
};

handlerMap["/board/detail.do"] = function(request, response) {
    var urlInfo = url.parse(request.url, true);
    response.writeHead(200, {
        'Content-Type': 'text/html; charset=UTF-8'
    });

    connection.query('select bno, title, content, views, cre_dt '
        + 'from board where bno=' + urlInfo.query.no, 
        function(err, rows, fields) { // 서버에서 결과를 받았을 때 호출되는 함수
            if (err) throw err;
            response.write("<!DOCTYPE html>\n");
            response.write("<html>\n");
            response.write("<head>\n");
            response.write("<meta charset=\'UTF-8\'>\n");
            response.write("<title>게시판</title>\n");
            response.write("</head>\n");
            response.write("<body>\n");
            response.write("<h1>게시물 목록</h1>\n");

            response.write("<table border='1'>\n");

            response.write("<tr>\n");
            response.write("  <th>번호</th>\n");
            response.write("  <td><input type='text' name='no' value='" + rows[0].bno + "'></td>\n");
            response.write("</tr>\n");
            response.write("<tr>\n");
            response.write("  <th>제목</th>\n");
            response.write("  <td><input type='text' name='title' value='" + rows[0].title + "'></td>\n");
            response.write("</tr>\n");
            response.write("<tr>\n");
            response.write("  <th>내용</th>\n");
            response.write("  <td><textarea rows='5' cols='50'>" + rows[0].content + "</textarea></td>\n");
            response.write("</tr>\n");
            response.write("<tr>\n");
            response.write("  <th>조회수</th>\n");
            response.write("  <td>" + rows[0].views + "</td>\n");
            response.write("</tr>\n");
            response.write("<tr>\n");
            response.write("  <th>등록일</th>\n");
            response.write("  <td>" + dateFormat(rows[0].cre_dt, "yyyy-m-dd") + "</td>\n");
            response.write("</tr>\n");

            response.write("</table>\n");
            response.write("<p><a href='delete.do?no=" + rows[0].bno + "'>삭제</a></p>\n");
            response.write("</body>\n");
            response.write("</html>\n");
            response.end();
        }
    );
};

handlerMap["/board/delete.do"] = function(request, response) {
    var urlInfo = url.parse(request.url, true);
    connection.query('delete from board where bno=?', [urlInfo.query.no],
        function(err, rows, fields) {
          if (err) throw err;
          response.writeHead(302, {
              'Location': '/board/list.do'
          });
          response.end();
    });
}

function notSupport(request, response) {
    response.writeHead(200, {
        'Content-Type': 'text/html; charset=UTF-8'
    });

    response.write("<!DOCTYPE html>\n");
    response.write("<html>\n");
    response.write("<head>\n");
    response.write("<meta charset=\'UTF-8\'>\n");
    response.write("<title>오류</title>\n");
    response.write("</head>\n");
    response.write("<body>\n");
    response.write("<h1>해당 URL을 지원하지 않습니다.</h1>\n");
    response.write("</body>\n");
    response.write("</html>\n");
};

//2) HTTP 서버 준비 
var httpServer = http.createServer(function(request, response) {
    var urlInfo = url.parse(request.url, true);

    var handler = handlerMap[urlInfo.pathname];

    if (handler) {
        handler(request, response);
    } else {
        notSupport(request, response);
    }
});

//3) HTTP 서버 가동
httpServer.listen(8989);
console.log("서버 실행중...")

