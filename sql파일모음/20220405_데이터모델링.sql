DROP TABLE M_Students ;
DROP TABLE M_StudentScores ;
DROP TABLE M_Subjects ;
DROP TABLE M_Sections ;

DROP TABLE M0405Students ;
DROP TABLE M0405StudentScores ;
DROP TABLE M0405Subjects ;
DROP TABLE M0405Sections ;

DROP TABLE M220405_Students ;
DROP TABLE M220405_Student_Scores ;
DROP TABLE M220405_Subjects ;
DROP TABLE M220405_Sections ;

DROP TABLE MISSION_220405_Students ;
DROP TABLE MISSION_220405_Student_Scores ;

/* 학생 */
CREATE TABLE M_Students (
	studentCode NUMBER(8) NOT NULL, /* 수험번호 */
	name VARCHAR2(45) NOT NULL, /* 성명 */
	birth DATE NOT NULL, /* 생년월일 */
	gender CHAR(1) NOT NULL, /* 성별 */
	education VARCHAR2(200) NOT NULL /* 출신고교(반 또는 졸업년도) */
);

COMMENT ON TABLE M_Students IS '학생';
COMMENT ON COLUMN M_Students.studentCode IS '수험번호';
COMMENT ON COLUMN M_Students.name IS '성명';
COMMENT ON COLUMN M_Students.birth IS '생년월일';
COMMENT ON COLUMN M_Students.gender IS '성별';
COMMENT ON COLUMN M_Students.education IS '출신고교(반 또는 졸업년도)';

CREATE UNIQUE INDEX PK_M_Students
	ON M_Students (
		studentCode ASC
	);

ALTER TABLE M_Students
	ADD
		CONSTRAINT PK_M_Students
		PRIMARY KEY (
			studentCode
		);

/* 학생_성적 */
CREATE TABLE M_StudentScores (
	studentGradeNumber NUMBER NOT NULL, /* 학생_성적_일련번호 */
	studentCode NUMBER(8) NOT NULL, /* 수험번호 */
	subjectCode NUMBER(2), /* 과목_과목코드 */
	sectionCode NUMBER(2) NOT NULL, /* 영역_영역코드 */
	score NUMBER(3), /* 표준점수 */
	percent NUMBER(3), /* 백분위 */
	grade NUMBER(1) /* 등급 */
);

COMMENT ON TABLE M_StudentScores IS '학생_성적';
COMMENT ON COLUMN M_StudentScores.studentGradeNumber IS 'sequence - sequence_studentGradeNumber';
COMMENT ON COLUMN M_StudentScores.studentCode IS '수험번호';
COMMENT ON COLUMN M_StudentScores.subjectCode IS '과목_과목코드';
COMMENT ON COLUMN M_StudentScores.sectionCode IS '영역_영역코드';
COMMENT ON COLUMN M_StudentScores.score IS '표준점수';
COMMENT ON COLUMN M_StudentScores.percent IS '백분위';
COMMENT ON COLUMN M_StudentScores.grade IS '등급';

CREATE UNIQUE INDEX PK_M_StudentScores
	ON M_StudentScores (
		studentGradeNumber ASC
	);

ALTER TABLE M_StudentScores
	ADD
		CONSTRAINT PK_M_StudentScores
		PRIMARY KEY (
			studentGradeNumber
		);

/* 과목 */
CREATE TABLE M_Subjects (
	subjectCode NUMBER(2) NOT NULL, /* 과목_과목코드 */
	subject VARCHAR2(45) NOT NULL, /* 과목_과목명 */
	sectionCode NUMBER(2) NOT NULL /* 영역_영역코드 */
);

COMMENT ON TABLE M_Subjects IS '과목';
COMMENT ON COLUMN M_Subjects.subjectCode IS '과목_과목코드';
COMMENT ON COLUMN M_Subjects.subject IS '과목_과목명';
COMMENT ON COLUMN M_Subjects.sectionCode IS '영역_영역코드';

CREATE UNIQUE INDEX PK_M_Subjects
	ON M_Subjects (
		subjectCode ASC
	);

ALTER TABLE M_Subjects
	ADD
		CONSTRAINT PK_M_Subjects
		PRIMARY KEY (
			subjectCode
		);

/* 영역 */
CREATE TABLE M_Sections (
	sectionCode NUMBER(2) NOT NULL, /* 영역_영역코드 */
	section VARCHAR2(45) NOT NULL /* 영역_영역명 */
);

COMMENT ON TABLE M_Sections IS '영역';
COMMENT ON COLUMN M_Sections.sectionCode IS '영역_영역코드';
COMMENT ON COLUMN M_Sections.section IS '영역_영역명';

