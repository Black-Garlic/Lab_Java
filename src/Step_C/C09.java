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
		
		System.out.println("����(�� ����)�� ���ڷ� �Է��ϼ���. ");
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
		System.out.println("���� �ݾ׿� ���� �ҵ漼�� " + tax + "�� �Դϴ�");
	}
}
