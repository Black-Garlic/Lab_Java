package Step_J;

import java.util.Scanner;

public class J07 {
	public J07() {	}
	
	public void getNum() {
		Scanner s = new Scanner(System.in);
		
		int number;
		
		while(true) {
			System.out.print("숫자를 입력하세요 (0. 종료) : ");
			number = s.nextInt();
			
			if (number == 0)
				break;
			
			System.out.println("2의 " + number + "승은 : " + poweroftwo(number));
		}
	}
	
	public int poweroftwo(int n) {
		if (n == 0)
			return 1;
		else
			return 2 * poweroftwo(n - 1);
	}
}
