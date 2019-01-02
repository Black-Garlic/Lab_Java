package Step_F;

import java.util.Scanner;

public class F03 {
	private int jumsu[][] = new int[5][3];
	private int sum[] = new int[3];
	private double average[] = new double[3];
	private int kor, eng, math;
	private String classname[] = {"국어", "영어", "수학"};
	
	public F03() {
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
		for (int i = 0; i < 3; i++) {
			sum[i] = 0;
			for (int j = 0; j < 5; j++) {
				sum[i] = sum[i] + jumsu[j][i];
			}
			average[i] = (double) sum[i] / 5;
		}
	}
	
	public void printScore() {
		for (int i = 0; i < 3; i++) {
			System.out.printf("%s의 총점은 %d 이고, 평균은 %.1f 입니다\n" , classname[i], sum[i], average[i]);
		}
	}
}
