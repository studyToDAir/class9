-- 한줄 주석

/* 범위 주석  */
/* 
    여러줄
    주석
*/

-- SQL : Structured Query Language

select * from emp;
select * from dept;

select * from emp;

-- 이름과 급여만 출력
select 
    sal, 
    ename,
    123,
    'a'
  from 
    emp;

select
    deptno
from emp;

select
    distinct deptno
from emp;

select
    job, deptno
from emp;

select
    distinct job, deptno
from emp;


select * from emp, dept;

select
    sal as 월급, sal * 12 "연 봉"
from emp;

select
    ename, sal,
    sal*12+comm as s1, 
    sal*12+comm s2,
    sal*12+comm "s s", -- sql에서 유일하게 "가 들어가는 곳
    comm as 추가수당
from emp;

-- sal 컬럼을 기준으로 오름차순 - 작은 것 부터 큰 것 순서로
select * from emp
order by sal;

select * from emp
order by sal asc;


-- sal 컬럼 기준으로 내림차순 - 크 것부터
select * from emp
order by sal desc;

-- 가장 먼저 입사한 순서로 출력
select * from emp
order by hiredate asc;

select * from emp
order by ename desc;

-- 부서번호로 오름차순, 겹치면 sal 내림차순
select * from emp
order by deptno asc, sal desc;
-- deptno asc, sal desc;이 상황에서 연봉으면 사원번호 내림차순 정렬
select * from emp
order by deptno asc, sal desc, empno desc;

select * 
from emp
where deptno = 30;

select * 
from emp
where deptno = 30
order by sal;

-- sal이 1600인 사람만 출력
select * from emp where sal = 1600;

-- 초과
select * from emp where sal > 1600;

-- 이상
select * from emp where sal >= 1600;  -- =이 오른쪽

-- 이하
select * from emp where sal <= 1600;  -- =이 오른쪽

-- 부정
select * from emp where deptno != 30;
select * from emp where deptno <> 30;

-- AND
select *
from emp
where
    deptno = 30 and job = 'SALESMAN';

-- OR
/*
    emp 테이블에서 
    부서번호deptno가 30 이거나(또는) job이 CLERK인 사원의
    모든 정보를 출력하라
*/
select *
from emp
where
    deptno = 30 or job = 'CLERK';
    
/*
    job이 CLERK이거나 sal이 2000 초과면서 deptno가 10인 사원 조회
*/
select * from emp
where 
    job = 'CLERK' or sal > 1000 and deptno = 10;

select * from emp
where job = 'CLERK' or ( sal > 1000 and deptno = 10 );

select * from emp
where not (job = 'CLERK' or ( sal > 1000 and deptno = 10 ));

/*
    deptno != 30, deptno <> 30, deptno ^= 30, not deptno = 30
*/
-- 월급 2000이상 4000미만인 사원을 출력하시오
select * from emp
where sal >= 2000 and sal < 4000;
-- 2000 <= sal < 4000
--where 2000 <= sal and sal < 4000;

-- 부서번호 10 또는 20인 사원만 출력
select * from emp
where deptno = 10 or deptno = 20;

select * from emp
where deptno in ( 10, 20 );

select * from emp
where deptno not in ( 10, 20 );

--1. 부서번호 10번인 사람들을 출력
select * from emp
where deptno = 10;

--2. 부서번호 10번이 아닌 사람들을 출력
select * from emp
--where not (deptno = 10);
--where deptno != 10;
where deptno <> 10;

--3. 급여가 3000 이상인 사람들을 출력
select * from emp
where sal >= 3000;

--4. 급여가 1500~3000 사이(포함)의 사람을 출력
select * from emp
where sal >= 1500 and sal <= 3000;

--5. 부서번호 10번인 사람 중 급여 2000 이상인 사람을 출력
select * from emp
where deptno = 10 and sal >= 2000;

--6. 부서번호 30번 중 1500~3000 사이(미포함)인 사람을 출력
select * from emp
where 
    deptno = 30 
    and ( sal > 1500 and sal < 3000 );

