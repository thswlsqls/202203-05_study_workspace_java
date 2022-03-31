select * from someTable where i = dont;

SELECT d.department_id, 
	   d.department_name, 
	   ROUND(AVG(e.salary),1), 
	   MAX(e.salary), 
	   MIN(e.salary)  
FROM departments d, 
	 employees e  
WHERE d.department_id = e.department_id 
GROUP BY d.department_id,   
		 d.department_name; 

-- 20220330
-- 1. �����ȣ�� 100�� ����� �޿��� Ȯ��(PK�׷� ������)
SELECT employee_id, salary  
FROM employees  
WHERE employee_id=100;  

-- 2. ���� �ٹ����� ����� ������� Ȯ��
SELECT count(employee_id)
FROM employees; 

-- 3. ��� ���̺��� job_id�� AD_VP�� �ٹ��ϴ� ����� �޿� �Ѿװ� ����� Ȯ��
SELECT job_id, SUM(salary), AVG(salary)
FROM employees
WHERE job_id='AD_VP'
GROUP BY job_id;

SELECT job_id, SUM(salary), AVG(salary)
FROM employees
GROUP BY job_id
HAVING job_id='AD_VP';

-- 4. ���ʽ��� �޴� ����� ������� Ȯ��SELECT count(employee_id)
SELECT count(employee_id)
FROM employees
WHERE commission_pct IS NOT NULL;

SELECT count(employee_id)
FROM employees
WHERE commission_pct IS NULL;

-- < SQL �������Լ� �ǽ����� >
-- EX1. ���� ��¥�� ǥ���ϴ� ���Ǹ� �ۼ��ϰ� �� ���̺��� Date�� �����Ѵ�.
SELECT sysdate "Date"
FROM DUAL;

-- EX2. ��� ��ȣ, �̸�, �޿� �� 15% �λ�� �޿��� ������ ǥ���ϰ� �� ���̺��� New salary �� �Ѵ�.
SELECT employee_id,
	   first_name || last_name,
	   salary,
	   salary * 1.15 NewSalary
FROM employees;

-- EX3. �޿� �λ��(�� �޿����� ���� �޿��� �� ��)�� �߰��ϵ��� �����ϰ� �� ���̺��� Increase�� �����Ѵ�.
SELECT employee_id,
	   first_name || last_name,
	   salary,
	   salary * 1.15 NewSalary,
	   salary * 0.15 Increase
FROM employees;

-- EX4. ��� �̸�, �Ի��� �� �޿� �������� ǥ���Ѵ�.      
-- �޿� �������� ���� �� �ٹ� �� �ش��ϴ� ù ��° �������Դϴ�. 
-- �� ���̺��� REVIEW�� �����ϰ� ��¥�� "yyyy-mm-dd"�� ���� �������� ǥ�õǵ��� �����մϴ�.

SELECT 
	first_name
	, hire_date
	, TO_CHAR(TRUNC(ADD_MONTHS(hire_date, 6)+7, 'IW'), 'yyyy-mm-dd') REVIEW
FROM employees;

SELECT 
	first_name
	, hire_date
	, TO_CHAR(NEXT_DAY(ADD_MONTHS(hire_date, 6), '������'), 'yyyy-mm-dd') REVIEW
FROM employees;



-- EX5. ����� �̸�, �ٹ�����(�Ի��Ϸκ��� ������� ����)�� ����ϸ� �����̺��� MONTHS_WORKED�� �����մϴ�. 
-- ����� ������ �ݿø��Ͽ� ǥ���ϰ� ���� �ٹ��� ������� ����Ͻÿ�. 
SELECT employee_id,
       first_name,
	   ROUND(MONTHS_BETWEEN(sysdate, hire_date)) MONTHS_WOEKED
FROM employees
ORDER BY MONTHS_WOEKED;

