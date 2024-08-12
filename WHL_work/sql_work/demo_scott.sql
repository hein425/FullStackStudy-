/* madang 계정으로 접속 실행하면 Emp, Dept 테이블이 생성된다. */
/* 오라클 데이터베이스에서 scott 계정으로 많이 사용되는 샘플 데이터베이스이다. */

use madangdb;

drop table if exists emp ;
drop table if exists dept;
drop table if exists salgrade;


CREATE TABLE IF NOT EXISTS DEPT (
  DEPTNO integer NOT NULL,
  DNAME varchar(14),
  LOC varchar(13),
  PRIMARY KEY (DEPTNO)
);

INSERT INTO DEPT (DEPTNO, DNAME, LOC) VALUES (10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO DEPT (DEPTNO, DNAME, LOC) VALUES(20, 'RESEARCH', 'DALLAS');
INSERT INTO DEPT (DEPTNO, DNAME, LOC) VALUES(30, 'SALES', 'CHICAGO');
INSERT INTO DEPT (DEPTNO, DNAME, LOC) VALUES(40, 'OPERATIONS', 'BOSTON');

CREATE TABLE IF NOT EXISTS EMP (
  EMPNO integer NOT NULL PRIMARY KEY,
  ENAME varchar(10),
  JOB varchar(9),
  MGR integer,
  HIREDATE date,
  SAL integer,
  COMM integer,
  DEPTNO integer,
  FOREIGN KEY (deptno) REFERENCES Dept(deptno)
);

INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7369, 'SMITH', 'CLERK', 7902, '1980-12-17 00:00:00', 800, NULL, 20);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20 00:00:00', 1600, 300, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7521, 'WARD', 'SALESMAN', 7698, '1981-02-22 00:00:00', 1250, 500, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7566, 'JONES', 'MANAGER', 7839, '1981-04-02 00:00:00', 2975, NULL, 20);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28 00:00:00', 1250, 1400, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7698, 'BLAKE', 'MANAGER', 7839, '1981-05-01 00:00:00', 2850, NULL, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7782, 'CLARK', 'MANAGER', 7839, '1981-06-09 00:00:00', 2450, NULL, 10);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7788, 'SCOTT', 'ANALYST', 7566, '1987-04-19 00:00:00', 3000, NULL, 20);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7839, 'KING', 'PRESIDENT', NULL, '1981-11-17 00:00:00', 5000, NULL, 10);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7844, 'TURNER', 'SALESMAN', 7698, '1981-09-08 00:00:00', 1500, 0, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7876, 'ADAMS', 'CLERK', 7788, '1987-05-23 00:00:00', 1100, NULL, 20);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7900, 'JAMES', 'CLERK', 7698, '1981-12-03 00:00:00', 950, NULL, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7902, 'FORD', 'ANALYST', 7566, '1981-12-03 00:00:00', 3000, NULL, 20);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7934, 'MILLER', 'CLERK', 7782, '1982-01-23 00:00:00', 1300, NULL, 10);

CREATE TABLE IF NOT EXISTS SALGRADE(
	GRADE INTEGER,
	LOSAL INTEGER,
	HISAL INTEGER
	);

INSERT INTO SALGRADE VALUES (1, 700, 1200);
INSERT INTO SALGRADE VALUES (2, 1201, 1400);
INSERT INTO SALGRADE VALUES (3, 1401, 2000);
INSERT INTO SALGRADE VALUES (4, 2001, 3000);
INSERT INTO SALGRADE VALUES (5, 3001, 9999);

select * from emp;
select * from dept;
select * from salgrade;

-- <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<  문제풀기  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

-- 1)사원의 이름과 직위를 출력하세요 단 사원의 이름은 '사원이름' 직위는 '사원직위' 머리글이 나오게
select ENAME as 사원이름, JOB as 사원직위
from emp;

-- 2) 30번 부서에 근무하는 ㅗㅁ든 사원의 이름과 급여를 출력하세요
select ename , sal
from emp
where deptno = 30;

-- 3) 사원번호와 이름, 현재급여, 증가급여분(증가액열),10%인상된급여(열이름인상된급여)를 사원번호순으로
select empno, ename,comm as 증가액, ((sal*110)/100) as 인상된급여
from emp
order by empno; 

-- 4) 'S'로 시작하는 모든 사원과 부서번호를 출력하세요.
select ename, deptno
from emp
where ename like ('S%');

