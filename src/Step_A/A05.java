package Step_A;

import java.util.Scanner;

public class A05 {
	private int days;
	private int seconds;
	
	public A05() {
		this.days = 0;
		this.seconds = 0;
	}
	
	public void printSecond() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("�� ���� �Է��ϼ���. ");
		days = s.nextInt();
		seconds = days * 24 * 60 * 60;
		
		System.out.println("�� ���� �ش�Ǵ� �ð��� ��� " + seconds + "���Դϴ�.");
		
		s.close();
	}
}