-- EX6. �� ����� ���� ���� �׸��� �����ϴ� ���Ǹ� �ۼ��մϴ�.
-- <employee name> earns <salary> monthly but wants <3 times salaryary>. 
-- �� ���̺��� ��Wanted wage���� �����մϴ�.
-- ��¿� : King earns 24000 monthly but wants 72000
SELECT first_name || ' earns ' || salary || ' monthly but wants ' || salary*3 
FROM employees;


-- EX7. ��� ����� �̸� �� �޿��� ǥ���ϴ� ���Ǹ� �ۼ��մϴ�, 
-- �޿��� 15�� ���̷� ���ʿ� $ ��ȣ�� �ٴ� �������� ǥ���ϰ� �� ���̺��� salary �� �����մϴ�.
SELECT first_name
	   , RPAD(TO_CHAR(salary, '$999999.99'), 15, ' ') as salary
FROM employees;

-- EX8. �̸��� J, A �Ǵ� M���� �����ϴ� ��� ����� �̸�(ù �۸� �빮�ڷ�) �� �̸� ���̸� ǥ���Ͻÿ�.
SELECT 
	INITCAP(first_name||last_name)
FROM employees
WHERE first_name LIKE'J%' OR first_name LIKE 'M%';

-- EX9. �̸�, �Ի��� �� ���� ���� ������ ǥ���ϰ� �� ���̺��� DAY�� �����մϴ�. �Ͽ��� ~ ����� ������ ����
SELECT first_name
	   , hire_date
	   , TO_CHAR(hire_date, 'DY') "DAY"
FROM employees
ORDER BY "DAY"; 

-- EX10. ��� �̸� �� �޿��� Ŀ�̼��հ踦 ǥ���ϴ� ���Ǹ� �ۼ��մϴ�. ���̸��� TOTAL �� �����Ѵ�.
-- Ŀ�̼��� ������ ����� 'Yes'���� ǥ���ϰ�, �ƴϸ� 'No'�� ǥ���ϰ� 
-- �� ���̺��� COMMISSION���� �����մϴ�.
SELECT 
	first_name
	, salary + salary*commission_pct
	, CASE WHEN NVL(commission_pct, 0) = 0 THEN 'No'
	   ELSE 'Yes' END
FROM employees;

-- EX11. ����� �̸��� ǥ���ϰ� �޿� �Ѿ��� ��ǥ(*)�� ��Ÿ���� ���Ǹ� �ۼ��մϴ�. 
 -- �� ��ǥ�� 1000�޷��� ��Ÿ���ϴ�. 
   -- �޿� �������� �����͸� ������������ �����ϰ� �� ���̺��� EMPLOYEE_GREAD �� �����մϴ�.

SELECT 
  first_name||last_name
	, department_id
	, ROUND(sum(salary)/1000,2) || '*'
FROM employees
GROUP BY department_id, first_name||last_name;

-- EX12. ����� �̸�, ����, ���� ���� ���� �������� ��� ����� ����� ǥ���ϴ� ���Ǹ� �ۼ��մϴ�.

        --job_id ��   'CLERK'�� ������   =>  '��'
          --             'REP'�� ������     => '�١�'
            --           'MAN'�� ������    => '�١١�'

   --�� ���� �������� ǥ���Ͻÿ�. �� ���̺��� "GRADE"�� �����մϴ�.
   
SELECT 
  first_name || last_name
  , job_id
  , CASE WHEN job_id LIKE '%CLERK' THEN '��'
         WHEN job_id LIKE '%REP' THEN '�١�'
         WHEN job_id LIKE '%MAN' THEN '�١١�'
         ELSE 'No Grade'
  END GRADE
FROM employees;

SELECT 
	first_name
	, hire_date
	, TO_CHAR(TRUNC(ADD_MONTHS(hire_date, 6)+7, 'IW'), 'yyyy-mm-dd') REVIEW
FROM employees;

SELECT 
	first_name
	, salary + salary*commission_pct
	, CASE WHEN NVL(commission_pct, 0) = 0 THEN 'No'
	   ELSE 'Yes' END
