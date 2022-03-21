package test.JavaMission07;

import JavaMission07.Score;
import JavaMission07.ScoreImpl;

public class ScoreTest {
	public static void main(String[] args) {
		Score ssi = new ScoreImpl();
		
		/**
		 * ����(1~100)�Է�
		 * */
		ssi.addScore(80);
		ssi.addScore(90);
		System.out.println("���� �Է� - 80, 90");
	
		/**
		 * ��� ���� Ȯ��
		 * */
		System.out.println("��� ���� Ȯ��");

		for(int score : ssi.getScores()) {
			if(score!=0) {
				System.out.println(score);
			}
		}
		
		/**
		 * ���� ���� Ȯ��
		 * */
		System.out.println("���� ���� Ȯ��");
		System.out.println(ssi.getTotalScore());
		
		/**
		 * ���� ��� Ȯ��
		 * */
		System.out.println("���� ��� Ȯ��");
		System.out.println(ssi.getAVGScore());
		
		/**
		 * ������ ������ �Ѳ����� �߰� �Է�
		 * */
		System.out.println("������ ������ �Ѳ����� �߰� �Է� - 95, 100");
		int [] scores = {95, 100};
		ssi.addScore(scores);
		for(int score : ssi.getScores()) {
			System.out.println(score);
		}
	}
	
}