--7. 부서번호 30번 중 1500~3000 사이(미포함)인 사람을 연봉이 작은 순으로 출력, 연봉이 같은 경우 이름이 빠른 순으로 출력
select * from emp
where 
    deptno = 30 
    and ( sal > 1500 and sal < 3000 )
--order by sal asc, ename asc
order by sal, ename;

--8. 부서번호 20,30번 중 1500~3000 사이(미포함)인 사람을 연봉이 작은 순으로 출력, 연봉이 같은 경우 이름이 빠른 순으로 출력
select * from emp
--where deptno = 20 or deptno = 30
-- 같은 컬럼이 = 과 or로 연결되어 있는 경우 IN 으로 변경할 수 있다
where 
    deptno in (20, 30)
    and ( sal > 1500 and sal < 3000 )
order by sal, ename;

select * from emp
where (deptno = 20 or deptno = 30) and ( sal > 1500 and sal < 3000 )
order by sal, ename;

--9. 부서번호가 20 또는 30이고 급여가 1500 이상인 직원의 이름과 급여를 급여 오름차순으로 출력하라.
select ename, sal from emp
where deptno in (20, 30)
and sal >= 1500
order by sal;

-- between
select * from emp
where sal between 2000 and 3000;

select * from emp
where sal between 2000 and 3000
and deptno = 20;

select * from emp
where sal not between 2000 and 3000 and deptno not in (10, 20);

-- 2000 초과, 3000 미만
select * from emp
where sal between 2000 and 3000
and sal != 2000
and sal != 3000;

-- like
select * from emp
where ename like 'S%';

-- 첫번째 상관없음
-- 두번째 무조건 L
-- 그 이후 상관없음
select * from emp
where ename like '_L%';

select * from emp
where ename like '%AM%';

select * from emp
where ename like '%A%';

select * from emp
where ename not like '%A%';

select * from emp
where not ename like '%A%';

select * from emp
where ename like '%A%S%' or ename like '%S%A%';

select * from emp
where ename like '%A%' or  ename like '%a%';

select comm from emp;

-- null
select * from emp
where comm > 400;

-- 안된다
select * from emp
where comm = '(null)';
select * from emp
where comm = null;

select * from emp
where comm is null;

select * from emp
where mgr is null;

select * from emp
where comm is not null;

select * from emp where deptno = 10;
select * from emp where deptno = 20;

select * from emp where deptno = 10
union
select * from emp where deptno = 20;


select * from emp where deptno = 10
union
select * from emp where deptno = 10;

select * from emp where deptno = 10
union all
select * from emp where deptno = 10;


select empno from emp
union all
select sal from emp;

select empno from emp
union all
select ename from emp;


-- 부서 10번을 사원번호 내림차순desc으로 정렬하여 출력
select * from emp where deptno = 10
order by empno desc;
-- 부서 20번을 사원번호 오름차순으로 정렬하여 출력
select * from emp where deptno = 20
order by empno asc;

-- 아직 안배운 기술로 order by 적용 가능
select * from (
    select * from emp where deptno = 10
    union all
    select * from emp where deptno = 20
)
order by empno asc;


-- Q5
-- 이름, 번호, 급여, 부서를 출력하기
-- 이름에 E 포함, 부서는 30, 급여 1000~2000가 아닌!
select ename, empno, sal, deptno
from emp
where
    ename like '%E%'
    and deptno = 30
    and not (sal >= 1000 and sal <= 2000);

-- Q6
-- 추가수당 null, mgr null이 아니고, 직책은 m,c, 이름에 두번째 글씨가 L이 아닌!!
select * from emp
where
    comm is null
    and mgr is not null
    and job in ('MANAGER', 'CLERK')
    and ename not like '_L%';

-- upper, lower
select ename, upper(ename), lower(ename) from emp;

select ename from emp
where lower(ename) like lower('%aM%');


select upper('aBc'), lower('aBc'), upper( lower('aBc') ) from dual;

select ename, length(ename) from emp;

select * from emp
where length(ename) = 5;


select lengthb('a'), lengthb('가낡') from dual;

desc emp;

