SELECT * FROM enrollments;
SELECT * FROM lectures;
SELECT * FROM professors;

-- 5. ������û ���̺��� 1998�� 3�� 1�Ͽ��� 3��3�� ���̿� ������û �� ���¹�ȣ, �л���ȣ, ������û���� �˻��Ͻÿ�.
SELECT
  lcode
  , scode
  , edate
FROM 
  enrollments
WHERE edate BETWEEN '98/03/01' AND '98/03/03';

-- 6. ���� ���̺��� �����̸��� 'DBMS'�̶�� �ܾ �����ϴ� ������ ���¹�ȣ, �����̸�, ��米��, ���ǽð����� �˻��Ͻÿ�.
SELECT
  lcode
  , lname
  , instructor
  , hours
FROM
  lectures
WHERE 
  lname LIKE '%DBMS%';
  
  
-- 15. 'DBMS'�� �����ϴ� ������, �� ������ ������û �� �л����� �а�, �̸�, ������ �˻��Ͻÿ�.
SELECT
  p.pname
  , s.department
  , s.sname
  , e.grade
FROM 
  professors p, students s, enrollments e, lectures l
WHERE s.scode = e.scode
AND e.lcode = l.lcode
AND l.instructor = p.pcode
AND l.lname = 'DBMS';


-- 20. ������û �� ����� �߿��� �ְ� ������ ���� �л����� ������ ��ȸ�Ͻÿ�.
SELECT
   scode
   , lcode
FROM
  enrollments
WHERE (lcode, grade) IN
  (
    SELECT
      lcode
      , max(grade)
    FROM enrollments
    GROUP BY lcode
  )
;

SELECT S.SCODE,S.SNAME,E.EDATE,E.GRADE FROM students S, enrollments E
WHERE s.scode = e.scode
AND (lcode, grade) IN (SELECT lcode, MAX(grade) FROM enrollments GROUP BY lcode
HAVING MAX(grade) IS NOT NULL);


-- 37.'HanOh' ������ ������ 'assistant professor'���� 'associate professor'�� �����Ͻÿ�.
-- ��, ������ȭ�鿡 ������ ����� ����� ǥ���Ͻÿ�. �޿��� 500000 �߰�
UPDATE professors p
SET p.position = 'associate professor', p.salary=salary+500000
WHERE p.pname = 'HanOh';

SELECT * FROM professors WHERE pname = 'HanOh';

rollback;

-- 40. ������ ��ȣ �� �ش� �����ڿ� ���� ����� ���� �޿�, �ο����� ǥ���մϴ�. 
--      �����ڸ� �� �� ���� ��� �� ���� �޿��� 3000 �̻��� �׷� ���ܽ�Ű�� 
--      �޿��� �������� ��� ����� ������������ �����Ͻÿ�.

SELECT
  manager_id
  ,MIN(salary)
  ,COUNT(employee_id)
FROM
  employees
WHERE manager_id IS NOT NULL
GROUP BY manager_id
HAVING MIN(salary) <= 3000
ORDER BY MIN(salary);

SELECT
  manager_id
  ,MIN(salary)
  ,COUNT(employee_id)
FROM
  employees
WHERE manager_id = 121
GROUP BY manager_id
HAVING MIN(salary) <= 3000
ORDER BY MIN(salary);
