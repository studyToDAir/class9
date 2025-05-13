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

