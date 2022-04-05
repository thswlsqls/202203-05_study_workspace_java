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

/* �л� */
CREATE TABLE M_Students (
	studentCode NUMBER(8) NOT NULL, /* �����ȣ */
	name VARCHAR2(45) NOT NULL, /* ���� */
	birth DATE NOT NULL, /* ������� */
	gender CHAR(1) NOT NULL, /* ���� */
	education VARCHAR2(200) NOT NULL /* ��Ű�(�� �Ǵ� �����⵵) */
);

COMMENT ON TABLE M_Students IS '�л�';
COMMENT ON COLUMN M_Students.studentCode IS '�����ȣ';
COMMENT ON COLUMN M_Students.name IS '����';
COMMENT ON COLUMN M_Students.birth IS '�������';
COMMENT ON COLUMN M_Students.gender IS '����';
COMMENT ON COLUMN M_Students.education IS '��Ű�(�� �Ǵ� �����⵵)';

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

/* �л�_���� */
CREATE TABLE M_StudentScores (
	studentGradeNumber NUMBER NOT NULL, /* �л�_����_�Ϸù�ȣ */
	studentCode NUMBER(8) NOT NULL, /* �����ȣ */
	subjectCode NUMBER(2), /* ����_�����ڵ� */
	sectionCode NUMBER(2) NOT NULL, /* ����_�����ڵ� */
	score NUMBER(3), /* ǥ������ */
	percent NUMBER(3), /* ����� */
	grade NUMBER(1) /* ��� */
);

COMMENT ON TABLE M_StudentScores IS '�л�_����';
COMMENT ON COLUMN M_StudentScores.studentGradeNumber IS 'sequence - sequence_studentGradeNumber';
COMMENT ON COLUMN M_StudentScores.studentCode IS '�����ȣ';
COMMENT ON COLUMN M_StudentScores.subjectCode IS '����_�����ڵ�';
COMMENT ON COLUMN M_StudentScores.sectionCode IS '����_�����ڵ�';
COMMENT ON COLUMN M_StudentScores.score IS 'ǥ������';
COMMENT ON COLUMN M_StudentScores.percent IS '�����';
COMMENT ON COLUMN M_StudentScores.grade IS '���';

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

/* ���� */
CREATE TABLE M_Subjects (
	subjectCode NUMBER(2) NOT NULL, /* ����_�����ڵ� */
	subject VARCHAR2(45) NOT NULL, /* ����_����� */
	sectionCode NUMBER(2) NOT NULL /* ����_�����ڵ� */
);

COMMENT ON TABLE M_Subjects IS '����';
COMMENT ON COLUMN M_Subjects.subjectCode IS '����_�����ڵ�';
COMMENT ON COLUMN M_Subjects.subject IS '����_�����';
COMMENT ON COLUMN M_Subjects.sectionCode IS '����_�����ڵ�';

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

/* ���� */
CREATE TABLE M_Sections (
	sectionCode NUMBER(2) NOT NULL, /* ����_�����ڵ� */
	section VARCHAR2(45) NOT NULL /* ����_������ */
);

COMMENT ON TABLE M_Sections IS '����';
COMMENT ON COLUMN M_Sections.sectionCode IS '����_�����ڵ�';
COMMENT ON COLUMN M_Sections.section IS '����_������';

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
VALUES(20220001, 'ȫ�浿', '03.03.01',  '0', '���Ѱ���б�(1)');
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
VALUES(10, '�ѱ���', 10);
INSERT into
M_Subjects(subjectCode , subject , sectionCode )
VALUES(20, 'ȭ���� �۹�', 20);
INSERT into
M_Subjects(subjectCode , subject , sectionCode )
VALUES(30, 'Ȯ���� ���', 30);
INSERT into
M_Subjects(subjectCode , subject , sectionCode )
VALUES(40, '����', 40);
INSERT into
M_Subjects(subjectCode , subject , sectionCode )
VALUES(50, '��Ȱ�� ����1', 50);
INSERT into
M_Subjects(subjectCode , subject , sectionCode )
VALUES(51, '��������1', 50);
INSERT into
M_Subjects(subjectCode , subject , sectionCode )
VALUES(60, '���Ͼ�1', 60);
SELECT * FROM M_subjects;
DELETE FROM M_subjects;

INSERT into
M_Sections(sectionCode , section)
VALUES(10, '�ѱ���');
INSERT into
M_Sections(sectionCode , section)
VALUES(20, '����');
INSERT into
M_Sections(sectionCode , section)
VALUES(30, '����');
INSERT into
M_Sections(sectionCode , section)
VALUES(40, '����');
INSERT into
M_Sections(sectionCode , section)
VALUES(50, 'Ž��');
INSERT into
M_Sections(sectionCode , section)
VALUES(60, '��2�ܱ���/�ѹ�');
SELECT * FROM M_sections;
DELETE FROM M_sections;



