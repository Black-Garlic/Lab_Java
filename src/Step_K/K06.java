package Step_K;

import java.util.Scanner;

public class K06 {
	private int number;
	private UserInfo user[] = new UserInfo[10];
	
	public K06() {
		setUser();
	}
	
	public void setUser() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("����� �л��� ���ڴ�? ");
		number = s.nextInt();
		
		for (int i = 0; i < number; i++) {
			user[i] = new UserInfo();
			System.out.printf("%d�� ", i + 1);
			user[i].input();
		}
	}
	
	public void printUser() {
		System.out.println("========================");
		System.out.println("��ϵ� " + number + "���� �л� ����� ������ �����ϴ�");
		System.out.println("------------------------");
		System.out.println("��ȣ\t���̵�\t��й�ȣ");
		for (int i = 0; i < number; i++) {
			user[i].print(i + 1);
		}
	}
}
