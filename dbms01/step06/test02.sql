/* NATURAL JOIN (CARTESIAN 조인) 
 * - 두 개의 테이블을 조건에 따라 결합한다.
 */

/* 매니저 정보를 출력하라!
 * - 매니저번호, 이름, 이메일, 직급코드, 직급
 */

/* 매니저 정보와 직급 데이터를 결합하여 출력 */
select t1.mno,t1.name,t1.email,t1.level,t2.name
from managers as t1, lvl_code as t2
where t1.level = t2.lid;

/* 조인 표준 문법 사용 
 * - 두 테이블의 이름이 같은 컬럼을 비교하여 결합한다. 
 * - 만약 같은 이름을 갖는 컬럼이 없다면 natural join 불가!
 * - 실무에서는 이름이 같은 컬림어 없거나 여러 개일 가능성이 많기 때문에 
 *   natural join을 사용하지 않는다.
 *   대신 join ~ using 문법을 사용한다.
 */

select t1.mno,t1.name,t1.email,t1.level,t2.name
from managers as t1 natural join lvl_code as t2;

/* lvl_code 테이블의 lid 컬럼 이름을 강제로 다른 이름으로 바꾼 다음에 조인하기 */
select t1.mno,t1.name,t1.email,t1.level,t2.title
from managers as t1 
    natural join (select lid as level, name as title from lvl_code) t2;

    
/* JOIN ~ USING 
 * - 조인 조건이 되는 컬럼을 지정한다.
 */
select t1.mno,t1.name,t1.email,t1.level,t2.name
from managers as t1 natural join lvl_code as t2;
    













