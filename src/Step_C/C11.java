package Step_C;

import java.util.Scanner;

public class C11 {
	private int year;
	
	public C11() {
		getYear();
	}
	
	public void getYear() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("�⵵�� �Է��ϼ��� ");
		year = s.nextInt();
	}
	
	public void printYear() {
		if (year % 4 == 0) {
			if (year % 100 == 0 && year % 400 == 0) {
				System.out.println("�Է��Ͻ� �⵵�� �����Դϴ�");
			} else if (year % 100 == 0 && year % 400 != 0) {
				System.out.println("�Է��Ͻ� �⵵�� ������ �ƴմϴ�");
			} else {
				System.out.println("�Է��Ͻ� �⵵�� �����Դϴ�");
			}
		} else {
			System.out.println("�Է��Ͻ� �⵵�� ������ �ƴմϴ�");
		}
	}
}
