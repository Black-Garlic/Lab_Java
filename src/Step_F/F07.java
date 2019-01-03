package Step_F;

import java.util.Scanner;

public class F07 {
	private int number[][] = new int[5][3];
	private int newnum;
	private int floor_total[] = new int[5];
	private int line_total[] = new int[3];
	private int total;
	private int ho;
	
	public F07() {
		getHo();
	}
	
	public void getHo() {
		Scanner s = new Scanner(System.in);
		
		total = 0;
		
		for (int i = 0 ; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				ho = (i + 1) * 100 + j + 1;
				
				System.out.printf("%dȣ�� ��� �ִ� ����� ���ڸ� �Է��ϼ��� ", ho);
				newnum = s.nextInt();
				
				number[i][j] = newnum;
				total = total + newnum;
			}
		}
		calFloor();
		calLine();
		s.close();
	}
	
	public void calFloor() {
		for (int i = 0; i < 5; i++) {
			floor_total[i] = 0;
			for (int j = 0; j < 3; j++) {
				floor_total[i] = floor_total[i] + number[i][j];
			}
		}
	}

	public void calLine() {
		for (int i = 0; i < 3; i++) {
			line_total[i] = 0;
			for (int j = 0; j < 5; j++) {
				line_total[i] = line_total[i] + number[j][i];
			}
		}
	}
	
	public void printNum() {
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d���� ��� �����ڴ� ��� %d�� �Դϴ�\n", i + 1, floor_total[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			System.out.printf("%dȣ ���ο� ��� �����ڴ� ��� %d�� �Դϴ�\n", i + 1, line_total[i]);
		}
		
		System.out.println("\n�� ����Ʈ�� ��� �����ڴ� ��� " + total + "�� �Դϴ�");
	}
}
