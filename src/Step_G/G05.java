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
			System.out.print("����� �ð��� �ð��� ������ �Է��ϼ��� ");
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
		System.out.println("������ �̿��� " + charge + "�� �Դϴ�");
		total_charge += charge;
	}
	
	public void printCharge() {
		System.out.println("���ݱ����� �̿�� �� �ݾ��� " + total_charge + "�� �Դϴ�");
	}
}
