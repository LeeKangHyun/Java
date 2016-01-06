/* JOIN ~ ON
 * - 조인 조건을 기술한다.
 */
    
/* 매니저 정보를 출력하라!
 * - 매니저번호, 이름, 이메일, 직급코드, 직급
 */

select t1.mno,t1.name,t1.email,t1.level,t2.name
from managers as t1 join lvl_code t2 on t1.level = t2.lid;