-- 5) 모든 사원의 최대 및 최소 급여, 합계 및 평균 급여를 출력하세요. 
-- 	열 이름은 각각 MAX, MIN, SUM, AVG로 합니다. 단, 소수점 이하는 반올림하여 정수로 출력하세요.
select max(sal) as MAX, min(sal) as MIN, sum(sal) as SUM, round(avg(sal)) as AVG
from emp;

-- 6) 업무 이름과 업무별로 동일한 업무를 하는 사원의 수를 출력하세요. 열 이름은 각각 '업무'와 '업무별 사원수'로 합니다.
select job as 업무 , count(ename) as 업무별사원수
from emp
group by job;

-- 7) 사원의 최대 급여와 최소 급여의 차액을 출력하세요.
select (max(sal) - min(sal)) as 차액
from emp;

-- 8) 30번 부서의 구성원 수와 사원들 급여의 합계와 평균을 출력하세요.
select count(ename) as total, sum(sal) as sum, avg(sal) as avg
from emp
where DEPTNO = 30;

-- 9) 평균 급여가 가장 높은 부서의 번호를 출력하세요.
     create view gugugu
	 as select deptno, avg(sal) as vvs
     from emp
     group by deptno;
     
     select * from gugugu;
     
     select  deptno 'Most rich Dept'
     from gugugu
     where  vvs in ( select max(vvs) from gugugu);
	
     
-- 10) 세일즈맨(SALESMAN)을 제외하고, 업무별 사원의 급여가 3,000 이상인 각 업무에 대해서,
-- 	   업무명과 업무별 평균 급여를 출력하세요. 단 평균 급여는 내림차순으로 출력합니다.
    create view sipsip
	as select distinct job ,(sal>=3000) as rich
	from emp
    where (job not in ('salesman'));
    
    select * from sipsip;
    
    select emp.job , avg(sal)
    from emp, sipsip
    where (emp.job=sipsip.job) and rich
    group by emp.job;

-- 11) 전체 사원 가운데 직속상관이 있는 사원의 수를 출력하세요.
-- 12) EMP테이블에서 이름, 겹여, 커미션(COMM)금액, 총액(SAL+COMM)을 구하여 총액이 많은 순서대로 출력하세요. 단 커미션이 NULL인 사람은 제외합니다.
-- 13) 부서별로 같은 업무를 하는 사람의 인원수를 구하여 부서번호, 업무이름, 인원수를 출력하세요.
-- 14) 사원이 한 명도 없는 부서의 이름을 출력하세요.
-- 15) 같은 업무를 하는 사람의 수가 4명 이상인 업무와 인원수를 출력하세요.
-- 16) 사원번호가 7400이상 7600이하인 사원의 이름을 출력하세요.
-- 17) 사원의 이름과 사원의 부서를 출력하세요.
-- 18) 사원의 이름과 팀장(MGR)의 이름을 출력하세요.
-- 19) 사원 SCOTT보다 급여를 많이 받는 사람의 이름을 출력하세요.
-- 20) 사원 SCOTT이 일하는 부서번호 혹은 DALLAS에 있는 부서번호를 출력하세요.

use hr;
select first_name, last_name
from employees;

-- --- 문자열 처리 문제
-- 1. 사원의 이름이 8자 이상인 사원의 정보를 출력하세요.
	select * 
	from employees
    where length(first_name) > 7;
-- 2. 이름의 첫 글자가 대문자인 사원의 정보를 출력하세요.
	select *
    from employees
    where first_name like upper('%'); -- 첫글자 가져와서 비트윈 A~Z
-- 3. 사원의 성의 2번째 문자가 'c'인 사원의 이름과 이름의 길이를 출력하세요.
	select first_name , length(first_name), last_name
    from employees
    where last_name like ('_c%');
-- 4. 주소 중 거리의 이름의 문자가 길이가 최소인 지역(locations)을 출력하세요.
-- 스트리트 어드레스에 트림을 해서 랭스를 하면 길이가 나옴 그거의 미니멈을 찾으셈
	select * , length(street_address)
    from locations
    where length(street_address) in (select min(length(street_address))
									 from locations);
                                     
-- 5. 이름이 'A','J', 'M'으로 시작하는 사원의 이름과 이름의 길이를 출력하세요.
	select first_name, length(first_name)
	from employees
    where first_name like ('M%') || first_name like ('A%') || first_name like ('J%')
    order by first_name;
    
    
