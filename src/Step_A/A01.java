package Step_A;

import java.util.Scanner;

public class A01 {
	private int birth_year;
	private int age;
	
	public A01() {
		this.birth_year = 2014;
		this.age = 0;
	}
	
	public void printAge() {
		Scanner s = new Scanner(System.in);
		System.out.print("�¾ ������ �Է��Ͻÿ�. ");
		
		birth_year = s.nextInt();
		age = 2014 - birth_year + 1;
		
		System.out.println("����� ���̴� " + age + "���Դϴ�");
	}
}
