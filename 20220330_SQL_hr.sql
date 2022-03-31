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
-- 1. 사원번호가 100인 사원의 급여를 확인(PK그룹 조건절)
SELECT employee_id, salary  
FROM employees  
WHERE employee_id=100;  

-- 2. 현재 근무중인 사원은 몇명인지 확인
SELECT count(employee_id)
FROM employees; 

-- 3. 사원 테이블에서 job_id가 AD_VP에 근무하는 사원의 급여 총액과 평균을 확인
SELECT job_id, SUM(salary), AVG(salary)
FROM employees
WHERE job_id='AD_VP'
GROUP BY job_id;

SELECT job_id, SUM(salary), AVG(salary)
FROM employees
GROUP BY job_id
HAVING job_id='AD_VP';

-- 4. 보너스를 받는 사원은 몇명인지 확인SELECT count(employee_id)
SELECT count(employee_id)
FROM employees
WHERE commission_pct IS NOT NULL;

SELECT count(employee_id)
FROM employees
WHERE commission_pct IS NULL;

-- < SQL 단일행함수 실습문제 >
-- EX1. 현재 날짜를 표시하는 질의를 작성하고 열 레이블을 Date로 지정한다.
SELECT sysdate "Date"
FROM DUAL;

-- EX2. 사원 번호, 이름, 급여 및 15% 인상된 급여를 정수로 표시하고 열 레이블을 New salary 로 한다.
SELECT employee_id,
	   first_name || last_name,
	   salary,
	   salary * 1.15 NewSalary
FROM employees;

-- EX3. 급여 인상분(새 급여에서 이전 급여를 뺀 값)을 추가하도록 수정하고 열 레이블을 Increase로 지정한다.
SELECT employee_id,
	   first_name || last_name,
	   salary,
	   salary * 1.15 NewSalary,
	   salary * 0.15 Increase
FROM employees;

-- EX4. 사원 이름, 입사일 및 급여 검토일을 표시한다.      
-- 급여 검토일은 여섯 달 근무 후 해당하는 첫 번째 월요일입니다. 
-- 열 레이블은 REVIEW로 지정하고 날짜는 "yyyy-mm-dd"과 같은 형식으로 표시되도록 지정합니다.

SELECT 
	first_name
	, hire_date
	, TO_CHAR(TRUNC(ADD_MONTHS(hire_date, 6)+7, 'IW'), 'yyyy-mm-dd') REVIEW
FROM employees;

SELECT 
	first_name
	, hire_date
	, TO_CHAR(NEXT_DAY(ADD_MONTHS(hire_date, 6), '월요일'), 'yyyy-mm-dd') REVIEW
FROM employees;



-- EX5. 사원의 이름, 근무월수(입사일로부터 현재까지 월수)를 계산하며 열레이블을 MONTHS_WORKED로 지정합니다. 
-- 결과는 정수로 반올림하여 표시하고 오래 근무한 사원부터 출력하시오. 
SELECT employee_id,
       first_name,
	   ROUND(MONTHS_BETWEEN(sysdate, hire_date)) MONTHS_WOEKED
FROM employees
ORDER BY MONTHS_WOEKED;

-- EX6. 각 사원에 대해 다음 항목을 생성하는 질의를 작성합니다.
-- <employee name> earns <salary> monthly but wants <3 times salaryary>. 
-- 열 레이블을 “Wanted wage“로 지정합니다.
-- 출력예 : King earns 24000 monthly but wants 72000
SELECT first_name || ' earns ' || salary || ' monthly but wants ' || salary*3 
FROM employees;


-- EX7. 모든 사원의 이름 및 급여를 표시하는 질의를 작성합니다, 
-- 급여는 15자 길이로 왼쪽에 $ 기호가 붙는 형식으로 표기하고 열 레이블은 salary 로 지정합니다.
SELECT first_name
	   , RPAD(TO_CHAR(salary, '$999999.99'), 15, ' ') as salary
FROM employees;

-- EX8. 이름이 J, A 또는 M으로 시작하는 모든 사원의 이름(첫 글만 대문자로) 및 이름 길이를 표시하시오.
SELECT 
	INITCAP(first_name||last_name)
FROM employees
WHERE first_name LIKE'J%' OR first_name LIKE 'M%';

-- EX9. 이름, 입사일 및 업무 시작 요일을 표시하고 열 레이블을 DAY로 지정합니다. 일요일 ~ 토요일 순으로 정렬
SELECT first_name
	   , hire_date
	   , TO_CHAR(hire_date, 'DY') "DAY"
FROM employees
ORDER BY "DAY"; 

-- EX10. 사원 이름 및 급여와 커미션합계를 표시하는 질의를 작성합니다. 열이름은 TOTAL 로 지정한다.
-- 커미션을 받으면 사원은 'Yes'으로 표시하고, 아니면 'No'로 표시하고 
-- 열 레이블은 COMMISSION으로 지정합니다.
SELECT 
	first_name
	, salary + salary*commission_pct
	, CASE WHEN NVL(commission_pct, 0) = 0 THEN 'No'
	   ELSE 'Yes' END
FROM employees;

