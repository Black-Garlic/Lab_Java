package Step_H;

import java.util.Random;
import java.util.Scanner;

public class H06 {
	private int number[] = new int[5];
	private int pow_value[][] = new int[5][5];
	private int max, min;
	private int max_a, max_b;
	private int min_a, min_b;
	private int i, j;
	
	public H06() {
		getNum();
	}
	
	public void getNum() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("2���� 9 ������ ���� 5���� �Է��ϼ��� ");
		for (i = 0; i < 5; i++)
			number[i] = s.nextInt();
		getPow();
		getMax();
		getMin();
	}
	
	public void getPow() {
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				pow_value[i][j] = (int) Math.pow(number[i], number[j]);
			}
		}
	}
	
	public void getMax() {
		max = 0;
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				if (i != j) 
					checkMax(i, j);
			}
		}
	}
	
	public void getMin() {
		min = max;
		
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				if (i != j) 
					checkMin(i, j);
			}
		}
	}
	
	public void checkMax(int A, int B) {
		if (max < pow_value[A][B]) {
			max = pow_value[A][B];
			max_a = A;
			max_b = B;
		}
	}
	
	public void checkMin(int A, int B) {
		if (min > pow_value[A][B]) {
			min = pow_value[A][B];
			min_a = A;
			min_b = B;
		}
	}
	
	public void printResult() {
		System.out.println("\n�Է��Ͻ� 5���� ���� �������� �����...");
		System.out.println("���� ū ���� " + number[max_a] + "�� " + number[max_b] + "���� " + max + "�Դϴ�");
		System.out.println("���� ���� ���� " + number[min_a] + "�� " + number[min_b] + "���� " + min + "�Դϴ�");
	}
}
