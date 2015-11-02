/* 주제: default 값 지정
 */

-- 1) 테이블 생성
CREATE TABLE test11 (
  email VARCHAR(100),
  name VARCHAR(20) not null default '홍길동',
  age INT default 20,
  tel VARCHAR(20),
  constraint test09_pk primary key (email)
);

-- 데이터 입력
-- 기본 값이 있는 not null 컬럼이라도 값을 생략할 수 있다.
insert into test11(email) values('aaa@test.com');
insert into test11(email, name) values('bbb@test.com', '임꺽정');