-- EX11. 사원의 이름을 표시하고 급여 총액을 별표(*)로 나타내는 질의를 작성합니다. 
 -- 각 별표는 1000달러를 나타냅니다. 
   -- 급여 기준으로 데이터를 내림차순으로 정렬하고 열 레이블을 EMPLOYEE_GREAD 로 지정합니다.

SELECT 
  first_name||last_name
	, department_id
	, ROUND(sum(salary)/1000,2) || '*'
FROM employees
GROUP BY department_id, first_name||last_name;

-- EX12. 사원의 이름, 직무, 직무 열의 값을 기준으로 모든 사원의 등급을 표시하는 질의를 작성합니다.

        --job_id 가   'CLERK'로 끝나면   =>  '☆'
          --             'REP'로 끝나면     => '☆☆'
            --           'MAN'로 끝나면    => '☆☆☆'

   --그 밖은 공백으로 표시하시오. 열 레이블은 "GRADE"로 지정합니다.
   
SELECT 
  first_name || last_name
  , job_id
  , CASE WHEN job_id LIKE '%CLERK' THEN '☆'
         WHEN job_id LIKE '%REP' THEN '☆☆'
         WHEN job_id LIKE '%MAN' THEN '☆☆☆'
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

--< SQL 그룹 함수 실습문제  >
--
--EX1. 모든 사원의 급여 최고액, 최저액, 총액 및 평균액을 표시합니다. 
--      열 레이블을 각각 Maximun, Minimum, Sum 및 Average로 지정하고 결과를 정수로 반올림하는 질의를 작성하시오.
SELECT 
  ROUND(MAX(salary)) Maximun
  , ROUND(MIN(salary)) Minimum
  , ROUND(SUM(salary)) Sum
  , ROUND(AVG(salary)) Average
FROM employees;
--
--EX2. 각 직무에 대한 급여 최저액, 최고액, 총액 및 평균액을 표시하도록 한다. 
--      평균은 소숫점 둘째자리까지 표현하시오.
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
--EX3. 직무가 동일한 사원의 수를 표시하는 질의를 작성하시오.

SELECT 
  job_id 직무
  , count(employee_id) 사원의수
FROM 
  employees
GROUP BY 
  job_id;

--
--EX4. 관리자 목록 없이 관리자 수만 표시하고 열 레이블을 Number of Managers로 지정합니다.
SELECT 
   count(DISTINCT manager_id) "Number of Managers"
FROM employees
WHERE manager_id IS NOT NULL;

--
--EX5. 최고 급여와 최저 급여의 차액을 표시하는 질의를 작성하고 열 레이블을 DIFFERENCE로 지정하시오.
SELECT
  MAX(salary)-MIN(salary) DIFFERENCE
FROM employees;


--EX6. 관리자 번호 및 해당 관리자에 속한 사원의 최저 급여, 인원수를 표시합니다. 
--      관리자를 알 수 없는 사원 및 최저 급여가 $5000 미만인 그룹 제외시키고 
--      급여를 기준으로 출력 결과를 내림차순으로 정렬하시오.
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

--EX7. 부서별 직무별 인원수 및  평균급여를 표시하는 질의를 작성하시오.
--        단, 평균 급여를 소수점 둘째 자리에서 반올림하고, 
--             부서번호 순으로 정렬하고 부서가 같으면 평균급여가 높은 직무순으로 정렬하시오.
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
--EX8. 총 사원의 수 및 2002,2003, 2004,2005년에 입사한 사원 수를 표시하는 질의를 작성하고 
--      적합한 열 머리글을 지정합니다.

--출력 예 ) 
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

-- 1. employees 테이블에서 first_name이 A로 시작하는 사원의 사번, 이름, 부서아이디, 부서명을 출력함
SELECT
  e.employee_id
  , e.first_name
  , d.department_id
  , d.department_name
FROM employees e JOIN departments d
ON e.department_id = d.department_id
AND first_name LIKE 'A%';
  
  
  
-- 2. salary가 3000과 5000사이인 사원의 사번, 이름, 부서명, 직무제목, 지역 우편번호, 국가명, 지역명을 출력함                                       
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

-- 3. 잡아이디가 IT로 시작하는 부서에 속한 사원의 사번, 이름, 부서명, 급여를 출력함                         
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

-- 4.  사원의 사번, 이름, 부서명, 잡히스토리 횟수를 출력하되 잡히스토리가 2회 이상인 사원만 출력함                      
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
  
  
--  스터디 문제 공유
-- 1. 각 부서별로 최대 급여를 가진 사람의 사번, a부서번호, 이름, 이메일, 급여
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

-- 2. 급여가 5000미만이면 C, 5000이상 10000미만이면 B, 10000이상이면 A로 해서 등급을 매기고 
-- 사원의 번호, 이름, 부서명, 급여, 급여등급을 출력하고 사원번호 기준 오름차순으로 정렬함
SELECT 
  e.employee_id
  , e.first_name || e.last_name
  , d.department_name
  , e.salary
  , CASE WHEN salary < 5000 THEN 'C'
         WHEN salary < 10000 THEN 'B'
         ELSE 'A' END 급여등급
FROM employees e, departments d     
WHERE e.department_id = d.department_id     
ORDER BY employee_id;    









  