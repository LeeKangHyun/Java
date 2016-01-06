/* 연습
 */
    
/* 1) 다음과 같이 강의 정보를 출력하라!
 * - 강의번호, 강의명, 매니저명(직급명), 강의분류, 강의실
 */

select t1.lno, t1.title, concat(t2.name,'(',t3.name,')'), t4.ctid, t5.cid
from lectures as t1 
left outer join managers as t2 on t1.mno = t2.mno
left outer join lvl_code as t3 on t2.level = t3.lid
left outer join cat_code as t4 on t1.categ = t4.ctid
left outer join classes as t5 on t1.cid = t5.name;


/* 2) 서브 쿼리를 이용하여 매니저 이름과 직급을 출력하라 */
select 
	m.mno,
	m.name,
	m.level,
	(select name from lvl_code where lid=m.level) as position
from managers m;
 

/* 3) 직급이 사원인 매니저가 담당하는 모든 강의를 출력하라 */
select l.lno, l.title, l.categ
from lectures as l
where l.mno in (select mno from managers where level = 'LC001');