-- substr
select job, substr(job, 1, 2), substr(job, 3, 2), substr(job, 5) from emp; 
-- 사원 이름을 두번째 부터 3글자만 출력
select substr(ename, 2, 3) from emp;
select substr(ename, 2, 300) from emp;
select substr(ename, 20, 300) from emp; -- 실제 글씨 길이 보다 넘어가면 null

select job, substr(job, -3, 2) from emp;
select job, substr(job, -30, 2) from emp;
-- 이름의 마지막 3글자만 출력하기
select ename, substr(ename, -3, 10) from emp;
select ename, substr(ename, -3) from emp;

select 'a-b-c',
    replace('a-b-c', '-', '😍'),
    replace('a-b-c', '-'),
    replace('a-b-c', '-', '')
from emp;
-- ename의 A를 '-' 모두 교체
select ename, replace(ename, 'A', '-') from emp;
select ename, replace(ename, 'TT', '-3131351531') from emp;

-- lpad
-- 모자르면 채우고
-- 넘어가면 자르고
select lpad(ename, 5, '+') from emp;
-- replace 사용하지 말고 풀기
-- 문제1
-- ename에 앞에 두글자만 출력
select ename, substr(ename, 1, 2), rpad(ename, 2) from emp;

-- 문제2
-- 앞에 두글자만 원본을 출력하고 나머지는 4개의 *로 표시
select
    rpad(
        substr(ename, 1, 2),
        6,
        '+-+-+-+-+-'
    )
from emp;

-- 문제3
-- 사원 이름 두글자만 보이고 나머지는 *로. 단, 원래 이름 길이 만큼 표시
-- 예 : WA**, SM***
select
    ename, 
    rpad(
        substr(ename, 1, 2),
        length(ename),
        '*'
    )
from emp;

-- 심화?
-- job을 총 20자 중 가운데 정렬

select 'ab'||'cd' || 'ef' from dual;
select empno || ' : ' || ename from emp; 

-- trim
select '  ab c   ', trim('  ab c   ') from dual; 

-- round
select
    round(14.46), -- 하나만 입력하면 소수점 첫째자리 반올림
    round(14.46, 1), -- 소수점 두번째 자리부터 1
    round(14.46, -1) -- 음수일 때 정수로 거슬러 올라간다
from dual;

select
    trunc(14.46),
    trunc(14.46, 1),
    trunc(14.46, -1),
    trunc(-14.46)
from dual;

select
    ceil(3.14),
    floor(3.14),
    ceil(-3.14),
    floor(-3.14),
    trunc(-3.14)
from dual;
;
select 7 / 3 from dual;;;;;;;; 
select 7 / 0 from dual;

select mod(7, 3) from dual;
select mod(8, 3) from dual;
select mod(9, 3) from dual;

-- 각 사원의 연봉을 출력
-- 월급 * 12 + comm
-- ename, total_pay 출력

select job, sal,
        decode(job,
            'MANAGER', sal*1.1,
            'SALEMAN', sal*1.05,
            'ANALYST', sal,
            sal*1.03) as upsal
from emp;

select job, sal,
    case job
        when 'MANAGER' then sal*1.1
        when 'SALEMAN' then sal*1.05
        when 'ANALYST' then sal
        else sal * 1.03
    end as upsal
from emp;

-- nvl 사용하지 않고
-- decode, case로 nvl이랑 동일한 결과 출력하기
select comm,
    nvl(comm, -1), 
    decode(comm,
        null, -1,
        comm) as decode,
    case comm
        when null then -1
        else comm
    end as case
from emp;

-- where comm = null
select comm,
    case
        when comm is null then '해당 없음'
        when comm = 0 then '0원'
        when comm > 0 then '수당 : ' || comm
    end as case
from emp;

select comm,
    case
        when comm is null then '해당 없음'
        when comm is null then 'X'
        when comm = 0 then '0원'
        when comm > 0 then '수당 : ' || comm
    end as case
from emp;

-- Q1
select
    empno, substr(empno, 1,2) || '**' as masking_empno,
    ename, rpad( substr(ename, 1,1), length(ename), '*') as masking_ename
