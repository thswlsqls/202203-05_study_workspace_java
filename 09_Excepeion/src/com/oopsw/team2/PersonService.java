package com.oopsw.team2;

import java.util.Collection;

public interface PersonService {
	
	/* �̸� 50�ڱ��� ��� */
	void addPerson(Object p);
	
	/* ���� Ȯ�� */
	Collection<Object> getPersons();
	
}



