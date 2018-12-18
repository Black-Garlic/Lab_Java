package Step_C;

import java.util.Scanner;

public class C01 {
	private int birth_year;
	private int age;
	
	public C01() {
		getAge();
	}
	
	public void getAge() {
		Scanner s = new Scanner(System.in);
		System.out.print("태어난 연도를 입력하시오. ");
		
		birth_year = s.nextInt();
		age = 2018 - birth_year + 1;
	}
	
	public void printAdult() {
		if (age >= 60) {
			System.out.println("노년입니다");
		} else if (age >= 30 && age < 60) {
			System.out.println("중년입니다");
		} else if (age >= 20 && age < 30) {
			System.out.println("청년입니다");
		} else if (age >= 13 && age < 20) {
			System.out.println("청소년입니다");
		} else if (age >= 7 && age < 13) {
			System.out.println("어린이입니다");
		} else {
			System.out.println("유아입니다");
		}
	}
}
