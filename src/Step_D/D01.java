package Step_D;

import java.util.Scanner;

public class D01 {
	private int number;
	private int totalsum;
	private int i;
	
	public D01() {
		getNum();
	}
	
	public void getNum() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� ");
		number = s.nextInt();
	}
	
	public int calculate() {
		totalsum = 0;
		for (i = 1; i <= number; i++) {
			totalsum = totalsum + i;
		}
		return totalsum;
	}
	
	public void printNum() {
		System.out.println("1���� �Է��� ���ڱ����� ��� ������ ���� ���� " + calculate() + " �Դϴ�");
	}
}
