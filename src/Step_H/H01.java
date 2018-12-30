package Step_H;

import java.util.Random;
import java.util.Scanner;

public class H01 {
	private int answer;
	private int number_try;
	private int count;
	
	public H01() {
		Random generator = new Random();
		answer = generator.nextInt(100) + 1;
		count = 0;
	}
	
	public void getNum() {
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.print("1부터 100까지의 숫자 하나를 맞춰보세요 ");
			number_try = s.nextInt();
			count++;
			
			if (judgeNum() == 1) {
				System.out.println("좀 더 작은 수입니다");
			} else if (judgeNum() == 2 ) {
				System.out.println("좀 더 큰 수입니다");
			} else {
				System.out.println(count + "번만에 숫자를 맞추셨습니다");
				break;
			}
		}
	}
	
	public int judgeNum() {
		if (answer < number_try) {
			return 1;
		} else if (answer > number_try) {
			return 2;
		} else {
			return 3;
		}
	}
}
