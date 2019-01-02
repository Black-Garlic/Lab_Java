package Step_F;

import java.util.Scanner;

public class F02 {
	private double score[] = new double[10];
	private double maxscore, minscore;
	private double total;
	private double average;
	private int newnum;
	
	public F02() {
		getScore();
	}
	
	public void getScore() {
		Scanner s = new Scanner(System.in);
		
		for (newnum = 0 ; newnum < 10; newnum++) {
			System.out.printf("%d�� �ɻ������� �Է��ϼ��� ", newnum + 1);
			score[newnum] = s.nextDouble();
			findMaxMin(newnum);
		}
		calculate();
	}
	
	public void findMaxMin(int index) {
		if (index == 0) {
			maxscore = score[index];
			minscore = score[index];
		} else {
			if (score[index] > maxscore)
				maxscore = score[index];
			if (score[index] < minscore)
				minscore = score[index];
		}
	}
	
	public void calculate() {
		total = 0;
		
		for (int i = 0; i < 10; i++) {
			if (score[i] != maxscore && score[i] != minscore)
				total = total + score[i];
		}
		
		average = total / 8;
	}
	
	public void printScore() {
		System.out.printf("���� ū ������ ���� ���� ������ ������ 8���� ������ ���� ����� %.1f �Դϴ�" , average);
	}
}