CREATE UNIQUE INDEX PK_M_Sections
	ON M_Sections (
		sectionCode ASC
	);

ALTER TABLE M_Sections
	ADD
		CONSTRAINT PK_M_Sections
		PRIMARY KEY (
			sectionCode
		);

ALTER TABLE M_StudentScores
	ADD
		CONSTRAINT FK_M_studentCode
		FOREIGN KEY (
			studentCode
		)
		REFERENCES M_Students (
			studentCode
		);

ALTER TABLE M_StudentScores
	ADD
		CONSTRAINT FK_M_subjectCode
		FOREIGN KEY (
			subjectCode
		)
		REFERENCES M_Subjects (
			subjectCode
		);

ALTER TABLE M_StudentScores
	ADD
		CONSTRAINT FK_M_sectionCode
		FOREIGN KEY (
			sectionCode
		)
		REFERENCES M_Sections (
			sectionCode
		);

ALTER TABLE M_Subjects
	ADD
		CONSTRAINT FK_M_sectionCode
		FOREIGN KEY (
			sectionCode
		)
		REFERENCES M_Sections (
			sectionCode
		);
    
CREATE SEQUENCE sequence_studentGradeNumber 
	INCREMENT BY 1;
    
INSERT into
M_Students(studentCode, name, birth, gender, education)
VALUES(20220001, '홍길동', '03.03.01',  '0', '대한고등학교(1)');
SELECT * FROM M_students;

INSERT into
M_StudentScores (studentGradeNumber , studentCode , subjectCode , sectionCode , score, percent , grade)
VALUES(sequence_studentGradeNumber.nextval, '20220001', NULL, 10, NULL, NULL, 1 );
INSERT into
M_StudentScores (studentGradeNumber , studentCode , subjectCode , sectionCode , score, percent , grade)
VALUES(sequence_studentGradeNumber.nextval, '20220001', 20, 20, 133, 98, 1 );
INSERT into
M_StudentScores (studentGradeNumber , studentCode , subjectCode , sectionCode , score, percent , grade)
VALUES(sequence_studentGradeNumber.nextval, '20220001', 30, 30, 114, 69, 4 );
INSERT into
M_StudentScores (studentGradeNumber , studentCode , subjectCode , sectionCode , score, percent , grade)
VALUES(sequence_studentGradeNumber.nextval, '20220001', NULL, 40, NULL, NULL, 1 );
INSERT into
M_StudentScores (studentGradeNumber , studentCode , subjectCode , sectionCode , score, percent , grade)
VALUES(sequence_studentGradeNumber.nextval, '20220001', 50, 50, 64, 91, 2 );
INSERT into
M_StudentScores (studentGradeNumber , studentCode , subjectCode , sectionCode , score, percent , grade)
VALUES(sequence_studentGradeNumber.nextval, '20220001', 51, 50, 62, 87, 3 );
INSERT into
M_StudentScores (studentGradeNumber , studentCode , subjectCode , sectionCode , score, percent , grade)
VALUES(sequence_studentGradeNumber.nextval, '20220001', NULL, 60, NULL, NULL, 1 );
DELETE FROM M_studentScores;
SELECT * FROM M_studentScores;


INSERT into
M_Subjects(subjectCode , subject , sectionCode )
VALUES(10, '한국사', 10);
INSERT into
M_Subjects(subjectCode , subject , sectionCode )
VALUES(20, '화법과 작문', 20);
INSERT into
M_Subjects(subjectCode , subject , sectionCode )
VALUES(30, '확률과 통계', 30);
INSERT into
M_Subjects(subjectCode , subject , sectionCode )
VALUES(40, '영어', 40);
INSERT into
M_Subjects(subjectCode , subject , sectionCode )
VALUES(50, '생활과 윤리1', 50);
INSERT into
M_Subjects(subjectCode , subject , sectionCode )
VALUES(51, '지구과학1', 50);
INSERT into
M_Subjects(subjectCode , subject , sectionCode )
VALUES(60, '독일어1', 60);
SELECT * FROM M_subjects;
DELETE FROM M_subjects;

INSERT into
M_Sections(sectionCode , section)
VALUES(10, '한국사');
INSERT into
M_Sections(sectionCode , section)
VALUES(20, '국어');
INSERT into
M_Sections(sectionCode , section)
VALUES(30, '수학');
INSERT into
M_Sections(sectionCode , section)
VALUES(40, '영어');
INSERT into
M_Sections(sectionCode , section)
VALUES(50, '탐구');
INSERT into
M_Sections(sectionCode , section)
VALUES(60, '제2외국어/한문');
SELECT * FROM M_sections;
DELETE FROM M_sections;



