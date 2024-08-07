-- 1. Employees와 Departments 테이블에 저장된 행의 개수를 출력하세요.

select count(employees.last_name), count(departments.department_name)
from employees, departments;

-- 2. Employees 테이블에 대한 employee_id, last_name, job_id, job_title, hire_date를 출력하세요.

select e.employee_id, e.last_name, j.job_title, e.hire_date
from employees e, jobs j
where e.job_id = j.job_id;

-- 3. Employees 테이블에서 salary가 12,000 이상인 직원의 last_name과 salary를 출력하세요.

select last_name, salary
from employees
where salary >= 12000;

-- 4. 부서번호 (department_id)가 20 혹은 50인 직원의 last_name과 department_id를 last_name에 대하여 오름차순으로 출력하세요.

select last_name, department_name
from emp_details_view
where department_id = 20 or 50
order by last_name;

-- 5. last_name의 세 번째에 a가 들어가는 직원의 last_name을 출력하세요.

select last_name
from emp_details_view
where last_name like '__a%';

-- 6. 같은 일(job)을 하는 사람의 수를 세어 출력하세요.

select job_id , count(*) from employees
group by job_id
having count(job_id) >=2;

-- 7. 급여(salary)의 최대값과 최소값의 차이를 구하세요.

select (max(salary) -  min(salary)) as cha
from emp_details_view;

-- 8. Toronto(city)에서 일하는 직원의 last_name, job, department_id, department_name을 출력하세요. 

select last_name, job_title, department_id, department_name, city
from emp_details_view
where city = 'toronto';

select e.last_name, j.job_title, e.department_id, d.department_name
FROM employees e,
   departments d,
   jobs j,
   locations l
WHERE e.department_id = d.department_id
   AND d.location_id = l.location_id
   AND j.job_id = e.job_id
and city='Toronto';


-- 1. Create a report to display the last name, job_id, and start date for the employees whose last names are Matos and Talyor. Order the query in ascending order by start date.

select last_name, job_id, hire_date
from employees
where last_name in ('Matos','Taylor');

select count(*) from departments;

-- 2. The HR department needs a report that displays the last name and fire date for all employees who were hired in 1994.

select last_name, hire_date
from employees
where date_format(hire_date, '%Y') = '1994';

-- 3 Display the last name, job and salary for all employees whose job is either that of a sales represntative or a stock clerk, and whose salary is not equal to $2,500, $3,500, or $7,000.

select last_name, job_title, salary
from


-- 4. Determine the number of managers without listing them. Label the column Number of Managers.
-- 5. Create a report to display the manager number and the salary of the lowestpaid employee for that manager. Exclude anyone whose manager is not known. Exclude any groups where the minimum salary is $6,000 or less. Sort the output in descending order of salary.
-- 6. Create a report to display the last name and employee number of employees along with their manager's last name and manger number. Label the columns Employee, Emp#, Manager, and Mgr#, respectively.
-- 7. Create a report for the HR department that displays employee last names, department numbers, and all the employees who work in the same department as a given employee.
-- 8. Create a report for the HR department that displays the department number, last name, and job_id for every  employee in the Executive department.
-- 9. Create a report for the HR department that displays the last name, and salary of every employee who reports to King.
-- 10. The HR department needs a list of department IDs for departments that do not contain the job_id 'ST_CLERK'.
