package Step_I;

import java.util.Scanner;

public class I05 {
	private int number[] = new int[10];
	
	public I05() {	}
	
	public void getNum() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("10���� ���� �� �ִ��� ���մϴ�");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "�� ���� �Է��ϼ��� ");
			number[i - 1] = s.nextInt();
		}
		
		printResult(MaxOfTen());
	}
	
	public int MaxOfTen() {
		int max = 0;
		
		for (int i = 0; i < 10; i++) {
			if (max < number[i])
				max = number[i];
		}
		return max;
	}
	
	public void printResult(int max) {
		System.out.println("�ִ��� " + max + "�Դϴ�");
	}
}
