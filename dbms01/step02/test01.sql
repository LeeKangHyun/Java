/* 주제: 테이블 변경하기
 */

-- 1) 테이블 생성
CREATE TABLE test08 (
  name VARCHAR(20)
);

insert into test08(name) values('aaa');
insert into test08(name) values('bbb');
insert into test08(name) values('ccc');

-- 2) 테이블에 컬럼 추가
alter table test08
add column tel VARCHAR(20);

-- 3) 테이블에 여러 개의 컬럼 추가
alter table test08
add column age INT,
add column email VARCHAR(100);

-- 4) 테이블 컬럼 제거
alter table test08
drop column email;

alter table test08
drop tel; -- column 생략 가능

-- 5) 테이블 컬럼 이름 변경 및 정의 변경
alter table test08
change column name okname VARCHAR(20);

alter table test08
change column okname name VARCHAR(30);

-- 6) 테이블 컬럼 정의만 변경
alter table test08
modify column name VARCHAR(40);

-- 현재 들어있는 값 보다 작은 크기로 컬럼의 데이터를 변경하려 한다면 오류 발생!
alter table test08
modify column name VARCHAR(2);

-- 오류! 현재 등록된 값을 지정된 데이터형으로 바꿀 수 없다면, 오류 발생!
alter table test08
modify column name int;

-- age 컬럼의 값은 모두 null이기 때문에 타입을 변경해도 문제가 없다. 그래서 OK!
alter table test08
modify column age VARCHAR(20);

-- 원상복귀(원복)
alter table test08
modify column age int;

-- 데이터가 들어 있는 컬럼을 삭제하려 한다면? 다른 테이블과 연결된 컬럼이 아니면 삭제된다.
alter table test08
drop column name;




