package Step_D;

import java.util.Scanner;

public class D02 {
	private int number;
	private int max_num = 0;
	private int min_num = 100;
	
	public D02() {
		getNum();
	}
	
	public void getNum() {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("0���� 100 ������ ���ڸ� �Է��ϼ��� ");
			number = s.nextInt();
			if (number < 0 || number > 100) break;
			calculate();
		}
		
		s.close();
	}
	
	public void calculate() {
		if (number > max_num) max_num = number;
		if (number < min_num) min_num = number;
	}
	
	public void printNum() {
		if (max_num == 0) {
			System.out.println("�Էµ� ���ڰ� �����ϴ�");
		} else {
			System.out.println("�Էµ� ���ڵ� �� ���� ū ���� " + max_num + "�̰�, ���� ���� ���� " + min_num + "�Դϴ�");
		}
	}
}
