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
		
		System.out.println("ù��° ���ڸ� �Է��ϼ��� ");
		num1 = s.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ��� ");
		num2 = s.nextInt();
		System.out.println("����° ���ڸ� �Է��ϼ��� ");
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
		System.out.println("���� ū ���� " + max_num + "�̰�, ���� ���� ���� " + min_num + "�Դϴ�");
	}
	
	
}
