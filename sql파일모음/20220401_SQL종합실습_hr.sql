/*
	## 작성자 : 수강생이름을 쓰세요.
	## 파일명 : sqlscript_수강생이름.sql (파일명도 반드시 규칙에 맞게 변경하기 바랍니다.)
                          
	## SQL 종합실습문제 

	-- 제공 받은 SQL script(@@exercise.sql) 파일을 실행시켜 데이터베이스를 초기화 한다.
	-- 데이터베이스에 생성한 테이블 구조 및 초기 레코드가 정상적으로 생성 되었는지 확인한다.

	-- 각 문항에 대해서 SQL 구문을 작성하여 완성된 SQL 구문을 각 문항 문제 아래에 기술하시오.
             -- 조인(join)시 오라클구문, Ansi 표준구문 중 원하는 것을 쓰시오.

	-- 1~ 40번 수행결과를 화면 캡처하여 하나의 파일에 저장한다. 
                -> 문제 번호 , sqlscript, 화면 캡쳐(실행 결과부분만 캡쳐)
                -> 파일명 : screenshot_수강생이름.pdf  저장

	-- 제출 파일명 : ucamp35_수강생이름.zip  
	-- 제출 시간 : 12:30시까지 제출
*/

-- 6번(like), 8번(where), 12번(where), 16번(담당교수), 20번, 29번(order by), 34번(where)  


-- 1. 교수 테이블에서 모든 교수의 이름, 소속학과, 직급을 검색하시오.
SELECT
  pname
  , department
  , position
FROM
  professors;
 


-- 2. 학생 테이블에서 'computer engineering'과에 소속된 학생들의 이름, 학번, 생년월일을 검색하시오.
SELECT
  sname
  , scode
  , birthday
FROM 
  students
WHERE department = 'computer engineering';


-- 3. 교수 테이블에서 임용된지 30년 이상된  교수의 이름 소속학과를 검색하시오.
SELECT
  pname
  , department
FROM 
  professors
WHERE MONTHS_BETWEEN(sysdate, hiredate)/12 >= 30;



-- 4.  학생 테이블에서 교수번호가 '221'인 교수가 지도하지 않는 학생들을 검색하시오.
SELECT
  scode
FROM
  students
WHERE advisor != '221';


-- 5. 수강신청 테이블에서 1998년 3월 1일에서 3월3일 사이에 수강신청 한 강좌번호, 학생번호, 수강신청일을 검색하시오.
SELECT
  lcode
  , scode
  , edate
FROM 
  enrollments
WHERE edate BETWEEN '98/03/01' AND '98/03/03';


-- 6. 강좌 테이블에서 강좌이름이 'DBMS'이라는 단어를 포함하는 강좌의 강좌번호, 강좌이름, 담당교수, 강의시간수를 검색하시오.
SELECT
  lcode
  , lname
  , instructor
  , hours
FROM
  lectures
WHERE 
  lname LIKE '%DBMS%';


-- 7. 학생들의 학과, 학생이름, 지도교수이름을 검색하시오.
SELECT
  s.department
  , s.sname
  , p.pname
FROM
  students s, professors p
WHERE s.advisor = p.pcode;


-- 8. 학생 이름(ChangKim)으로 수강신청한 강좌번호, 수강신청일 검색
SELECT
  e.lcode
  , e.edate
FROM
  enrollments e, students s
WHERE e.scode = s.scode
AND s.sname = 'ChangKim';


-- 9. 'JameLee'과 교수가 지도하는 학생들의 이름, 학년, 생년월일을 검색하시오.
SELECT
  sname
  , year
  , birthday
FROM
  students s, professors p
WHERE s.advisor = p.pcode
AND p.pname = 'JameLee';


-- 10. 'computer engineering'과 교수들이 지도하는 학생들의 이름, 학년, 생년월일을 검색하시오.
SELECT
  sname
  , year
  , birthday
