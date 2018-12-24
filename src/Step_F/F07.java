package Step_F;

import java.util.Scanner;

public class F07 {
	private int number[][] = new int[5][3];
	private int newnum;
	private int floor_total[] = new int[5];
	private int line_total[] = new int[3];
	private int total;
	private int ho;
	private int i, j;
	
	public F07() {
		getHo();
	}
	
	public void getHo() {
		Scanner s = new Scanner(System.in);
		
		total = 0;
		
		for (i = 0 ; i < 5; i++) {
			for (j = 0; j < 3; j++) {
				ho = (i + 1) * 100 + j + 1;
				
				System.out.printf("%d호에 살고 있는 사람의 숫자를 입력하세요 ", ho);
				newnum = s.nextInt();
				
				number[i][j] = newnum;
				total = total + newnum;
			}
		}
		calFloor();
		calLine();
	}
	
	public void calFloor() {
		for (i = 0; i < 5; i++) {
			floor_total[i] = 0;
			for (j = 0; j < 3; j++) {
				floor_total[i] = floor_total[i] + number[i][j];
			}
		}
	}

	public void calLine() {
		for (i = 0; i < 3; i++) {
			line_total[i] = 0;
			for (j = 0; j < 5; j++) {
				line_total[i] = line_total[i] + number[j][i];
			}
		}
	}
	
	public void printNum() {
		for (i = 0; i < 5; i++) {
			System.out.printf("%d층에 사는 거주자는 모두 %d명 입니다\n", i + 1, floor_total[i]);
		}
		
		System.out.println();
		
		for (i = 0; i < 3; i++) {
			System.out.printf("%d호 라인에 사는 거주자는 모두 %d명 입니다\n", i + 1, line_total[i]);
		}
		
		System.out.println();
		
		System.out.println("이 아파트에 사는 거주자는 모두 " + total + "명 입니다");
	}
}
