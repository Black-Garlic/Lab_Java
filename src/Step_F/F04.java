package Step_F;

import java.util.Scanner;

public class F04 {
	private int jumsu[][] = new int[5][3];
	private int sum[] = new int[5];
	private double average[] = new double[5];
	private int kor, eng, math;
	
	public F04() {
		getScore();
	}
	
	public void getScore() {
		Scanner s = new Scanner(System.in);
		
		for (int i = 0 ; i < 5; i++) {
			System.out.printf("%d번 학생의 국어, 영어, 수학 점수를 입력하세요 ", i + 1);
			kor = s.nextInt();
			eng = s.nextInt();
			math = s.nextInt();
			
			jumsu[i][0] = kor;
			jumsu[i][1] = eng;
			jumsu[i][2] = math;
		}
		calculate();
	}
	
	public void calculate() {
		for (int i = 0; i < 5; i++) {
			sum[i] = 0;
			for (int j = 0; j < 3; j++) {
				sum[i] = sum[i] + jumsu[i][j];
			}
			average[i] = (double) sum[i] / 3;
		}
	}
	
	public void printScore() {
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d번 학생의 총점은 %d 이고, 평균은 %.1f 입니다\n" , i + 1, sum[i], average[i]);
		}
	}
}
