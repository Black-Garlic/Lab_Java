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
			System.out.print("0부터 100 사이의 숫자를 입력하세요 ");
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
			System.out.println("입력된 숫자가 없습니다");
		} else {
			System.out.println("입력된 숫자들 중 가장 큰 수는 " + max_num + "이고, 가장 작은 수는 " + min_num + "입니다");
		}
	}
}
