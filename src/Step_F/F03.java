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
			System.out.printf("%d�� �л��� ����, ����, ���� ������ �Է��ϼ��� ", i + 1);
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
		System.out.printf("������ ������ %d �̰�, ����� %.1f �Դϴ�\n" , sum[0], average[0]);
		System.out.printf("������ ������ %d �̰�, ����� %.1f �Դϴ�\n" , sum[1], average[1]);
		System.out.printf("������ ������ %d �̰�, ����� %.1f �Դϴ�\n" , sum[2], average[2]);
	}
}
