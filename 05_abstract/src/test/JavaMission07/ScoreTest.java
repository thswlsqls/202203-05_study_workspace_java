package test.JavaMission07;

import JavaMission07.Score;
import JavaMission07.ScoreImpl;

public class ScoreTest {
	public static void main(String[] args) {
		Score ssi = new ScoreImpl();
		
		/**
		 * 성적(1~100)입력
		 * */
		ssi.addScore(80);
		ssi.addScore(90);
		System.out.println("성적 입력 - 80, 90");
	
		/**
		 * 모든 성적 확인
		 * */
		System.out.println("모든 성적 확인");

		for(int score : ssi.getScores()) {
			if(score!=0) {
				System.out.println(score);
			}
		}
		
		/**
		 * 성적 총점 확인
		 * */
		System.out.println("성적 총점 확인");
		System.out.println(ssi.getTotalScore());
		
		/**
		 * 성적 평균 확인
		 * */
		System.out.println("성적 평균 확인");
		System.out.println(ssi.getAVGScore());
		
		/**
		 * 성적을 여러개 한꺼번에 추가 입력
		 * */
		System.out.println("성적을 여러개 한꺼번에 추가 입력 - 95, 100");
		int [] scores = {95, 100};
		ssi.addScore(scores);
		for(int score : ssi.getScores()) {
			System.out.println(score);
		}
	}
	
}
