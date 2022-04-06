SELECT
  e.employee_id
  , e.first_name || e.last_name
  , e.salary
  , d.department_name
FROM employees e, departments d
WHERE e.department_id = d.department_id
AND department_name = 'IT';

SELECT * FROM employees;

--우리 회사의 최대 금액, 최소 급여, 그 급여 차이 확인
SELECT
  MAX(salary)
  , MIN(salary)
  , MAX(salary) - MIN(salary)
FROM employees;

SELECT
  employee_id
  , first_name || last_name
  , salary
FROM employees
WHERE employee_id = 107;

CREATE table user_data
(
  user_id VARCHAR2(10) PRIMARY KEY
  , name VARCHAR2(20) NOT NULL
  , point NUMBER(3) NOT NULL
  , in_date DATE  NOT NULL
);

DESC user_data;

CREATE SEQUENCE user_data_id_SEQ
  INCREMENT BY 1;
DROP SEQUENCE user_data_id_SEQ;

INSERT INTO user_data
(user_id, name, point,  in_date) 
VALUES
('a001', '김사람', 90, sysdate);

INSERT INTO user_data
(user_id, name, point,  in_date) 
VALUES
('a002', '박사람', 100, sysdate);

DELETE FROM user_data;
DROP TABLE user_data;
SELECT * FROM user_data;

commit;


	/**특정 회원의 포인트를 기존 포인트에 15를 추가*/
UPDATE user_data
SET point = point+15
WHERE user_id = 'a001';
	
	/**특정 회원의 정보를 삭제*/
DELETE
FROM user_data
WHERE user_id = 'a001';




