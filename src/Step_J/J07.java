package Step_J;

import java.util.Scanner;

public class J07 {
	public J07() {	}
	
	public void getNum() {
		Scanner s = new Scanner(System.in);
		
		int number;
		
		while(true) {
			System.out.print("���ڸ� �Է��ϼ��� (0. ����) : ");
			number = s.nextInt();
			
			if (number == 0)
				break;
			
			System.out.println("2�� " + number + "���� : " + poweroftwo(number));
		}
	}
	
	public int poweroftwo(int n) {
		if (n == 0)
			return 1;
		else
			return 2 * poweroftwo(n - 1);
	}
}
