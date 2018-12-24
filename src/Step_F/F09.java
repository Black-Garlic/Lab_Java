package Step_F;

import java.util.Scanner;

public class F09 {
	private int monthdays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private int month, day;
	private int day_count;
	private int i;
	
	public F09() {
		getDay();
	}
	
	public void getDay() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("월을 입력하세요 ");
		month = s.nextInt();
		System.out.print("일을 입력하세요 ");
		day = s.nextInt();
		
		if (month > 12 || monthdays[month - 1] < day) {
			day_count = 0;
		} else {
			calDays();
		}
	}
	
	public void calDays() {
		day_count = 0;
		
		for (i = 0; i < month - 1; i++) {
			day_count += monthdays[i];
		}
		
		day_count += day;
	}
	
	public void printDay() {
		if (day_count == 0) {
			System.out.println("잘못 입력하셨습니다");
		} else {
			System.out.println("이 날짜는 1년 중 " + day_count + "번째 날에 해당됩니다");
		}
	}
}
