package Step_B;

import java.util.Scanner;

public class B05 {
	private int days;
	private int seconds;
	private int m_count;
	
	public B05() {
		getSeconds();
	}
	
	public void getSeconds() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("�� ���� �Է��ϼ���. ");
		days = s.nextInt();
		seconds = days * 24 * 60 * 60;
		if (seconds > 1000000) {
			m_count = seconds / 1000000;
		} else {
			m_count = 0;
		}
	}
	
	public void printSecond() {
		System.out.println("�� ���� �ش�Ǵ� �ð��� ��� " + seconds + "���Դϴ�.");
		if (m_count > 0) {
			System.out.println("100�� �ʰ� ��� " + m_count + "���̳� ���Ե˴ϴ�.");
		}
	}
}
