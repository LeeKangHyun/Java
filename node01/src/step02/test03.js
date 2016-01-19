//insert 실행

var mysql      = require('mysql');
var connection = mysql.createConnection({
  host     : 'localhost',
  user     : 'java76',
  password : '1111',
  database : 'java76db'
});

connection.connect();

//insert 질의하기
connection.query(
    'insert into board(title,content,cre_dt) values(?, ?, now())', 
    ['title...', 'content...'], // in-parac
    function(err, rows, fields) { // 서버에서 결과를 받았을 때 호출되는 함수
      if (err) throw err;

        console.log("입력성공!");
        
    });

connection.end();

