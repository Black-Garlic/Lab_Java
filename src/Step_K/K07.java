package Step_K;

import java.util.Scanner;

public class K07 {
	private int number;
	private Student student[] = new Student[5];
	
	public K07() {
		setStudent();
	}
	
	public void setStudent() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("����� �л��� ���ڴ�? ");
		number = s.nextInt();
		
		for (int i = 0; i < number; i++) {
			student[i] = new Student();
			System.out.printf("%d�� ", i + 1);
			student[i].input();
		}
	}
	
	public void printStudent() {
		System.out.println("========================");
		System.out.println("��ϵ� " + number + "���� �л� ����� ������ �����ϴ�");
		System.out.println("------------------------");
		System.out.println("��ȣ\t����\t����\t����\t����\t���\t����");
		for (int i = 0; i < number; i++) {
			student[i].print(i + 1);
		}
	}
}
