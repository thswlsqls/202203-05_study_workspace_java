drop table score_list;
drop table student_list;

/* 학생 */
CREATE TABLE Student_List (
	student_id VARCHAR2(20) NOT NULL, /* 학번 */
	name VARCHAR2(20) NOT NULL, /* 이름 */
	total_score NUMBER(5), /* 총점 */
	in_date DATE NOT NULL /* 등록_날짜 */
);

COMMENT ON TABLE Student_List IS '학생';

COMMENT ON COLUMN Student_List.student_id IS '학번';

COMMENT ON COLUMN Student_List.name IS '이름';

COMMENT ON COLUMN Student_List.total_score IS '총점';

COMMENT ON COLUMN Student_List.in_date IS '등록_날짜';

CREATE UNIQUE INDEX PK_Student_List
	ON Student_List (
		student_id ASC
	);

ALTER TABLE Student_List
	ADD
		CONSTRAINT PK_Student_List
		PRIMARY KEY (
			student_id
		);

/* 학생_과목_점수 */
CREATE TABLE Score_List (
	score_seq NUMBER NOT NULL, /* 학생_과목_점수_일련번호 */
	student_id VARCHAR2(20) NOT NULL, /* 학번 */
	subject VARCHAR2(30) NOT NULL, /* 과목명(중복되지않게) */
	score NUMBER(3) NOT NULL /* 점수 */
);

COMMENT ON TABLE Score_List IS '학생_과목_점수';

COMMENT ON COLUMN Score_List.score_seq IS '학생_과목_점수_일련번호';

COMMENT ON COLUMN Score_List.student_id IS '학번';

COMMENT ON COLUMN Score_List.subject IS '과목명(중복되지않게)';

COMMENT ON COLUMN Score_List.score IS '점수';

CREATE UNIQUE INDEX PK_Score_List
	ON Score_List (
		score_seq ASC
	);

ALTER TABLE Score_List
	ADD
		CONSTRAINT PK_Score_List
		PRIMARY KEY (
			score_seq
		);

ALTER TABLE Score_List
	ADD
		CONSTRAINT FK_Student_List_TO_Score_List
		FOREIGN KEY (
			student_id
		)
		REFERENCES Student_List (
			student_id
		);