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
		
		System.out.print("2에서 9 사이의 숫자 5개를 입력하세요 ");
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
		System.out.println("\n입력하신 5개의 수로 제곱수를 만들면...");
		System.out.println("가장 큰 수는 " + number[max_a] + "의 " + number[max_b] + "승인 " + max + "입니다");
		System.out.println("가장 작은 수는 " + number[min_a] + "의 " + number[min_b] + "승인 " + min + "입니다");
	}
}