FROM
  students s, professors p
WHERE s.advisor = p.pcode
AND p.department = 'computer engineering';


-- 11. 'fileProcess'을 수강신청 한 학생들의 학번, 수강신청일, 점수를 검색하시오.
SELECT
  s.scode
  , e.edate
  , e.grade
FROM 
  students s, enrollments e, lectures l
WHERE s.scode = e.scode
AND e.lcode = l.lcode
AND l.lname = 'fileProcess';


-- 12. 'computer engineering'과 교수들의 교수이름, 교수들이 강의하는 강좌번호, 강좌명을 검색하시오.
SELECT
  p.pname
  ,l.lcode
  ,l.lname
FROM 
  professors p, lectures l
WHERE p.pcode = l.instructor
AND p.department = 'computer engineering';


-- 13. 'C301'강좌를 수강신청 한 학생들의 학과, 학생이름을 검색하시오.
SELECT
  department
  , sname
FROM 
  students s, enrollments e
WHERE s.scode = e.scode
AND e.lcode = 'C301';


-- 14. 'data structure' 과목을 수강신청 한 학생들의 학과, 학생이름, 성적을 검색하시오.
SELECT
  s.department
  , s.sname
  , e.grade
FROM 
  students s, enrollments e, lectures l
WHERE s.scode = e.scode
AND e.lcode = l.lcode
AND l.lname = 'data structure';


-- 15. 'DBMS'를 강의하는 교수명, 이 과목을 수강신청 한 학생들의 학과, 이름, 성적을 검색하시오.
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


-- 16. 성적이 80점 이상인 학생들의 학번, 학생이름, 강좌번호, 강좌명, 담당교수 명을 검색하시오.
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


-- 17. 'JameLee' 교수가 지도하는 학생들의 학과, 학생이름, 각 학생들이 수강신청 한 강좌명, 성적을 검색하시오.
-- 단, 성적이 없는 경우에는 미응시로 표기하시오
SELECT
  s.department
  , s.sname
  , l.lname
  , CASE WHEN NVL(e.grade, 0) = 0 THEN '미응시'
  ELSE TO_CHAR(e.grade) END
FROM 
  students s, enrollments e, lectures l, professors p
WHERE s.scode = e.scode
AND s.advisor = p.pcode
AND e.lcode = l.lcode
AND p.pname = 'JameLee';

-- 18. computer engineering과 교수들의 평균 급여액수를 구하시오.
-- 단, 급여는 천단위마다 콤마표기 및 지역 통화기호도 함께 표기하시오.
SELECT
  TO_CHAR(AVG(salary), '$999,999,999.9')
FROM
  professors
WHERE department = 'computer engineering'
GROUP BY department;


-- 19. 수강신청 한 과목별 최고점수와 최저점수 를 구하시오.
SELECT
  lcode
  , MAX(grade)
  , MIN(grade)
FROM enrollments
GROUP BY lcode;


-- 20. 수강신청 한 과목들 중에서 최고 점수를 받은 학생들의 정보를 조회하시오.
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

-- 21. 강좌 강의시간수별로 개설된 강좌수를 구하시오.
SELECT
  hours
  , COUNT(lcode)
FROM 
  lectures
GROUP BY hours;


-- 22. 수강신청 한 학생들은 모두 몇 명인지 구하시오.
SELECT
  COUNT(distinct scode)
FROM
  enrollments;


-- 23. 학생들은 모두 몇 개의 학과에 소속되어 있는지 구하시오.
SELECT
  COUNT(distinct department)
FROM students;


-- 24. 각 학과별 학생들의 수를 구하시오.
SELECT
  department
  , COUNT(scode)
FROM
  students
GROUP BY department;


-- 25. 교수들을 소속학과별, 직급별로 분류하여 각 직급별 평균 급여액수를 구하시오.
SELECT
  department
  , position
  , AVG(salary)
