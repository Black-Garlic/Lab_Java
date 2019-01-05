package Step_B;

import java.util.Scanner;

public class B01 {
	private int birth_year;
	private int age;
	
	public B01() {
		getAge();
	}
	
	public void getAge() {
		Scanner s = new Scanner(System.in);
		System.out.print("태어난 연도를 입력하시오. ");
		
		birth_year = s.nextInt();
		age = 2018 - birth_year + 1;
	}
	
	public void printAdult() {
		if (age < 20) {
			System.out.println("미성년자입니다.");
		} else {
			System.out.println("미성년자가 아닙니다.");
		}
	}
}
