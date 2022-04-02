/*
	## �ۼ��� : �������̸��� ������.
	## ���ϸ� : sqlscript_�������̸�.sql (���ϸ� �ݵ�� ��Ģ�� �°� �����ϱ� �ٶ��ϴ�.)
                          
	## SQL ���սǽ����� 

	-- ���� ���� SQL script(@@exercise.sql) ������ ������� �����ͺ��̽��� �ʱ�ȭ �Ѵ�.
	-- �����ͺ��̽��� ������ ���̺� ���� �� �ʱ� ���ڵ尡 ���������� ���� �Ǿ����� Ȯ���Ѵ�.

	-- �� ���׿� ���ؼ� SQL ������ �ۼ��Ͽ� �ϼ��� SQL ������ �� ���� ���� �Ʒ��� ����Ͻÿ�.
             -- ����(join)�� ����Ŭ����, Ansi ǥ�ر��� �� ���ϴ� ���� ���ÿ�.

	-- 1~ 40�� �������� ȭ�� ĸó�Ͽ� �ϳ��� ���Ͽ� �����Ѵ�. 
                -> ���� ��ȣ , sqlscript, ȭ�� ĸ��(���� ����κи� ĸ��)
                -> ���ϸ� : screenshot_�������̸�.pdf  ����

	-- ���� ���ϸ� : ucamp35_�������̸�.zip  
	-- ���� �ð� : 12:30�ñ��� ����
*/

-- 6��(like), 8��(where), 12��(where), 16��(��米��), 20��, 29��(order by), 34��(where)  


-- 1. ���� ���̺��� ��� ������ �̸�, �Ҽ��а�, ������ �˻��Ͻÿ�.
SELECT
  pname
  , department
  , position
FROM
  professors;
 


-- 2. �л� ���̺��� 'computer engineering'���� �Ҽӵ� �л����� �̸�, �й�, ��������� �˻��Ͻÿ�.
SELECT
  sname
  , scode
  , birthday
FROM 
  students
WHERE department = 'computer engineering';


-- 3. ���� ���̺��� �ӿ���� 30�� �̻��  ������ �̸� �Ҽ��а��� �˻��Ͻÿ�.
SELECT
  pname
  , department
FROM 
  professors
WHERE MONTHS_BETWEEN(sysdate, hiredate)/12 >= 30;



-- 4.  �л� ���̺��� ������ȣ�� '221'�� ������ �������� �ʴ� �л����� �˻��Ͻÿ�.
SELECT
  scode
FROM
  students
WHERE advisor != '221';


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


-- 7. �л����� �а�, �л��̸�, ���������̸��� �˻��Ͻÿ�.
SELECT
  s.department
  , s.sname
  , p.pname
FROM
  students s, professors p
WHERE s.advisor = p.pcode;


-- 8. �л� �̸�(ChangKim)���� ������û�� ���¹�ȣ, ������û�� �˻�
SELECT
  e.lcode
  , e.edate
FROM
  enrollments e, students s
WHERE e.scode = s.scode
AND s.sname = 'ChangKim';


-- 9. 'JameLee'�� ������ �����ϴ� �л����� �̸�, �г�, ��������� �˻��Ͻÿ�.
SELECT
  sname
  , year
  , birthday
FROM
  students s, professors p
WHERE s.advisor = p.pcode
AND p.pname = 'JameLee';


-- 10. 'computer engineering'�� �������� �����ϴ� �л����� �̸�, �г�, ��������� �˻��Ͻÿ�.
SELECT
  sname
  , year
  , birthday
FROM
  students s, professors p
WHERE s.advisor = p.pcode
AND p.department = 'computer engineering';


-- 11. 'fileProcess'�� ������û �� �л����� �й�, ������û��, ������ �˻��Ͻÿ�.
SELECT
  s.scode
  , e.edate
  , e.grade
FROM 
  students s, enrollments e, lectures l
WHERE s.scode = e.scode
AND e.lcode = l.lcode
AND l.lname = 'fileProcess';


-- 12. 'computer engineering'�� �������� �����̸�, �������� �����ϴ� ���¹�ȣ, ���¸��� �˻��Ͻÿ�.
SELECT
  p.pname
  ,l.lcode
  ,l.lname
FROM 
  professors p, lectures l
WHERE p.pcode = l.instructor
AND p.department = 'computer engineering';


-- 13. 'C301'���¸� ������û �� �л����� �а�, �л��̸��� �˻��Ͻÿ�.
SELECT
  department
  , sname
FROM 
  students s, enrollments e
WHERE s.scode = e.scode
AND e.lcode = 'C301';


-- 14. 'data structure' ������ ������û �� �л����� �а�, �л��̸�, ������ �˻��Ͻÿ�.
SELECT
  s.department
  , s.sname
  , e.grade
FROM 
  students s, enrollments e, lectures l
