package Step_J;

import java.util.Scanner;

public class J09 {
	public J09() {	}
	
	public void getNum() {
		Scanner s = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("���� 2���� �Է��ϼ��� ");
		num1 = s.nextInt();
		num2 = s.nextInt();
		if (num1 < 0 || num2 < 0)
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
		
		System.out.println("\n" + num1 + "�� " + num2 + "���� " + power(num1, num2) + " �Դϴ�");
	}
	
	public int power(int num1, int num2) {
		if (num2 == 0)
			return 1;
		else if (num2 == 1)
			return num1;
		else if (num2 > 1 && num2 % 2 == 0)
			return power(num1, num2 / 2) * power(num1, num2 / 2);
		else if (num2 > 1 && num2 % 2 == 1)
			return power(num1, num2 / 2) * power(num1, num2 / 2) * num1;
		else
			return -1;
	}
}
