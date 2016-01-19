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
    'delete from board where title=?', 
    ['okok'],
    function(err, rows, fields) { // 서버에서 결과를 받았을 때 호출되는 함수
      if (err) throw err;

        console.log("삭제성공!");
        
    });

connection.end();
