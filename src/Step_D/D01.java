package Step_D;

import java.util.Scanner;

public class D01 {
	private int number;
	private int totalsum;
	
	public D01() {
		getNum();
	}
	
	public void getNum() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 ");
		number = s.nextInt();
	}
	
	public int calculate() {
		totalsum = 0;
		for (int i = 1; i <= number; i++) {
			totalsum = totalsum + i;
		}
		return totalsum;
	}
	
	public void printNum() {
		System.out.println("1부터 입력한 숫자까지의 모든 정수를 더한 값은 " + calculate() + " 입니다");
	}
}
