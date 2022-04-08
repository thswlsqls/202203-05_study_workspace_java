SELECT * FROM ENROLLMENTS;
SELECT * FROM LECTURES;
SELECT * FROM STUDENTS;
SELECT * FROM PROFESSORS;

--1. ��� ������ ��ȣ Ȯ�� //
SELECT 
  pcode
FROM professors; 


--2. Ư�� ����(��ȣ)�� �Ҽ��а�, �ӿ����� Ȯ�� //
SELECT 
  department
  , hiredate
FROM professors
WHERE pcode = '221';

--3. Ư�� ����('DBMS��) ������ ���� ��ȣ Ȯ�� //
SELECT
  lcode
FROM lectures
WHERE lname = 'DBMS';

--4. Ư�� ����(���¹�ȣ)�� �ش��ϴ� �����̸�, ���ǽ�, �ִ�����ο� Ȯ�� //
SELECT
  lname
  , room
  , capacity
FROM lectures
WHERE lcode = 'C301';

--5. �л� �̸�(ChangKim)���� ������û�� ���¹�ȣ Ȯ��
SELECT 
  e.lcode
FROM enrollments e, students s
WHERE e.scode = s.scode
AND s.sname = 'ChangKim';

--6. Ư�� �а�('computer engineering��)�� �������� �����ϴ� �л����� �й�,
--�̸� Ȯ�� //
SELECT 
  s.scode
  , s.sname
FROM students s, professors p
WHERE s.advisor = p.pcode
AND p.department = 'computer engineering';
  
--7. Ư�� �л� ���� ���(�� �л���ȣ�� PK)
INSERT INTO students
(scode, sname, department, year, birthday, advisor)
VALUES
('92414505', 'NamPark', 'computer engineering', 3, '73/11/11', '221');

rollback;
--8. �л������� ������� ������û
INSERT INTO enrollments
(lcode, scode, edate, grade)
VALUES
('C312', '96414404', '98/03/03', 85);

rollback;

--9. �й��� ������û�� ������ ���� ���� ��û ����
UPDATE enrollments
SET lcode =  'C301'
WHERE scode='92514023' AND lcode='C401';

UPDATE enrollments
SET lcode =  'C301', edate=sysdate, grade = null 
WHERE scode='92514023' AND lcode='C401';


rollback;

--10. �л��� ���� ��û�� Ư�� ���� ���� ��û ����
DELETE
FROM enrollments
WHERE scode = '92414033' AND lcode = 'C401';

rollback;













