//updata 실행

var mysql      = require('mysql');
var connection = mysql.createConnection({
  host     : 'localhost',
  user     : 'java76',
  password : '1111',
  database : 'java76db'
});

connection.connect();

//select 질의하기
connection.query(
    "update board set title=? where title = 'title...'", 
    ['okok'], // in-parac
    function(err, rows, fields) { // 서버에서 결과를 받았을 때 호출되는 함수
      if (err) throw err;

        console.log("변경 성공!");
        
    });

connection.end();
