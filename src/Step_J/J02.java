package Step_J;

import java.util.Scanner;

public class J02 {
	private double total;
	private double average;
	
	public J02() {
		getScore();
	}
	
	public void getScore() {
		Scanner s = new Scanner(System.in);
		
		double score[] = new double[10];
		
		for (int newnum = 0 ; newnum < 10; newnum++) {
			System.out.printf("%d번 심사점수를 입력하세요 ", newnum + 1);
			score[newnum] = s.nextDouble();
		}
		
		calSum(score, Max(score), Min(score));
		s.close();
	}
	
	public double Max(double num[]) {
		double maxscore = num[0];
		
		for (int i = 1; i < 10; i++) {
			if (maxscore < num[i])
				maxscore = num[i];
		}
		
		return maxscore;
	}
	
	public double Min(double num[]) {
		double minscore = num[0];
		
		for (int i = 1; i < 10; i++) {
			if (minscore > num[i])
				minscore = num[i];
		}
		
		return minscore;
	}
	
	
	public void calSum(double score[], double maxscore, double minscore) {
		total = 0;
		
		for (int i = 0; i < 10; i++) {
			if (score[i] != maxscore && score[i] != minscore)
				total = total + score[i];
		}
		
		average = total / 8;
	}
	
	public void printScore() {
		System.out.printf("가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수에 대한 평균은 %.1f 입니다\n" , average);
	}
}
