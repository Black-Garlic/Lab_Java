package Step_C;

import java.util.Scanner;

public class C01 {
	private int birth_year;
	private int age;
	
	public C01() {
		getAge();
	}
	
	public void getAge() {
		Scanner s = new Scanner(System.in);
		System.out.print("�¾ ������ �Է��Ͻÿ�. ");
		
		birth_year = s.nextInt();
		age = 2018 - birth_year + 1;
	}
	
	public void printAdult() {
		if (age >= 60) {
			System.out.println("����Դϴ�");
		} else if (age >= 30 && age < 60) {
			System.out.println("�߳��Դϴ�");
		} else if (age >= 20 && age < 30) {
			System.out.println("û���Դϴ�");
		} else if (age >= 13 && age < 20) {
			System.out.println("û�ҳ��Դϴ�");
		} else if (age >= 7 && age < 13) {
			System.out.println("����Դϴ�");
		} else {
			System.out.println("�����Դϴ�");
		}
	}
}
