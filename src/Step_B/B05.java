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
		
		System.out.print("날 수를 입력하세요. ");
		days = s.nextInt();
		seconds = days * 24 * 60 * 60;
		if (seconds > 1000000) {
			m_count = seconds / 1000000;
		} else {
			m_count = 0;
		}
	}
	
	public void printSecond() {
		System.out.println("날 수에 해당되는 시간은 모두 " + seconds + "초입니다.");
		if (m_count > 0) {
			System.out.println("100만 초가 모두 " + m_count + "번이나 포함됩니다.");
		}
	}
}
