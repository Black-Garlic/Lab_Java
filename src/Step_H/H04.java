package Step_H;

import java.util.Random;
import java.util.Scanner;

public class H04 {
	private int com_finger;
	private int my_finger;
	private int score[][] = new int[2][3];
	
	public H04() {
	}
	
	public void doRSP() {
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.print("가위(1), 바위(2), 보(3)를 입력하세요 ");
			my_finger = s.nextInt();
			
			if (my_finger == 0) break;
			
			generateCom();
			
			switch(checkRSP()) {
			case 'Y':
				System.out.println("사용자 승!\n");
				break;
			case 'L':
				System.out.println("컴퓨터 승\n");
				break;
			case 'D':
				System.out.println("비김~!\n");
				break;
			default :
				break;
			}
		}
		printResult();
	}
	
	public void generateCom() {
		Random generator = new Random();
		
		com_finger = generator.nextInt(3) + 1;
		
		switch(com_finger) {
		case 1:
			System.out.print("컴퓨터가 낸 것은 가위입니다 -----> ");
			break;
		case 2:
			System.out.print("컴퓨터가 낸 것은 바위입니다 -----> ");
			break;
		case 3:
			System.out.print("컴퓨터가 낸 것은 보입니다 -----> ");
			break;
		default:
			break;
		}
	}
	
	public char checkRSP() {
		if ((my_finger == 1 && com_finger == 3) ||
			(my_finger == 2 && com_finger == 1)	||
			(my_finger == 3 && com_finger == 2)) {
			score[0][2]++;
			score[1][0]++;
			return 'Y';
		} else if ((my_finger == 1 && com_finger == 2) ||
			(my_finger == 2 && com_finger == 3)	||
			(my_finger == 3 && com_finger == 1)) {
			score[0][0]++;
			score[1][2]++;
			return 'L';
		} else {
			score[0][1]++;
			score[1][1]++;
			return 'D';
		}
	}
	
	public void printResult() {
		System.out.printf("컴퓨터 : 이긴 횟수는 %d회, 진 횟수는 %d회, 비긴 횟수는 %d회 입니다\n", score[0][0], score[0][2], score[0][1]);
		System.out.printf("사용자 : 이긴 횟수는 %d회, 진 횟수는 %d회, 비긴 횟수는 %d회 입니다\n", score[1][0], score[1][2], score[1][1]);
	}
}
