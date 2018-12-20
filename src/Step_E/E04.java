package Step_E;

import java.util.Scanner;

public class E04 {
	private int mode;
	private int i, j;
	
	public E04() {
		getMode();
	}
	
	public void getMode() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("구구단의 출력모드(1: 홀수단, 2: 짝수단)를 입력하세요 ");
		mode = s.nextInt();
	}
	
	public int calculate(int dan, int j) {
		return dan * j;
	}
	
	public void printDan() {
		for (i = 1; i <= 4; i++) {
			switch(mode) {
			case 1:
				for (j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d\t", i * 2 + 1, j, calculate(i * 2 + 1, j));
					if (j % 3 == 0)
						System.out.println();
				}
				break;
			case 2:
				for (j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d\t", i * 2, j, calculate(i * 2, j));
					if (j % 3 == 0)
						System.out.println();
				}
				break;
			default :
				break;	
			}			
			System.out.println();
		}
	}
}
