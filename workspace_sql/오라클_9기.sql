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


