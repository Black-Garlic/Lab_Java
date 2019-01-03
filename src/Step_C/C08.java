package Step_C;

import java.util.Scanner;

public class C08 {
	private int num1;
	private int num2;
	private int num3;
	private int max_num;
	private int min_num;
	
	public C08() {
		getNumber();
	}
	
	public void getNumber() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요 ");
		num1 = s.nextInt();
		System.out.println("두번째 숫자를 입력하세요 ");
		num2 = s.nextInt();
		System.out.println("세번째 숫자를 입력하세요 ");
		num3 = s.nextInt();
		
		calculate();
		
		s.close();
	}
	
	public void calculate() {
		max_num = num1;
		min_num = num1;
		
		maxNum(num2);
		minNum(num2);
		maxNum(num3);
		minNum(num3);
	}
	
	public void maxNum(int num) {
		if (num > max_num)
			max_num = num;
	}
	
	public void minNum(int num) {
		if (num < min_num)
			min_num = num;
	}
	
	public void printMaxMin() {
		System.out.println("가장 큰 수는 " + max_num + "이고, 가장 작은 수는 " + min_num + "입니다");
	}
	
	
}
