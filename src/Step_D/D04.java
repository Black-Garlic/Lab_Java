package Step_D;

import java.util.Scanner;

public class D04 {
	private int count_all;
	private int count_young;
	private int birth_year;
	private int age;
	
	public D04() {
		getNum();
	}
	
	public void getNum() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("������ ������� �Է��ϼ��� ");
		count_all = s.nextInt();
		
		count_young = 0;
		
		for (int i = 0; i < count_all; i++) {
			System.out.print("�¾ �⵵�� �Է��ϼ��� ");
			birth_year = s.nextInt();
			calculate();
		}
		
		s.close();
	}
	
	public void calculate() {
		age = 2018 - birth_year + 1;
		if (age < 20) count_young++;
	}
	
	public void printYoung() {
		System.out.println("������ �߿� �̼����ڴ� ��� " + count_young + "���Դϴ�");
	}
}