FROM employees;

--< SQL �׷� �Լ� �ǽ�����  >
--
--EX1. ��� ����� �޿� �ְ��, ������, �Ѿ� �� ��վ��� ǥ���մϴ�. 
--      �� ���̺��� ���� Maximun, Minimum, Sum �� Average�� �����ϰ� ����� ������ �ݿø��ϴ� ���Ǹ� �ۼ��Ͻÿ�.
SELECT 
  ROUND(MAX(salary)) Maximun
  , ROUND(MIN(salary)) Minimum
  , ROUND(SUM(salary)) Sum
  , ROUND(AVG(salary)) Average
FROM employees;
--
--EX2. �� ������ ���� �޿� ������, �ְ��, �Ѿ� �� ��վ��� ǥ���ϵ��� �Ѵ�. 
--      ����� �Ҽ��� ��°�ڸ����� ǥ���Ͻÿ�.
SELECT 
  department_id
  , ROUND(MAX(salary)) Maximun
  , ROUND(MIN(salary)) Minimum
  , ROUND(SUM(salary)) Sum
  , ROUND(AVG(salary), 2) Average
FROM employees
GROUP BY department_id;
--
--
--
--EX3. ������ ������ ����� ���� ǥ���ϴ� ���Ǹ� �ۼ��Ͻÿ�.

SELECT 
  job_id ����
  , count(employee_id) ����Ǽ�
FROM 
  employees
GROUP BY 
  job_id;

--
--EX4. ������ ��� ���� ������ ���� ǥ���ϰ� �� ���̺��� Number of Managers�� �����մϴ�.
SELECT 
   count(DISTINCT manager_id) "Number of Managers"
FROM employees
WHERE manager_id IS NOT NULL;

--
--EX5. �ְ� �޿��� ���� �޿��� ������ ǥ���ϴ� ���Ǹ� �ۼ��ϰ� �� ���̺��� DIFFERENCE�� �����Ͻÿ�.
SELECT
  MAX(salary)-MIN(salary) DIFFERENCE
FROM employees;


--EX6. ������ ��ȣ �� �ش� �����ڿ� ���� ����� ���� �޿�, �ο����� ǥ���մϴ�. 
--      �����ڸ� �� �� ���� ��� �� ���� �޿��� $5000 �̸��� �׷� ���ܽ�Ű�� 
--      �޿��� �������� ��� ����� ������������ �����Ͻÿ�.
SELECT 
  manager_id
  , MIN(salary)
  , COUNT(employee_id)
FROM 
  employees
WHERE (manager_id IS NOT NULL) 
GROUP BY manager_id
HAVING MIN(salary) >= 5000
ORDER BY MIN(salary) DESC;

--EX7. �μ��� ������ �ο��� ��  ��ձ޿��� ǥ���ϴ� ���Ǹ� �ۼ��Ͻÿ�.
--        ��, ��� �޿��� �Ҽ��� ��° �ڸ����� �ݿø��ϰ�, 
--             �μ���ȣ ������ �����ϰ� �μ��� ������ ��ձ޿��� ���� ���������� �����Ͻÿ�.
SELECT 
  department_id
  , job_id
  , count(employee_id)
  , ROUND(AVG(salary),2)
FROM
  employees
GROUP BY department_id, job_id
ORDER BY department_id, AVG(salary) DESC;
  
--
--EX8. �� ����� �� �� 2002,2003, 2004,2005�⿡ �Ի��� ��� ���� ǥ���ϴ� ���Ǹ� �ۼ��ϰ� 
--      ������ �� �Ӹ����� �����մϴ�.

--��� �� ) 
--TOTAL      2002     2003    2004    2005
107	      7          6        10       29

