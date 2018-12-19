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
			System.out.print("0부터 100 사이의 숫자를 입력하세요 ");
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
			System.out.println("입력된 숫자가 없습니다");
		} else {
			System.out.println("입력한 " + count + "개의 숫자들의 총 합계는 " + totalsum + "이고, 평균 값은 " + average + "입니다");
		}
	}
}