WHERE s.scode = e.scode
AND e.lcode = l.lcode
AND l.lname = 'data structure';


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


-- 16. ������ 80�� �̻��� �л����� �й�, �л��̸�, ���¹�ȣ, ���¸�, ��米�� ���� �˻��Ͻÿ�.
SELECT 
  s.scode
  , s.sname
  , l.lcode
  , l.lname
  , l.instructor
FROM
  students s, enrollments e, lectures l
WHERE s.scode = e.scode
AND e.lcode = l.lcode
AND e.grade >= 80;


-- 17. 'JameLee' ������ �����ϴ� �л����� �а�, �л��̸�, �� �л����� ������û �� ���¸�, ������ �˻��Ͻÿ�.
-- ��, ������ ���� ��쿡�� �����÷� ǥ���Ͻÿ�
SELECT
  s.department
  , s.sname
  , l.lname
  , CASE WHEN NVL(e.grade, 0) = 0 THEN '������'
  ELSE TO_CHAR(e.grade) END
FROM 
  students s, enrollments e, lectures l, professors p
WHERE s.scode = e.scode
AND s.advisor = p.pcode
AND e.lcode = l.lcode
AND p.pname = 'JameLee';

-- 18. computer engineering�� �������� ��� �޿��׼��� ���Ͻÿ�.
-- ��, �޿��� õ�������� �޸�ǥ�� �� ���� ��ȭ��ȣ�� �Բ� ǥ���Ͻÿ�.
SELECT
  TO_CHAR(AVG(salary), '$999,999,999.9')
FROM
  professors
WHERE department = 'computer engineering'
GROUP BY department;


-- 19. ������û �� ���� �ְ������� �������� �� ���Ͻÿ�.
SELECT
  lcode
  , MAX(grade)
  , MIN(grade)
FROM enrollments
GROUP BY lcode;


-- 20. ������û �� ����� �߿��� �ְ� ������ ���� �л����� ������ ��ȸ�Ͻÿ�.
SELECT
  scode
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

-- 21. ���� ���ǽð������� ������ ���¼��� ���Ͻÿ�.
SELECT
  hours
  , COUNT(lcode)
FROM 
  lectures
GROUP BY hours;


-- 22. ������û �� �л����� ��� �� ������ ���Ͻÿ�.
SELECT
  COUNT(distinct scode)
FROM
  enrollments;


-- 23. �л����� ��� �� ���� �а��� �ҼӵǾ� �ִ��� ���Ͻÿ�.
SELECT
  COUNT(distinct department)
FROM students;


-- 24. �� �а��� �л����� ���� ���Ͻÿ�.
SELECT
  department
  , COUNT(scode)
FROM
  students
GROUP BY department;


-- 25. �������� �Ҽ��а���, ���޺��� �з��Ͽ� �� ���޺� ��� �޿��׼��� ���Ͻÿ�.
SELECT
  department
  , position
  , AVG(salary)
FROM 
  professors
GROUP BY
  department, position;


-- 26. �� �л��鿡 ���� �й�, �л��̸�, ������û ������� ��� ������ ���Ͻÿ�.
SELECT
  s.scode
  , s.sname
  , AVG(e.grade)
FROM 
  enrollments e, students s
WHERE e.scode = s.scode
GROUP BY 
  s.scode, s.sname;


-- 27. ���ǽ� '510'ȣ���� �����ϴ� ������ ������ȣ, �����̸�, �Ҽ��а��� �˻��Ͻÿ�.
SELECT
  DISTINCT pcode
  , pname
  , department
FROM
  professors p, lectures l
WHERE p.pcode = l.instructor
AND l.room = '510';


-- 28. 'SIKang' ������ �������� �ʴ� ��� �л����� �̸�, �Ҽ��а�, �г��� �˻��Ͻÿ�.
SELECT
  s.sname
  , s.department
  , s.year
FROM 
  students s, professors p
WHERE s.advisor = p.pcode
AND p.pname != 'SIKang';


-- 29. ������û ��������� 85�� �̻��� �л����� �л���ȣ, �л��̸�, ��� ������ ��������� ���� ������ ����Ͻÿ�.
SELECT
  s.scode
  , s.sname
  , AVG(e.grade)
FROM
  students s, enrollments e
WHERE s.scode = e.scode
GROUP BY s.scode, s.sname
HAVING AVG(e.grade) >= 85
ORDER BY AVG(e.grade);

 
-- 30. ���ǽð����� '2'�ð��� ���¸� ������û �� �л����� �а�, �й�, �л��̸�, �г��� �˻��Ͻÿ�.
SELECT
  s.department
  , s.scode
  , s.sname
  , s.year
FROM
  students s, enrollments e, lectures l
WHERE s.scode = e.scode
AND e.lcode = l.lcode
AND l.hours = 2;



-- 31. 'JameLee' ������ �����ϴ� ���¸� ������û�� �л����� �а�, �й�, �л��̸��� �˻��Ͻÿ�.
SELECT
  s.department
  , s.scode
  , s.sname