SELECT
  COUNT(employee_id) TOTAL
  ,COUNT(CASE WHEN TO_CHAR(hire_date, 'yyyy') = '2000' THEN 1 END) "2000"
  ,COUNT(CASE WHEN TO_CHAR(hire_date, 'yyyy') = '1999' THEN 1 END) "1999"
  ,COUNT(CASE WHEN TO_CHAR(hire_date, 'yyyy') = '1998' THEN 1 END) "1998"
  ,COUNT(CASE WHEN TO_CHAR(hire_date, 'yyyy') = '1997' THEN 1 END) "1997"
FROM 
  employees;

-- 1. employees ���̺��� first_name�� A�� �����ϴ� ����� ���, �̸�, �μ����̵�, �μ����� �����
SELECT
  e.employee_id
  , e.first_name
  , d.department_id
  , d.department_name
FROM employees e JOIN departments d
ON e.department_id = d.department_id
AND first_name LIKE 'A%';
  
  
  
-- 2. salary�� 3000�� 5000������ ����� ���, �̸�, �μ���, ��������, ���� �����ȣ, ������, �������� �����                                       
SELECT 
  e.employee_id, 
  e.first_name,
  d.department_name,
  j.job_title,
  l.postal_code,
  c.country_name,
  r.region_name
FROM employees e, departments d ,jobs j, locations l, countries c, regions r
WHERE e.department_id = d.department_id(+)
AND e.job_id = j.job_id(+)
AND d.location_id = l.location_id(+)
AND l.country_id = c.country_id(+)
AND c.region_id = r.region_id(+);

-- 3. ����̵� IT�� �����ϴ� �μ��� ���� ����� ���, �̸�, �μ���, �޿��� �����                         
SELECT 
  e.employee_id,
  e.first_name,
  d.department_name,
  e.salary
FROM
  employees e JOIN departments d
ON e.department_id = d.department_id
WHERE employee_id IN (SELECT 
                        e.employee_id
                      FROM
                        employees e JOIN departments d 
                      ON e.department_id = d.department_id
                        JOIN jobs j
                      ON e.job_id = j.job_id
                      AND j.job_id LIKE 'IT%'
                      );

-- 4.  ����� ���, �̸�, �μ���, �������丮 Ƚ���� ����ϵ� �������丮�� 2ȸ �̻��� ����� �����                      
SELECT 
  e.employee_id
  , e.first_name
  , d.department_name
  , (SELECT COUNT(job_id)
    FROM job_history jh
    WHERE jh.employee_id = e.employee_id) jh_count
FROM employees e, departments d
WHERE e.department_id = d.department_id(+)
AND (SELECT COUNT(job_id)
     FROM job_history jh
     WHERE jh.employee_id = e.employee_id) >= 2;
    


SELECT * FROM departments;
SELECT * from employees WHERE salary BETWEEN 3000 AND 5000;
SELECT * FROM job_history;
  
  
--  ���͵� ���� ����
-- 1. �� �μ����� �ִ� �޿��� ���� ����� ���, a�μ���ȣ, �̸�, �̸���, �޿�
SELECT
  department_id
  , employee_id
  , first_name
  , email
  , salary
FROM
  employees
WHERE (department_id, salary) IN 
(
  SELECT 
    department_id,
    max(salary)
  FROM employees
  GROUP BY department_id
)
ORDER BY department_id;

-- 2. �޿��� 5000�̸��̸� C, 5000�̻� 10000�̸��̸� B, 10000�̻��̸� A�� �ؼ� ����� �ű�� 
-- ����� ��ȣ, �̸�, �μ���, �޿�, �޿������ ����ϰ� �����ȣ ���� ������������ ������
SELECT 
  e.employee_id
  , e.first_name || e.last_name
  , d.department_name
  , e.salary
  , CASE WHEN salary < 5000 THEN 'C'
         WHEN salary < 10000 THEN 'B'
         ELSE 'A' END �޿����
FROM employees e, departments d     
WHERE e.department_id = d.department_id     
ORDER BY employee_id;    









  