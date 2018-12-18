package Step_C;

import java.util.Scanner;

public class C05 {
	private int month;
	private int day;
	private int day_count;
	
	public C05() {
		getSeconds();
	}
	
	public void getSeconds() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("월을 입력하세요. ");
		month = s.nextInt();
		System.out.print("일을 입력하세요. ");
		day = s.nextInt();
		
		day_count = 1;
		calculate();
	}
	
	public void calculate() {
		if (month > 12) {
			day_count = 0;
			return;
		}
		for (int i = 1; i <= month; i++) {
			if (i != month) {
				if ((i == 1) || (i == 3) || (1 == 5) || (i == 7) ||
					(i == 8) || (i == 10) || (i == 12)) {
					day_count = day_count + 31;
				} else if (i == 2) {
					day_count = day_count + 28;
				} else {
					day_count = day_count + 30;
				}
			} else {
				if ((i == 1) || (i == 3) || (1 == 5) || (i == 7) ||
					(i == 8) || (i == 10) || (i == 12)) {
					if (day > 31) {
						day_count = 0;
						return;
					}
					day_count = day_count + day;
				} else if (i == 2) {
					if (day > 28) {
						day_count = 0;
						return;
					}
					day_count = day_count + day;
				} else {
					if (day > 30) {
						day_count = 0;
						return;
					}
					day_count = day_count + day;
				}
			}
		}
	}
	
	public void printDay() {
		if (day_count == 0) {
			System.out.println("잘못 입력하셨습니다");
		} else {
			System.out.println("이 날짜는 1년 중 " + day_count + "번째 날에 해당됩니다");
		}
	}
}
