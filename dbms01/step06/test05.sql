/* OUTER JOIN ~ ON
 * - JOIN ~ ON 에서는 조건에 해당되지 않는 데이터는 결과에서 제외된다.
 * - OUTER JOIN 에서는 조인 조건에 해당되지 않는 데이터도 결과에 포함 시킨다.
 *   조건에 맞는 데이터가 상대 테이블에 없다 하더라도 질의 결과에 포함하고 싶다면,
 *   결과 생성시 기준이 되는 테이블을 지정하라!
 *   LEFT 또는 RIGHT로 가리킬 수 있다.
 */
    
/* 모든 강의를 출력
 * - 과정번호, 강의명, 매니저 번호, 매니저명
 */

/* 기준 테이블 지정 전 */
select t1.lno,t1.title,t1.mno,t2.name
from lectures as t1 join managers as t2 on t1.mno = t2.mno;

/* 기준 테이블 지정 후 */
select t1.lno,t1.title,t1.mno,t2.name
from lectures as t1 left outer join managers as t2 on t1.mno = t2.mno;

/* 매니저를 기준으로 매니저가 관리하는 강의 목록을 뽑아내기 */
select t1.lno,t1.title,t1.mno,t2.name
from lectures as t1 right outer join managers as t2 on t1.mno = t2.mno;











