package JavaMission07;

public interface Score {
	
	/**성적(1~100)입력 */
	void addScore(int score);
	
	/** 모든 성적 확인*/
	int[] getScores();
	
	/** 성적 총점 확인 */
	int getTotalScore();
	
	/** 성적 평균 확인 */
	float getAVGScore();	
	
	/** 성적을 여러개 한꺼번에 추가 입력 */
	void addScore(int [] scores); 

}
