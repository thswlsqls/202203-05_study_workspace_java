SELECT
  e.employee_id
  , e.first_name || e.last_name
  , e.salary
  , d.department_name
FROM employees e, departments d
WHERE e.department_id = d.department_id
AND department_name = 'IT';

SELECT * FROM employees;

