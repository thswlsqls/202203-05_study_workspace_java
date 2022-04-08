SELECT * FROM ENROLLMENTS;
SELECT * FROM LECTURES;
SELECT * FROM STUDENTS;
SELECT * FROM PROFESSORS;

--1. 모든 교수의 번호 확인 //
SELECT 
  pcode
FROM professors; 


--2. 특정 교수(번호)의 소속학과, 임용일자 확인 //
SELECT 
  department
  , hiredate
FROM professors
WHERE pcode = '221';

--3. 특정 과목('DBMS‘) 과목의 강좌 번호 확인 //
SELECT
  lcode
FROM lectures
WHERE lname = 'DBMS';

--4. 특정 강좌(강좌번호)에 해당하는 강좌이름, 강의실, 최대수강인원 확인 //
SELECT
  lname
  , room
  , capacity
FROM lectures
WHERE lcode = 'C301';

--5. 학생 이름(ChangKim)으로 수강신청한 강좌번호 확인
SELECT 
  e.lcode
FROM enrollments e, students s
WHERE e.scode = s.scode
AND s.sname = 'ChangKim';

--6. 특정 학과('computer engineering‘)과 교수들이 지도하는 학생들의 학번,
--이름 확인 //
SELECT 
  s.scode
  , s.sname
FROM students s, professors p
WHERE s.advisor = p.pcode
AND p.department = 'computer engineering';
  
--7. 특정 학생 정보 등록(단 학생번호는 PK)
INSERT INTO students
(scode, sname, department, year, birthday, advisor)
VALUES
('92414505', 'NamPark', 'computer engineering', 3, '73/11/11', '221');

rollback;
--8. 학생정보를 기반으로 수강신청
INSERT INTO enrollments
(lcode, scode, edate, grade)
VALUES
('C312', '96414404', '98/03/03', 85);

rollback;

--9. 학번과 수강신청한 과목을 보고 수강 신청 변경
UPDATE enrollments
SET lcode =  'C301'
WHERE scode='92514023' AND lcode='C401';

UPDATE enrollments
SET lcode =  'C301', edate=sysdate, grade = null 
WHERE scode='92514023' AND lcode='C401';


rollback;

--10. 학생이 수강 신청한 특정 과목 수강 신청 삭제
DELETE
FROM enrollments
WHERE scode = '92414033' AND lcode = 'C401';

rollback;













