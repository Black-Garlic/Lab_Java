package Step_D;

import java.util.Scanner;

public class D09 {
	private int dan;
	private int i;
	
	public D09() {
		getDan();
	}
	
	public void getDan() {
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.print("출력하고 싶은 구구단의 단수를 입력하세요 (2 ~ 9) ");
			dan = s.nextInt();
			if (dan >= 2 && dan <= 9) {
				break;
			} else {
				System.out.println("잘못 입력하셨습니다");
			}
		}
	}
	
	public int calDan(int i) {
		return i * dan;
	}
	
	public void printDan() {
		for (i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + calDan(i)); 
		}
	}
}