-- --- Date 타입 처리 문제
-- 1. 1987년에 입사한 사원의 이름을 출력하세요.
	select first_name, last_name
    from employees
    where hire_date between'1987-01-01' and '1987-12-31';
       
-- 2. 사원의 이름, 입사년도, 근무년수를 출력하세요.
-- 현재년도 - 입사년도	
select employees.employee_id,first_name , last_name, date_format(start_date,'%Y') as 입사년도,  (date_format(end_date,'%Y') - date_format(start_date,'%Y')) as 근속년수
from employees , job_history
where (employees.employee_id = job_history.employee_id) and (employees.department_id = job_history.department_id);

select * from employees;
select * from job_history;

-- 3. '1987-06-01'과 '1987-07-30'사이에 입사한 사원의 이름과 입사일을 출력하세요.
	select first_name, last_name, hire_date
    from employees
    where hire_date between'1987-06-01' and '1987-07-30';

-- 4. 6월에 입사한 사원의 이름과 성을 출력하세요.
    select first_name, last_name, hire_date
    from employees
    where  month(hire_date)='6';

-- 5. 부서별, 연도별 입사한 사원의 수를 구하세요. 
-- 구릅바이 부서,연도 
	select department_id, hire_date, count(*)
    from employees
    group by department_id, hire_date;
        
--     1. 사원정보(employees) 테이블에서 사원번호, 이름, 급여, 업무, 입사일, 상사의 사원번호를 출력하세요.
-- 단, 이름은 성과 이름을 연결하여 Name이라는 별칭으로 출력하세요. (107행)
		select employee_id, concat(first_name,last_name) as name, salary, job_title, hire_date, manager_id
        from employees e , jobs j
		where e.job_id = j.job_id;

-- 2. 사원정보(employees) 테이블에서 사원의 성과 이름은 Name, 업무는 Job, 급여는 Salary, 연봉에 $100 보너스를 추가하여 
-- 계산한 값은 Increased Ann_Salary, 급여에 $100 보너스를 추가하여 계산한 연봉은 Increased Salary라는 별칭으로 출력하세요.
-- (107행)
	   
	select concat(first_name,last_name) as Name, 
		   job_title as Job, 
           salary as Salary,
           ((salary*12)+100) as (Increased Ann_Salary),
           (salary+100) as (Increased Salary)
    from employees e, jobs j 
    where e.job_id = j.job_id;

-- 3. 사원 정보(employees) 테이블에서 모든 사원의 이름(last_name)과 연봉을 '이름: 1 Year Salary = $연봉'형식으로 출력하고, 
-- 1 Year Salary라는 별칭을 붙여 출력하세요. (107행)

-- 4. 부서별로 담당하는 업무를 한 번씩만 출력하세요. (20행)

-- 5. 사원 정보(employees) 테이블에서 급여가 $7,000 ~ $10,000 범위 이외인 사람의 성과 이름(Name으로 별칭) 및 급여를 
-- 급여가 작은 순서대로 출력하세요. (75행)

-- 6. 사원의 성 (last_name) 중에 'e' 및 'o'글자가  포함된 사원을 출력하세요.  이때 머리글은 e AND o Name이라고 출력하세요. (10행)

-- 7. 현재 날짜 타입을 날짜 함수를 통해 확인하고, 1995년 5월 20일부터 1996년 5월 20일 사이에 고용된 사원들의 이름(Name으로 별칭), 
-- 사원번호, 고용일자를 출력하세요. 단 입사일이 빠른 순으로 정렬하세요. (8행)

-- 8. 수당을 받는 모든 사원의 성과 이름(Name으로 별칠), 급여(salary), 업무, 수당률(commission_pct)을 출력하세요. 
-- 급여가 큰 순서대로 정렬하되, 급여가 같으면 수당률이 큰 순서대로 정렬하세요. (35행)

-- 9. 60번 IT부서 사원의 급여를 12.3% 인상하여 정수만(반올림) 표시하여 출력하세요. 출력형식은 사번, 이름과 성(Name으로 별칭), 급여,
-- 인상된 급여(Increased Salary로 별칭)순으로 출력하세요. (5행)

-- 10. 이름이 's'로 끝나는 각 사원의 이름과 업무를 다음의 예시와 같이 출력하세요. (예시 : Sigal Tobias is a PU_CLERK)
-- 출력 시 성과 이름은 첫 글자를 대문자로, 업무는 모두 대문자로 출력하고 머리글은 Employee JOBs로 표시하세요. (18행)
 
 