from emp
where
    length(ename) >= 5
    and length(ename) < 6;

-- Q2
select
    empno, ename, sal,
    trunc(sal / 21.5, 2) day_pay,
    round((sal / 21.5) / 8, 1) as time_pay
from emp;

-- Q4
select empno, ename, mgr,
    case
        when mgr is null then '0000'
        when substr(mgr, 1, 2) = 75 then '5555'
        when substr(mgr, 1, 2) = 76 then '6666'
        when substr(mgr, 1, 2) = 77 then '7777'
        when substr(mgr, 1, 2) = 78 then '8888'
        else to_char(mgr) -- '' || mgr
    end
from emp;

select empno, ename, mgr,
    case
        when mgr is null 
        then '0000'
        
        when mgr is not null 
        then
            case substr(mgr, 1, 2)
                when '75' then '5555'
                when '76' then '6666'
                when '77' then '7777'
                when '78' then '8888'
                else to_char(mgr)
            end
    end
from emp;


select empno, ename, mgr,
    case substr(mgr, 1, 2)
        when '75' then '5555'
        when '76' then '6666'
        when '77' then '7777'
        when '78' then '8888'
        else to_char(  nvl(mgr, '0000')  )
    end
from emp;


select 
    case
        when mgr is null 
            then '0000'
        when substr(mgr, 2, 1) in ('5', '6', '7', '8') 
            then lpad( substr(mgr, 2, 1), 4, substr(mgr, 2, 1) )
        else '' || mgr
    end
from emp;

-- sum
select
    sum(sal)
from emp;

select sal from emp;

select
    sum(sal)
from emp
where deptno = 10;

select
    sal, sum(sal)
from emp;

select sum(comm) from emp;

select count(*), sum(sal) from emp;

select count(sal), count(comm) from emp;

select max(sal), min(sal), min(hiredate), min(comm) from emp;
-- 이름에 a가 들어가는 사람은 몇명?

select count(*) from emp
where ename like '%A%';

select avg(sal) from emp;

-- 다중행 함수(집계 함수)는 where에서 사용할 수 없다
--select  *
--from emp
--where sal > avg(sal);

select deptno
from emp
group by deptno;

select deptno, sum(sal), count(*)
from emp
group by deptno;

select job from emp
group by job;

select deptno, job, count(*)
from emp
group by deptno, job;

select deptno, job, count(*), ename
from emp
group by deptno, job, ename;


select job 
from emp
where deptno = 10
group by job
order by job desc;

select job, deptno
from emp
group by deptno, job
having deptno = 10;

select job, deptno, avg(sal)
from emp
group by deptno, job;

select job, deptno, avg(sal)
from emp
group by deptno, job
having avg(sal) > 2000;

select job, count(*) as cnt
from emp
where sal > 1000-- and cnt >= 3 -- and count(*) >= 3
group by job
having count(*) >= 3
order by cnt desc;

------------------------------------
select * from dept;

select *
from emp, dept
order by empno;

select *
from emp, dept
where emp.deptno = dept.deptno
order by empno;

select *
from emp e, dept d
where e.deptno = d.deptno
order by empno;


--select ename, deptno
--from emp e, dept d
--where e.deptno = d.deptno;

select ename, e.deptno
from emp e, dept d
where e.deptno = d.deptno;

select ename, e.deptno
from scott4_0.emp e, dept d
where e.deptno = d.deptno;

select * from salgrade;
select grade, salgrade.* from salgrade;

select s.grade, e.*, s.*
from emp e, salgrade s
where e.sal >= s.losal and e.sal <= s.hisal
;

select * from emp;

select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename
from emp e1, emp e2
where e1.mgr = e2.empno;
-- 총 13개 나옴
select count(*)
from emp e1, emp e2
where e1.mgr = e2.empno;

select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename
from emp e1, emp e2
where e1.mgr = e2.empno(+);
--where e2.empno(+) = e1.mgr;

select e1.empno, e1.ename, e1.mgr, e2.empno, e2.ename
from emp e1, emp e2
where e1.mgr(+) = e2.empno;

