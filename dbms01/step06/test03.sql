/* JOIN ~ USING 
 * - 조인 조건이 되는 컬럼을 지정한다.
 * - 조인할 테이블에 같은 이름의 컬럼이 여러 개 있을 때 유용하다.
 *   그 컬럼들 중에서 조인 조건으로 사용할 컬럼을 지정할 수 있다.
 */
    
/* 매니저 정보를 출력하라!
 * - 매니저번호, 이름, 이메일, 직급코드, 직급
 */

select t1.mno,t1.name,t1.email,t1.level,t2.name
from managers as t1 
    join (select lid as level, name from lvl_code) t2
    using (level);