FROM 
  professors
GROUP BY
  department, position;


-- 26. 각 학생들에 대해 학번, 학생이름, 수강신청 과목들의 평균 점수를 구하시오.
SELECT
  s.scode
  , s.sname
  , AVG(e.grade)
FROM 
  enrollments e, students s
WHERE e.scode = s.scode
GROUP BY 
  s.scode, s.sname;


-- 27. 강의실 '510'호에서 강의하는 교수의 교수번호, 교수이름, 소속학과를 검색하시오.
SELECT
  DISTINCT pcode
  , pname
  , department
FROM
  professors p, lectures l
WHERE p.pcode = l.instructor
AND l.room = '510';


-- 28. 'SIKang' 교수가 지도하지 않는 모든 학생들의 이름, 소속학과, 학년을 검색하시오.
SELECT
  s.sname
  , s.department
  , s.year
FROM 
  students s, professors p
WHERE s.advisor = p.pcode
AND p.pname != 'SIKang';


-- 29. 수강신청 평균점수가 85점 이상인 학생들의 학생번호, 학생이름, 평균 점수를 평균점수가 높은 순으로 출력하시오.
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

 
-- 30. 강의시간수가 '2'시간인 강좌를 수강신청 한 학생들의 학과, 학번, 학생이름, 학년을 검색하시오.
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



-- 31. 'JameLee' 교수가 강의하는 강좌를 수강신청한 학생들의 학과, 학번, 학생이름을 검색하시오.
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
 

-- 32. 전체 학생의 30% 이상이 수강신청한 강좌의 번호를 검색하시오.
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

-- 33.'1998년 3월3일' 이전에 발생한 모든 수강신청 데이터를 OldEnrollments테이블로 복사후 조회하시오.
-- 단, old_enrollments 테이블은 기존의 enrollments 테이블의 구조를 복사하여 테이블을 생성하시오.
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


-- 34. 수강신청인원수가 80명 이상인 강좌를 강의하는 교수들의 급여를 500,000원 인상하시오.
-- 단, 인상전 해당 교수의 교수번호, 급여정보를 조회하시오.
-- 단, 해당 교수 급여정보를 변경후 인상후 해당 교수의 교수번호, 급여정보를 조회하시오.
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

-- 35. 'HanOh' 교수가 강의하는 강좌를 신청한 수강신청 데이터를 삭제하시오.
-- 단, 수행결과화면에 삭제한 행수의 결과를 표기하시오.

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
      
-- 36. 교수 전체정보를 조회하시오.
SELECT
  pcode
FROM
  professors;

-- 37.'HanOh' 교수의 직급을 'assistant professor'에서 'associate professor'로 변경하시오.
-- 단, 수행결과화면에 변경한 행수의 결과를 표기하시오.
UPDATE professors p
SET p.position = 'associate professor'
WHERE p.pname = 'HanOh';


--38. 수강신청 한 과목에 대해 성적을 아직 받지 못한 수강신청 데이터를 삭제하시오.
-- 단, 수행결과화면에 삭제한 행수의 결과를 표기하시오.
-- 단, 삭제 후 수강신청 전체정보를 조회하시오.
DELETE
FROM enrollments e
WHERE NVL(e.grade, 0) = 0;



--Oracle 에서 기본적으로 제공하는 테이블을 응용

-- 39. 사원의 최고 급여, 최저 급여, 최고급여와 최저 급여의 차이를 확인하시오
SELECT
  MAX(salary)
  , MIN(salary)
  , MAX(salary) - MIN(salary)
FROM
  employees;


-- 40. 관리자 번호 및 해당 관리자에 속한 사원의 최저 급여, 인원수를 표시합니다. 
--      관리자를 알 수 없는 사원 및 최저 급여가 3000 이상인 그룹 제외시키고 
--      급여를 기준으로 출력 결과를 내림차순으로 정렬하시오.

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









