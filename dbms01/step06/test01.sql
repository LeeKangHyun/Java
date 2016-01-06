/* CROSS JOIN (CARTESIAN 조인) 
 * - 두 개의 테이블을 곱한다.
 */

/* 매니저 정보를 출력하라!
 * - 매니저번호, 이름, 이메일, 직급코드, 직급
 */

/* 1) 매니저 정보 출력 */
select mno,name,email,level
from managers;

/* 2) 직급 정보를 출력 */
select lid,name from lvl_code;

/* 매니저 정보와 직급 데이터를 결합하여 출력 */
select t1.mno,t1.name,t1.email,t1.level,t2.name
from managers as t1, lvl_code as t2;

/* 조인 표준 문법 사용 */
select t1.mno,t1.name,t1.email,t1.level,t2.name
from managers as t1 cross join lvl_code as t2;














