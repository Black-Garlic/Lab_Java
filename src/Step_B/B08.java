package Step_B;

import java.util.Scanner;

public class B08 {
	private int num1;
	private int num2;
	private int num3;
	
	public B08() {
		getNumber();
	}
	
	public void getNumber() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է��ϼ��� ");
		num1 = s.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ��� ");
		num2 = s.nextInt();
		System.out.println("����° ���ڸ� �Է��ϼ��� ");
		num3 = s.nextInt();
		
		s.close();
	}
	
	public void printCondition() {
		check1();
		check2();
		check3();
		check4();
	}
	
	public void check1() {
		if ((num1 == num2) || (num2 == num3) || (num1 == num3)) {
			System.out.println("1�� ���� ���� : 3���� ���� �� ��� �� ���� ���� ����");
		}
	}
	
	public void check2() {
		if ((num1 > 50 && num2 > 50) ||
			(num2 > 50 && num3 > 50) ||
			(num3 > 50 && num1 > 50)) {
			System.out.println("2�� ���� ���� : 3���� ���� �� ��� �� ���� ũ�Ⱑ ��� 50���� ũ��");
		}
	}
	
	public void check3() {
		if ((num1 + num2 == num3) ||
			(num2 + num3 == num1) ||
			(num3 + num1 == num2)) {
			System.out.println("3�� ���� ���� : 3���� ���� �� � �� ���� ���� ������ �ϳ��� ���ڿ� ����");
		}
	}
	
	public void check4() {
		if ((num1 % num3 == 0 && num2 % num3 == 0) ||
			(num2 % num1 == 0 && num3 % num1 == 0) ||
			(num3 % num2 == 0 && num1 % num2 == 0)) {
			System.out.println("4�� ���� ���� : 3���� ���� �� � �ϳ��� ���� �ٸ� �� ���� ������ ������ �������� ��찡 �ִ�");
		}
	}
}
