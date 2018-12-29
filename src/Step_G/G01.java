package Step_G;

import java.util.Scanner;

public class G01 {
	private int birth_year;
	private int age[] = new int[100];
	private int count_person;
	private int count_baby;
	private int count_child;
	private int count_youth;
	private int count_young;
	private int count_adult;
	private int count_old;
	private int i;
	
	public G01() {
		getAge();
	}
	
	public void getAge() {
		Scanner s = new Scanner(System.in);
		
		for (count_person = 0; count_person < 100; count_person++) {
			System.out.printf("%d��° ����� �¾ ������ �Է��ϼ��� ", count_person + 1);
			
			birth_year = s.nextInt();
			if (birth_year > 2018) {
				break;
			} else {
				age[count_person] = 2018 - birth_year + 1;
				calAge(count_person);
			}
		}
		count_person--;
	}
	
	public void calAge(int index) {
		if (age[index] >= 60) {
			count_old++;
		} else if (age[index] >= 30 && age[index] < 60) {
			count_adult++;
		} else if (age[index] >= 20 && age[index] < 30) {
			count_young++;
		} else if (age[index] >= 13 && age[index] < 20) {
			count_youth++;
		} else if (age[index] >= 7 && age[index] < 13) {
			count_child++;
		} else {
			count_baby++;
		}
	}
	
	public void printCount() {
		for (i = 0; i <= count_person; i++) {
			System.out.printf("%d��° ����� ���̴� %d�Դϴ�\n", i + 1, age[i]);
		}
		System.out.println("���ƴ� " + count_baby + "�� �Դϴ�");
		System.out.println("��̴� " + count_child + "�� �Դϴ�");
		System.out.println("û�ҳ��� " + count_youth + "�� �Դϴ�");
		System.out.println("û���� " + count_young + "�� �Դϴ�");
		System.out.println("�߳��� " + count_adult + "�� �Դϴ�");
		System.out.println("����� " + count_old + "�� �Դϴ�");
	}
}
