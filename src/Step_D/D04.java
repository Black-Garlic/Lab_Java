package Step_D;

import java.util.Scanner;

public class D04 {
	private int count_all;
	private int count_young;
	private int birth_year;
	private int age;
	
	public D04() {
		getNum();
	}
	
	public void getNum() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("가족이 몇명인지 입력하세요 ");
		count_all = s.nextInt();
		
		count_young = 0;
		
		for (int i = 0; i < count_all; i++) {
			System.out.print("태어난 년도를 입력하세요 ");
			birth_year = s.nextInt();
			calculate();
		}
		
		s.close();
	}
	
	public void calculate() {
		age = 2018 - birth_year + 1;
		if (age < 20) count_young++;
	}
	
	public void printYoung() {
		System.out.println("가족들 중에 미성년자는 모두 " + count_young + "명입니다");
	}
}
