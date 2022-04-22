/* 사용자들 */
CREATE TABLE USERS (
	id VARCHAR2(20) NOT NULL, /* 아이디 */
	student_id VARCHAR2(20) NOT NULL, /* 학번 */
	password VARCHAR2(20), /* 비밀번호 */
	name VARCHAR2(20), /* 이름 */
	email VARCHAR2(40), /* 이메일 */
	phone_number VARCHAR2(20), /* 전화번호 */
	gender VARCHAR2(10), /* 성별 */
	birthday VARCHAR2(20), /* 생년월일 */
	hobby VARCHAR2(80) /* 취미 */
);

COMMENT ON TABLE USERS IS '사용자들';

COMMENT ON COLUMN USERS.id IS '아이디';

COMMENT ON COLUMN USERS.student_id IS '학번';

COMMENT ON COLUMN USERS.password IS '비밀번호';

COMMENT ON COLUMN USERS.name IS '이름';

COMMENT ON COLUMN USERS.email IS '이메일';

COMMENT ON COLUMN USERS.phone_number IS '전화번호';

COMMENT ON COLUMN USERS.gender IS '성별';

COMMENT ON COLUMN USERS.birthday IS '생년월일';

COMMENT ON COLUMN USERS.hobby IS '취미';

CREATE UNIQUE INDEX PK_USERS
	ON USERS (
		id ASC
	);

ALTER TABLE USERS
	ADD
		CONSTRAINT PK_USERS
		PRIMARY KEY (
			id
		);