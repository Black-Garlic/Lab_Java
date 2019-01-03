package Step_H;

import java.util.Random;
import java.util.Scanner;

public class H05 {
	private int coins;
	private int number[] = new int[3];
	private int dummy;
	
	public H05() {
		getCoins();
	}
	
	public void getCoins() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("사용하실 코인의 개수를 입력하세요 ");
		coins = s.nextInt();
		s.close();
	}
	
	public void playSlotmachine() {
		Scanner s = new Scanner(System.in);
		
		int count = 1;
		
		while (coins != 0) {
			System.out.print("게임 " + count + "회 Start!! (아무 숫자나 입력하세요) ");
			dummy = s.nextInt();
			coins--;
			
			generateSlot();
			switch(checkSlot()) {
			case 3:
				System.out.println("숫자 3개 일치... 코인 4개 추가");
				coins += 4;
				break;
			case 2:
				System.out.println("숫자 2개 일치... 코인 2개 추가");
				coins += 2;
				break;
			case 1:
				System.out.println("꽝입니다... 아쉽군요");
				break;
			}
			System.out.println("남아있는 코인은 " + coins + "개 입니다");
		}
		printEnd();
		s.close();
	}
	
	public void generateSlot() {
		Random generator = new Random();
		
		System.out.print("게임 결과 : ");
		
		for (int i = 0; i < 3; i++) {
			number[i] = generator.nextInt(9) + 1;
			System.out.print(number[i] + " ");
		}
		
		System.out.print("----> ");
	}
	
	public int checkSlot() {
		if (number[0] == number[1] && number[0] == number[2]) {
			return 3;
		} else if (number[0] == number[1] ||
				number[1] == number[2] ||
				number[2] == number[0]) {
			return 2;
		} else {
			return 1;
		}
	}
	
	public void printEnd() {
		System.out.println("\n게임 종료!!");
	}
}
