package Step_G;

import java.util.Scanner;

public class G05 {
	private int hour, minute;
	private int charge;
	private int total_charge;
	
	public G05() { }
	
	public void getCharge() {
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.print("사용한 시간을 시간과 분으로 입력하세요 ");
			hour = s.nextInt();
			minute = s.nextInt();

			if (hour == 0 && minute == 0) break;
			
			changeHour();
			addCharge();
		}
		printCharge();
	}
	
	public void changeHour() {
		minute += hour * 60;
	}
	
	public void addCharge() {
		if (minute % 30 == 0) {
			if (minute >= 300) {
				charge = (minute / 30) * 800; 
			} else if (minute < 300 && minute >= 180) {
				charge = (minute / 30) * 900;
			} else if (minute < 180 && minute >= 120) {
				charge = (minute / 30) * 950;
			} else {
				charge = (minute / 30) * 1000;
			}
		} else {
			if (minute >= 300) {
				charge = (minute / 30 + 1) * 800; 
			} else if (minute < 300 && minute >= 180) {
				charge = (minute / 30 + 1) * 900;
			} else if (minute < 180 && minute >= 120) {
				charge = (minute / 30 + 1) * 950;
			} else {
				charge = (minute / 30 + 1) * 1000;
			}
		}
		System.out.println("고객님의 이용료는 " + charge + "원 입니다");
		total_charge += charge;
	}
	
	public void printCharge() {
		System.out.println("지금까지의 이용료 총 금액은 " + total_charge + "원 입니다");
	}
}