FROM
  students s, professors p, enrollments e, lectures l
WHERE p.pcode = l.instructor
AND l.lcode = e.lcode
AND e.scode = s.scode
AND p.pname = 'JameLee';
 

-- 32. ��ü �л��� 30% �̻��� ������û�� ������ ��ȣ�� �˻��Ͻÿ�.
SELECT
  l.lcode
FROM lectures l, enrollments e
WHERE l.lcode = e.lcode
GROUP BY l.lcode
HAVING COUNT(e.scode) >= 
  (
    SELECT
      COUNT(scode)
    FROM
      students
  )*0.3
;

-- 33.'1998�� 3��3��' ������ �߻��� ��� ������û �����͸� OldEnrollments���̺�� ������ ��ȸ�Ͻÿ�.
-- ��, old_enrollments ���̺��� ������ enrollments ���̺��� ������ �����Ͽ� ���̺��� �����Ͻÿ�.
CREATE table
  OldEnrollments
AS 
  (
    SELECT
      lcode
      , scode
      , edate
      , grade
    FROM
      enrollments
    WHERE edate < '98/03/03'
  )
;


-- 34. ������û�ο����� 80�� �̻��� ���¸� �����ϴ� �������� �޿��� 500,000�� �λ��Ͻÿ�.
-- ��, �λ��� �ش� ������ ������ȣ, �޿������� ��ȸ�Ͻÿ�.
-- ��, �ش� ���� �޿������� ������ �λ��� �ش� ������ ������ȣ, �޿������� ��ȸ�Ͻÿ�.
-- 221 3,000,000 / 311 2,300,000

UPDATE professors
SET salary = salary + 500000
WHERE pcode IN
  (
     SELECT P.pcode
     FROM professors p, lectures l
     WHERE p.pcode = l.instructor
     AND l.lcode IN 
      (
          SELECT e.lcode
          FROM professors p, enrollments e, lectures l
          WHERE e.lcode = l.lcode
          AND l.instructor = p.pcode
          GROUP BY e.lcode
          HAVING COUNT(e.scode) >= 80
      )
  )
;

SELECT 
  * 
FROM
  professors
WHERE pcode IN
  (
     SELECT P.pcode
     FROM professors p, lectures l
     WHERE p.pcode = l.instructor
     AND l.lcode IN 
      (
          SELECT e.lcode
          FROM professors p, enrollments e, lectures l
          WHERE e.lcode = l.lcode
          AND l.instructor = p.pcode
          GROUP BY e.lcode
          HAVING COUNT(e.scode) >= 4
      )
  )
;
      SELECT e.lcode
      FROM professors p, enrollments e, lectures l
      WHERE e.lcode = l.lcode
      AND l.instructor = p.pcode
      GROUP BY e.lcode
      HAVING COUNT(e.scode) > 2;
 
SELECT 
   l.lcode
FROM professors p, enrollments e, lectures l
WHERE e.lcode = l.lcode
AND l.instructor = p.pcode
GROUP BY l.lcode
HAVING COUNT(e.scode) < 80;

-- 35. 'HanOh' ������ �����ϴ� ���¸� ��û�� ������û �����͸� �����Ͻÿ�.
-- ��, ������ȭ�鿡 ������ ����� ����� ǥ���Ͻÿ�.

DELETE
FROM enrollments
WHERE lcode IN
  (
      SELECT
        DISTINCT e.lcode
      FROM 
        lectures l, enrollments e, professors p
      WHERE l.lcode = e.lcode
      AND l.instructor = p.pcode
      AND p.pname = 'HanOh'
  )
;
      
-- 36. ���� ��ü������ ��ȸ�Ͻÿ�.
SELECT
  pcode
FROM
  professors;

-- 37.'HanOh' ������ ������ 'assistant professor'���� 'associate professor'�� �����Ͻÿ�.
-- ��, ������ȭ�鿡 ������ ����� ����� ǥ���Ͻÿ�.
UPDATE professors p
SET p.position = 'associate professor'
WHERE p.pname = 'HanOh';


--38. ������û �� ���� ���� ������ ���� ���� ���� ������û �����͸� �����Ͻÿ�.
-- ��, ������ȭ�鿡 ������ ����� ����� ǥ���Ͻÿ�.
-- ��, ���� �� ������û ��ü������ ��ȸ�Ͻÿ�.
DELETE
FROM enrollments e
WHERE NVL(e.grade, 0) = 0;



--Oracle ���� �⺻������ �����ϴ� ���̺��� ����

-- 39. ����� �ְ� �޿�, ���� �޿�, �ְ�޿��� ���� �޿��� ���̸� Ȯ���Ͻÿ�
SELECT
  MAX(salary)
  , MIN(salary)
  , MAX(salary) - MIN(salary)
FROM
  employees;


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









