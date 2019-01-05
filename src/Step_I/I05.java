package Step_I;

import java.util.Scanner;

public class I05 {
	private int number[] = new int[10];
	
	public I05() {	}
	
	public void getNum() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("10개의 숫자 중 최댓값을 구합니다");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "번 수를 입력하세요 ");
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
		System.out.println("최댓값은 " + max + "입니다");
	}
}
