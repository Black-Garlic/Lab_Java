package Step_J;

import java.util.Scanner;

public class J09 {
	public J09() {	}
	
	public void getNum() {
		Scanner s = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("숫자 2개를 입력하세요 ");
		num1 = s.nextInt();
		num2 = s.nextInt();
		if (num1 < 0 || num2 < 0)
			System.out.println("잘못 입력하셨습니다");
		
		System.out.println("\n" + num1 + "의 " + num2 + "승은 " + power(num1, num2) + " 입니다");
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
