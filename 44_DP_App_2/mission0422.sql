/* ����ڵ� */
CREATE TABLE USERS (
	id VARCHAR2(20) NOT NULL, /* ���̵� */
	student_id VARCHAR2(20) NOT NULL, /* �й� */
	password VARCHAR2(20), /* ��й�ȣ */
	name VARCHAR2(20), /* �̸� */
	email VARCHAR2(40), /* �̸��� */
	phone_number VARCHAR2(20), /* ��ȭ��ȣ */
	gender VARCHAR2(10), /* ���� */
	birthday VARCHAR2(20), /* ������� */
	hobby VARCHAR2(80) /* ��� */
);

COMMENT ON TABLE USERS IS '����ڵ�';

COMMENT ON COLUMN USERS.id IS '���̵�';

COMMENT ON COLUMN USERS.student_id IS '�й�';

COMMENT ON COLUMN USERS.password IS '��й�ȣ';

COMMENT ON COLUMN USERS.name IS '�̸�';

COMMENT ON COLUMN USERS.email IS '�̸���';

COMMENT ON COLUMN USERS.phone_number IS '��ȭ��ȣ';

COMMENT ON COLUMN USERS.gender IS '����';

COMMENT ON COLUMN USERS.birthday IS '�������';

COMMENT ON COLUMN USERS.hobby IS '���';

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