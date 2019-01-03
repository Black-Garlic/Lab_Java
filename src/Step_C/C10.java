package Step_C;

import java.util.Scanner;

public class C10 {
	private int num1;
	private int num2;
	private String operator;
	private int result;
	
	public C10() {
		getNumOp();
	}
	
	public void getNumOp() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("숫자 1을 입력하세요 ");
		num1 = s.nextInt();
		System.out.print("숫자 2을 입력하세요 ");
		num2 = s.nextInt();
		operator = s.nextLine();
		System.out.print("연산기호('+', '-', '*', '/' 중 1개)를 입력하세요 ");
		operator = s.nextLine();
		
		calculate();
		
		s.close();
	}
	
	public void calculate() {
		switch(operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		default:
			result = 0;
			break;
		}
	}
	
	public void printResult() {
		System.out.println("계산식의 결과 값은 " + result + "입니다");
	}
}
