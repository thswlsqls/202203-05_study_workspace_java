SELECT * FROM enrollments;
SELECT * FROM lectures;
SELECT * FROM professors;

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


-- 20. 수강신청 한 과목들 중에서 최고 점수를 받은 학생들의 정보를 조회하시오.
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


-- 37.'HanOh' 교수의 직급을 'assistant professor'에서 'associate professor'로 변경하시오.
-- 단, 수행결과화면에 변경한 행수의 결과를 표기하시오. 급여도 500000 추가
UPDATE professors p
SET p.position = 'associate professor', p.salary=salary+500000
WHERE p.pname = 'HanOh';

SELECT * FROM professors WHERE pname = 'HanOh';

rollback;

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
