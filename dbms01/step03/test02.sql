-- 데이터 입력

-- 1) 모든 컬럼 값 입력
-- 데이터 입력할 컬럼을 지정하지 않으면 테이블 정의할 때 선언된 순서대로 값을 설정한다.
insert into board values(0, 'aaaa', '1255555', 0, now(), null);
insert into board values(null, 'bbbb', 'xxxxxxx', 0, now(), null);

-- 무조건 모든 항목의 값을 지정해야 한다. 다음과 같이 한 항목의 값을 빠뜨리면 오류 발생!
insert into board values('bbbb', 'xxxxxxx', 0, now(), null);  -- 오류!

-- 2) 특정 칼럼의 값 입력
insert into board(title, content,cre_dt) values('cccc','xxxxx',now()); 

-- 3) 다른 테이블의 조회 결과를 입력할 수 있다.
-- 단 조회 결과의 컬럼 타입과 입력 테이블의 컬럼 타입이 일치해야 한다.
insert into board(title, content, cre_dt)
select email, name, now() from test15;


















