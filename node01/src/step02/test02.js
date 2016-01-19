//select 실행

var mysql      = require('mysql');
var connection = mysql.createConnection({
  host     : 'localhost',
  user     : 'java76',
  password : '1111',
  database : 'java76db'
});

connection.connect();
console.log("연결 되었음.");

//select 질의하기
connection.query(
    'select * from board', 
    function(err, rows, fields) { // 서버에서 결과를 받았을 때 호출되는 함수
      if (err) throw err;

      for (var i = 0; i < rows.length; i++) {
        console.log(rows[i].bno, rows[i].title);
      }
    });

connection.end();
console.log("연결 끊었음.");