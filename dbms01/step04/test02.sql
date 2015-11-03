-- 날짜 데이터 출력 형식 다루기

-- 1) mm/dd/yyyy
select bno, title, date_format(cre_dt, '%m/%d/%Y') as createdDate
from board;

-- 2) 날짜 계산하기
select bno, title, cre_dt, adddate(cre_dt , 7)
from board;

select datediff('2015-11-03', '1992-10-18');