select empno, ename, deptno /*, d.deptno */
from emp e join dept d using(deptno)
where sal >= 3000;

select empno, ename, e.deptno /*, deptno */
from emp e join dept d on(e.deptno = d.deptno)
where sal >= 3000;

select *
from 
    emp e1 join emp e2 on(e1.mgr = e2.empno);

select *
from 
    emp e1 left outer join emp e2 on(e1.mgr = e2.empno);
--    e1.mgr = e2.empno(+);

select empno, ename, e.deptno /*, deptno */
from emp e left outer join dept d on(e.deptno = d.deptno);

select *
from 
    emp e1 right outer join emp e2 on(e1.mgr = e2.empno);

select *
from 
    emp e1 full outer join emp e2 on(e1.mgr = e2.empno);

-- 퀴즈
-- 각 부서별로 급여가
-- 가장 높은 사원, 가장 낮은 사원의 급여 차이와 부서번호를 가지오니라
select deptno, max(sal), min(sal), max(sal) - min(sal) 급여차이
from emp
group by deptno;

-- 심화
-- job을 총 20자 중 가운데 정렬
-- 가운데 정렬? 이거 머임?
-- 전체 길이의 반 - 글씨 길이의 반
-- 일단 왼쪽 채우고
-- 다음에 오른쪽 채우고
select 
    job, 
    lpad( job,  (length(job)/2 + 20/2), '-' ),
    rpad( 
            lpad( job,  (length(job)/2 + 20/2), '-' ), 
            20, 
            '-' 
    )
from emp;

-- 226p.
-- Q1
select e.deptno as deptno, d.dname, e.empno, e.ename, e.sal
from emp e, dept d
where e.deptno = d.deptno
and sal > 2000
order by d.deptno, dname;

-- Q2
select deptno, floor( avg(sal) ), max(sal), min(sal), count(*)
from emp e left outer join dept d using (deptno)
group by deptno
order by deptno;

-- Q3
select d.deptno, dname, empno, ename, job, sal
from dept d left outer join emp e on d.deptno = e.deptno
order by d.deptno, e.ename;

-- Q4
select 
    d.deptno, d.dname, e.empno, e.ename, e.mgr,
    e.deptno deptno_1, s.losal, s.hisal, s.grade,
    e2.empno mgr_empno, e2.ename mgr_ename
from dept d
    left outer join emp e on (d.deptno = e.deptno)
    left outer join salgrade s on (e.sal >= s.losal 
                                    and e.sal <= s.hisal)
    left outer join emp e2 on (e.mgr = e2.empno)
order by d.deptno, e.empno;

select *
from emp
where sal > (select sal
             from emp
             where ename = 'JONES');

select * from emp
where hiredate < (select hiredate
                    from emp
                    where ename = 'SCOTT');

select * from emp
where sal > (select avg(sal) from emp);

select max(sal) from emp
group by deptno;

select * from emp
where sal in (select max(sal) from emp
              group by deptno);
                
select * from emp;

select * from emp, dept where emp.deptno = dept.deptno;

-- from절에서의 서브쿼리
select *
from 
    (select deptno from emp where deptno = 10) e10,
    dept d
where e10.deptno = d.deptno;

select job, count(*) cnt
from emp
--where cnt > 3
group by job
having count(*) >= 3;

select *
from (
    select job, count(*) cnt
    from emp
    group by job
)
where cnt >= 3;

select *
from (
    select rownum rn, emp.*
    from emp
--    where rn = 1
--    where rownum = 2
)
where rn > 3 and rn < 6;

select rownum rn, emp.*
from emp
order by sal desc;

select * 
from  (
    select rownum rn, e.*
    from (
        select emp.*
        from emp
        order by sal desc
    ) e
)
where rn >= 2 and rn <= 4;

with e10 as (
    select * from emp where deptno = 10
)
select ename, '글씨' from e10;

select sal, (select grade
            from salgrade
            where e.sal between losal and hisal) salgrade,
       deptno, (select dname
                from dept
                where e.deptno = dept.deptno) as dname
from emp e;
