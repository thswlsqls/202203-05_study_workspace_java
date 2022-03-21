package JavaMission07;

import com.oopsw.school.Person;

public class ScoreImpl implements Score{

	private int[] list;
	private int listIndex; // 0
	
	public ScoreImpl() {
		list = new int[4];
	}

	@Override
	public void addScore(int score) {
		list[listIndex++] = score;
	}

	@Override
	public int[] getScores() {
		return list;
	}

	@Override 
	public int getTotalScore() {
		int sum = 0;
		for (int score : list) {
			sum += score;
		}
		return sum;
	}

	@Override
	public float getAVGScore() {
		float result = (float)getTotalScore()/listIndex;
		return result;
	}

	@Override
	public void addScore(int[] scores) {
		for(int score : scores) {
			addScore(score);
		}
	}

}
