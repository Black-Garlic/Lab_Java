package Step_D;

import java.util.Scanner;

public class D10 {
	private int num1, num2;
	private int i;
	
	public D10() {
		getNum();
	}
	
	public void getNum() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("2개의 숫자를 입력하세요 ");
		num1 = s.nextInt();
		num2 = s.nextInt();
	}
	
	public void printNum() {
		boolean first = true;
		for (i = 1; i <= 100; i++) {
			if (i % num1 == 0 && i % num2 != 0) {
				if(first) {
					first = false;
				} else {
					System.out.print(", ");
				}
				System.out.print(i);
			} else if (i % num1 != 0 && i % num2 == 0 ) {
				if(first) {
					first = false;
				} else {
					System.out.print(", ");
				}
				System.out.print(i);
			}
		}
		System.out.println();
	}
}
