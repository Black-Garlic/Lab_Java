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
		
		System.out.print("���� 1�� �Է��ϼ��� ");
		num1 = s.nextInt();
		System.out.print("���� 2�� �Է��ϼ��� ");
		num2 = s.nextInt();
		operator = s.nextLine();
		System.out.print("�����ȣ('+', '-', '*', '/' �� 1��)�� �Է��ϼ��� ");
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
		System.out.println("������ ��� ���� " + result + "�Դϴ�");
	}
}
