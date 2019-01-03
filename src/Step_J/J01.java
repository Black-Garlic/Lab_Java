package Step_J;

import java.util.Scanner;

public class J01 {
	private int birth_year;
	private int count_age[] = {0, 0, 0, 0, 0, 0};
	private String agetype[] = {"����", "���", "û�ҳ�", "û��", "�߳�", "���"};
	
	public J01() {
		getYear();
	}
	
	public void getYear() {
		Scanner s = new Scanner(System.in);
		
		for (int count_person = 0; count_person < 100; count_person++) {
			System.out.printf("%d��° ����� �¾ ������ �Է��ϼ��� ", count_person + 1);
			
			birth_year = s.nextInt();
			
			if (birth_year > 2018) {
				break;
			} else {
				count_age[askAge(birth_year)]++;
			}
		}
		s.close();
	}
	
	public int askAge(int birthyear) {
		int age = 2018 - birth_year + 1;
		System.out.println("���̴� " + age + " �Դϴ�");
		
		if (age >= 60) {
			return 5;
		} else if (age >= 30 && age < 60) {
			return 4;
		} else if (age >= 20 && age < 30) {
			return 3;
		} else if (age >= 13 && age < 20) {
			return 2;
		} else if (age >= 7 && age < 13) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public void printCount() {
		for (int i = 0; i < 6; i++) {
			System.out.println(agetype[i] + "��(��) " + count_age[i] + "�� �Դϴ�");
		}
	}
}
