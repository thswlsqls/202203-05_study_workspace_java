package JavaMission07;

public interface Score {
	
	/**����(1~100)�Է� */
	void addScore(int score);
	
	/** ��� ���� Ȯ��*/
	int[] getScores();
	
	/** ���� ���� Ȯ�� */
	int getTotalScore();
	
	/** ���� ��� Ȯ�� */
	float getAVGScore();	
	
	/** ������ ������ �Ѳ����� �߰� �Է� */
	void addScore(int [] scores); 

}
