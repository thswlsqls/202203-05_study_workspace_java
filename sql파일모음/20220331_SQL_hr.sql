SELECt * FROM student_list;

INSERT INTO student_list(student_id, name, in_date)
VALUES('200101001', '김학생', sysdate);

DELETE FROM student_list;

UPDATE student_list
SET total_score=35
WHERE student_id = '200101001';

-- 학생 정보를 초기에 입력
INSERT INTO
student_list(student_id, name, total_score, in_date)
VALUES('200101002', '박학생', NULL, sysdate);


-- 성적을 입력하기 전에 일련번호를 담당할 객체
CREATE SEQUENCE score_seq;
--  INCREMENT BY 1 MAXVALUE 5000 CYCLE;

-- 연습삼아
SELECT score_seq.nextval FROM dual;

-- 200101001 학생의 국어, 영어 접수를 입력함
INSERT INTO
score_list
VALUES(score_seq.nextval, '200101001', '국어', 10);

INSERT INTO
score_list
VALUES(score_seq.nextval, '200101001', '영어', 20);

SELECT * FROM score_list;

-- 200101001 학생의 총점을 확인함
SELECT total_score
FROM student_list
WHERE student_id = '200101001';

SELECT 
  student_id
  ,sum(score)
FROM score_list
WHERE student_id = '200101001'
GROUP BY student_id;

-- 과목별 점수를 입력하면 학생정보의 총점이 수정됨 = SQL 여러 개로 처리
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


-- 점수 테이블을 임시 테이블로 복사하고 2개 이상 입력된 과목은 삭제
CREATE table new_score_list
as 
  SELECT * FROM score_list
;

SELECT * FROM new_score_list;
 
-- 점수테이블을 임시 테이블로 복사, 2개 이상 입력된 과목은 삭제(200101001)
INSERT INTO
new_score_list
VALUES(score_seq.nextval, '200101001', '영어', 20);
 
DELETE
FROM new_score_list
WHERE (student_id = '200101001') AND (subject = '영어')
AND 
  ((
    SELECT count(subject)
    FROM new_score_list
    WHERE student_id = '200101001' AND subject = '영어'
  ) >= 2);
  
DELETE
FROM new_score_list
WHERE (student_id = '200101001') AND (subject = '국어')
AND 
  ((
    SELECT count(subject)
    FROM new_score_list
    WHERE student_id = '200101001' AND subject = '국어'
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

-- 1. -HR적용 시 요구사항 및 쿼리
--EMPLOYEES 테이블에서 부서번호가 20번인 부서의 평균 급여(소수점 및 정수는 크게 상관하지 않는다. )보다 많은 근무자(사원 및 대표이사를 포함한 모든 사내 구성원)들의 사원번호, 이름(FIRST_NAME), 급여를 출력하시오.
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


-- 2. 도시별로 해당 장소에서 근무하는 사원 수 출력 
--도시 이름, 사원 수

SELECT l.city, count(e.employee_id)
FROM employees e, locations l, departments d
WHERE e.department_id = d.department_id
AND d.location_id = l.location_id
GROUP BY l.city;

SELECT city, COUNT(employee_id)
FROM employees, departments, locations 
WHERE departments.location_id = locations.location_id AND departments.department_id = employees.department_id
GROUP BY city;


-- 3. 요구사항 부서번호, 직무, 이름을 출력한 후 직무가 AD_PRES 인 사람을 출력하세요.

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
-- 사원 테이블에서 사원 이름, 입사일 및 1차연봉협상일을 표시한다.      
-- 1차연봉협상일은 12달 근무 후 해당하는 첫 번째 수요일입니다. 
-- 열 레이블은 REVIEW로 지정하고 날짜는 "yyyy-mm-dd"과 같은 형식으로 표시되도록 지정합니다.
-- SELECT
  
-- Popp과 같은 해에 입사한 사원의 이름을 출력하세요
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


---- 사원 테이블에서 사원 이름, 입사일 및 1차연봉협상일을 표시한다.      
-- 1차연봉협상일은 12달 근무 후 해당하는 첫 번째 수요일입니다. 
-- 열 레이블은 REVIEW로 지정하고 날짜는 "yyyy-mm-dd"과 같은 형식으로 표시되도록 지정합니다.

SELECT
  first_name
  , hire_date
  , TO_CHAR(TRUNC(ADD_MONTHS(hire_date, 12)+7, 'iw')+2, 'yyyy-mm-dd') REVIEW
FROM
  employees;
--  TRUNC(date, 'iw') -> 주초 월요일자 시분초절삭해 출력함
  
SELECT first_name || ' ' || last_name AS name
  , TO_CHAR(hire_date, 'YYYY-MM-DD') AS hire_date
  , TO_CHAR(NEXT_DAY( ADD_MONTHS(hire_date, +12) ,'수요일'), 'YYYY-MM-DD') AS review 
FROM employees;






