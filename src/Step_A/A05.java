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
		
		System.out.print("날 수를 입력하세요. ");
		days = s.nextInt();
		seconds = days * 24 * 60 * 60;
		
		System.out.println("날 수에 해당되는 시간은 모두 " + seconds + "초입니다.");
		
		s.close();
	}
}
