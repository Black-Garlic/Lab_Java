package Step_D;

import java.util.Scanner;

public class D03 {
	private int number;
	private int count = 0;
	private int totalsum;
	private double average;
	
	public D03() {
		getNum();
	}
	
	public void getNum() {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("0���� 100 ������ ���ڸ� �Է��ϼ��� ");
			number = s.nextInt();
			count++;
			if (number < 0 || number > 100) break;
			calculate();
		}
	}
	
	public void calculate() {
		totalsum = totalsum + number;
		average = (double) totalsum / count;
	}
	
	public void printNum() {
		if (count == 0) {
			System.out.println("�Էµ� ���ڰ� �����ϴ�");
		} else {
			System.out.println("�Է��� " + count + "���� ���ڵ��� �� �հ�� " + totalsum + "�̰�, ��� ���� " + average + "�Դϴ�");
		}
	}
}
