SELECt * FROM student_list;

INSERT INTO student_list(student_id, name, in_date)
VALUES('200101001', '���л�', sysdate);

DELETE FROM student_list;

UPDATE student_list
SET total_score=35
WHERE student_id = '200101001';

-- �л� ������ �ʱ⿡ �Է�
INSERT INTO
student_list(student_id, name, total_score, in_date)
VALUES('200101002', '���л�', NULL, sysdate);


-- ������ �Է��ϱ� ���� �Ϸù�ȣ�� ����� ��ü
CREATE SEQUENCE score_seq;
--  INCREMENT BY 1 MAXVALUE 5000 CYCLE;

-- �������
SELECT score_seq.nextval FROM dual;

-- 200101001 �л��� ����, ���� ������ �Է���
INSERT INTO
score_list
VALUES(score_seq.nextval, '200101001', '����', 10);

INSERT INTO
score_list
VALUES(score_seq.nextval, '200101001', '����', 20);

SELECT * FROM score_list;

-- 200101001 �л��� ������ Ȯ����
SELECT total_score
FROM student_list
WHERE student_id = '200101001';

SELECT 
  student_id
  ,sum(score)
FROM score_list
WHERE student_id = '200101001'
GROUP BY student_id;

-- ���� ������ �Է��ϸ� �л������� ������ ������ = SQL ���� ���� ó��
UPDATE 
  student_list 
SET total_score = 
  (
    SELECT 
      sum(score)
    FROM score_list
    WHERE student_id = '200101001'
  )
WHERE student_id = '200101001'; 

SELECT * FROM score_list;


-- ���� ���̺��� �ӽ� ���̺�� �����ϰ� 2�� �̻� �Էµ� ������ ����
CREATE table new_score_list
as 
  SELECT * FROM score_list
;

SELECT * FROM new_score_list;
 
-- �������̺��� �ӽ� ���̺�� ����, 2�� �̻� �Էµ� ������ ����(200101001)
INSERT INTO
new_score_list
VALUES(score_seq.nextval, '200101001', '����', 20);
 
DELETE
FROM new_score_list
WHERE (student_id = '200101001') AND (subject = '����')
AND 
  ((
    SELECT count(subject)
    FROM new_score_list
    WHERE student_id = '200101001' AND subject = '����'
  ) >= 2);
  
DELETE
FROM new_score_list
WHERE (student_id = '200101001') AND (subject = '����')
AND 
  ((
    SELECT count(subject)
    FROM new_score_list
    WHERE student_id = '200101001' AND subject = '����'
  ) >= 2);


DELETE
FROM new_score_list
WHERE subject IN 
  (
    SELECT subject
    FROM new_score_list
    WHERE student_id = '200101001'
    GROUP BY subject
    HAVING count(score) > 1
  )
;

SELECT 
  stu.student_id
  , stu.name
  , sco.subject
  , sco.score
FROM student_list stu, score_list sco
WHERE stu.student_id = sco.student_id
AND stu.student_id = '200101001';

-- 1. -HR���� �� �䱸���� �� ����
--EMPLOYEES ���̺��� �μ���ȣ�� 20���� �μ��� ��� �޿�(�Ҽ��� �� ������ ũ�� ������� �ʴ´�. )���� ���� �ٹ���(��� �� ��ǥ�̻縦 ������ ��� �系 ������)���� �����ȣ, �̸�(FIRST_NAME), �޿��� ����Ͻÿ�.
SELECT
  employee_id
  , first_name
  , salary
FROM employees
WHERE salary > 
  (
    SELECT avg(salary)
    FROM
    employees
    WHERE department_id = '20'
  );
  
SELECT 
  EMPLOYEE_ID
  ,FIRST_NAME
  ,SALARY
FROM EMPLOYEES
WHERE SALARY > 
  (
    SELECT AVG(SALARY) 
    FROM EMPLOYEES 
    WHERE DEPARTMENT_ID = '20'
  );


-- 2. ���ú��� �ش� ��ҿ��� �ٹ��ϴ� ��� �� ��� 
--���� �̸�, ��� ��

SELECT l.city, count(e.employee_id)
FROM employees e, locations l, departments d
WHERE e.department_id = d.department_id
AND d.location_id = l.location_id
GROUP BY l.city;

SELECT city, COUNT(employee_id)
FROM employees, departments, locations 
WHERE departments.location_id = locations.location_id AND departments.department_id = employees.department_id
GROUP BY city;


-- 3. �䱸���� �μ���ȣ, ����, �̸��� ����� �� ������ AD_PRES �� ����� ����ϼ���.

SELECT 
  e.department_id
  , j.job_id
  , j.job_title
  , e.first_name
FROM employees e, jobs j
WHERE e.job_id = j.job_id
AND j.job_id = 'AD_PRES';

SELECT 
  D.DEPARTMENT_ID 
  , E.JOB_ID, E.FIRST_NAME || E.LAST_NAME AS "NAME" 
  FROM DEPARTMENTS D  JOIN EMPLOYEES E  
  ON D.DEPARTMENT_ID = E.DEPARTMENT_ID  
  WHERE    E.JOB_ID = 
    (
      SELECT JOB_ID 
      FROM EMPLOYEES 
      WHERE JOB_ID = 'AD_PRES'
    );


-- HR
-- ��� ���̺��� ��� �̸�, �Ի��� �� 1�������������� ǥ���Ѵ�.      
-- 1�������������� 12�� �ٹ� �� �ش��ϴ� ù ��° �������Դϴ�. 
-- �� ���̺��� REVIEW�� �����ϰ� ��¥�� "yyyy-mm-dd"�� ���� �������� ǥ�õǵ��� �����մϴ�.
-- SELECT
  
-- Popp�� ���� �ؿ� �Ի��� ����� �̸��� ����ϼ���
SELECT 
  first_name
FROM employees
WHERE TO_CHAR(hire_date, 'yyyy') =
  (
    SELECT TO_CHAR(hire_date, 'yyyy')
    FROM employees
    WHERE last_name = 'Popp'
  )
;


select 
  last_name 
from employees 
where to_char(hire_date, 'YYYY') = 
  (
    select to_char(hire_date, 'YYYY') 
    from employees 
    where last_name = 'Popp'
  );


---- ��� ���̺��� ��� �̸�, �Ի��� �� 1�������������� ǥ���Ѵ�.      
-- 1�������������� 12�� �ٹ� �� �ش��ϴ� ù ��° �������Դϴ�. 
-- �� ���̺��� REVIEW�� �����ϰ� ��¥�� "yyyy-mm-dd"�� ���� �������� ǥ�õǵ��� �����մϴ�.

SELECT
  first_name
  , hire_date
  , TO_CHAR(TRUNC(ADD_MONTHS(hire_date, 12)+7, 'iw')+2, 'yyyy-mm-dd') REVIEW
FROM
  employees;
--  TRUNC(date, 'iw') -> ���� �������� �ú��������� �����
  
SELECT first_name || ' ' || last_name AS name
  , TO_CHAR(hire_date, 'YYYY-MM-DD') AS hire_date
  , TO_CHAR(NEXT_DAY( ADD_MONTHS(hire_date, +12) ,'������'), 'YYYY-MM-DD') AS review 
FROM employees;






