package Step_F;

import java.util.Scanner;

public class F08 {
	private int number[] = new int[10];
	private int newnum;
	private int count;
	
	public F08() {
		getNum();
	}
	
	public void getNum() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("1부터 100 사이의 숫자를 입력하세요");
		
		count = 0;
		
		while(count < 10) {
			System.out.printf("%d번째 숫자를 입력하세요 ", count + 1);
			newnum = s.nextInt();
			
			if (newnum < 0 || newnum > 100) {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
			} else if (!checkDup(newnum)) {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
			} else {
				number[count] = newnum;
				count++;
			}
		}
		s.close();
	}
	
	public boolean checkDup(int num) {
		for (int i = 0; i < count ; i++) {
			if (number[i] == num) return false;
		}
		return true;
	}
	
	public void printNum() {
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d번째 숫자는 %d입니다\n", i + 1, number[i]);
		}
	}
}
