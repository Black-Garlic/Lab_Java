package Step_F;

import java.util.Scanner;

public class F03 {
	private int jumsu[][] = new int[5][3];
	private int sum[] = new int[3];
	private double average[] = new double[3];
	private int kor, eng, math;
	private int i, j;
	
	public F03() {
		getScore();
	}
	
	public void getScore() {
		Scanner s = new Scanner(System.in);
		
		for (i = 0 ; i < 5; i++) {
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
		for (i = 0; i < 3; i++) {
			sum[i] = 0;
			for (j = 0; j < 5; j++) {
				sum[i] = sum[i] + jumsu[j][i];
			}
			average[i] = (double) sum[i] / 5;
		}
	}
	
	public void printScore() {
		System.out.printf("국어의 총점은 %d 이고, 평균은 %.1f 입니다\n" , sum[0], average[0]);
		System.out.printf("영어의 총점은 %d 이고, 평균은 %.1f 입니다\n" , sum[1], average[1]);
		System.out.printf("수학의 총점은 %d 이고, 평균은 %.1f 입니다\n" , sum[2], average[2]);
	}
}
