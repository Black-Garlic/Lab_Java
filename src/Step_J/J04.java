package Step_J;

import java.util.Scanner;

public class J04 {
	
	public J04() {
	}
	
	public void getDays() {
		int first_month, first_day, first_day_count;
		int second_month, second_day, second_day_count;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫번째 날짜를 입력하세요(월 일) ");
		first_month = s.nextInt();
		first_day = s.nextInt();
		first_day_count = calDate(first_month, first_day);
		
		System.out.print("두번째 날짜를 입력하세요(월 일) ");
		second_month = s.nextInt();
		second_day = s.nextInt();
		second_day_count = calDate(second_month, second_day);
		
		if (first_day_count == 0 || second_day_count == 0)
			printDay(false, 0);
		else
			printDay(true, calGap(first_day_count, second_day_count));
	}
	
	public int calDate(int month, int day) {
		int day_count = 1;
		
		if (month > 12) {
			return 0;
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
						return 0;
					}
					day_count = day_count + day;
				} else if (i == 2) {
					if (day > 28) {
						return 0;
					}
					day_count = day_count + day;
				} else {
					if (day > 30) {
						day_count = 0;
						return 0;
					}
					day_count = day_count + day;
				}
			}
		}
		return day_count;
	}
	
	public int calGap(int first_count, int second_count) {
		if (first_count > second_count) {
			return first_count - second_count;
		} else {
			return second_count - first_count;
		}
	}
	
	public void printDay(boolean valid, int daygap) {
		if (!valid) {
			System.out.println("잘못 입력하셨습니다");
		} else {
			System.out.println("두 날짜의 간격은 " + daygap + "일 입니다");
		}
	}
}
