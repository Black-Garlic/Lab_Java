package Step_F;

import java.util.Scanner;

public class F06 {
	private int number[][] = new int[5][3];
	private int newnum;
	private int total;
	private int ho;
	
	public F06() {
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
	}
	
	public void printNum() {
		System.out.println("�� ����Ʈ�� ��� �����ڴ� ��� " + total + "�� �Դϴ�");
	}
}
