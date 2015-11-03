-- 데이터 조회하기

-- 1) wild card selector(*)
-- 조회 결과로 모든 컬럼의 값을 선택한다.
-- 컬럼의 순서는 테이블을 정의할 때 선언한 순서를 따른다.
select * from board;

-- 2) 특정 컬럼만 선택
select bno, title from board;

-- 컬럼의 순서는 마음대로 
select title, views, bno from board;

-- 3) 조회 결과의 컬럼 라벨 명을 변경하기
select bno as boardNo, title, views as viewCount from board;
-- as 생략 가능
select bno boardNo, title, views viewCount from board;

-- 4) 조회 조건 설정하기
update board set views=11 where bno=2;
update board set views=5 where bno=3;
update board set views=7 where bno=5;

-- 숫자 비교
select bno, title, views
from board
where views > 6;

-- 문자열 비교
select bno, title, content, views
from board
where title='cccc';

-- 특정 문자열로 시작하는 경우
select bno, title, content, views
from board
where title like 'ccc%';

-- 특정 문자열로 끝나는 경우
select bno, title, content, views
from board
where title like '%.com';

-- 특정 문자열을 포함하는 경우 (조회속도가 가장 느리다)
select bno, title, content, views
from board
where title like '%c%';

-- 특정 문자만 와일드 카드 적용
insert into board(title, content, cre_dt) values('ddddd@test.com', 'xxxx', now());

select bno, title, content, views
from board
where title like '___@test.com';  -- @앞에 세글자만 허용.

-- and 조건
select bno, title, content, views
from board
where title like '%c%' and views > 0;

-- or 조건
select bno, title, content, views
from board
where title like '%c%' or views > 0;

-- in 조건
select bno, title, content, views
from board
where title in ('aaaa', 'cccc', 'dddd@test.com');

select bno, title, content, views
from board
where views in (2, 3, 5, 7);

-- 문자열 결합하기
-- 출력 결과 : 제목(조회수)
select concat(title, '(', views, ')') as titleWithViews
from board;

-- 실해 순서
-- from --> where --> select
select bno, title
from board
where views > 0;







