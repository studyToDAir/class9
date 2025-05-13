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

-- sal 컬럼 기준으로 내림차순 - 크 것부터
select * from emp
order by sal desc;