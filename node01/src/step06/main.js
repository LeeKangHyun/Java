const http = require('http');
const mysql = require('mysql');
const url = require('url');
const board = require('./board.js');

const pool = mysql.createPool({
    connectionLimit : 10,
    host     : 'localhost',
    user     : 'java76',
    password : '1111',
    database : 'java76db'
});

//커넥션풀에 새 커넥션이 생성되면 connection 이벤트가 발생한다.
pool.on('connection', function() {
    console.log("커넥션 객체가 생성되었음.");
});

var handlerMap = {};

// board 객체에 들어있는 요청핸들러를 handlerMap으로 복사한다.
registerHandler(board(pool));

function registerHandler(handlerObj) {
    for (var pathname in handlerObj) {
        handlerMap[pathname] = handlerObj[pathname];
    }
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

var httpServer = http.createServer(function(request, response) {
    var urlInfo = url.parse(request.url, true);
    response.writeHead(200, {
        'Content-Type': 'text/html; charset=UTF-8'
    });

    var handler = handlerMap[urlInfo.pathname];

    if (handler) {
        handler(request, response);
    } else {
        notSupport(request, response);
    }
});

httpServer.listen(8989);
console.log("서버 실행중...")
