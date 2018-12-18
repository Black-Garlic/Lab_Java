package Step_C;

import java.util.Scanner;

public class C09 {
	private int income;
	private int tax;
	
	public C09() {
		getIncome();
	}
	
	public void getIncome() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("연봉(원 단위)을 숫자로 입력하세요. ");
		income = s.nextInt();
		
		calculate();
	}
	
	public void calculate() {
		if (income >= 80000000) {
			tax = (int) (income * 0.37);
		} else if (income >= 40000000 && income < 80000000) {
			tax = (int) (income * 0.28);
		} else if (income >= 10000000 && income < 40000000) {
			tax = (int) (income * 0.19);
		} else {
			tax = (int) (income * 0.095);
		}
	}
	
	public void printTax() {
		System.out.println("연동 금액에 대한 소득세는 " + tax + "원 입니다");
	}
}
