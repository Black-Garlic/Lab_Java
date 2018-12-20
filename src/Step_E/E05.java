package Step_E;

import java.util.Scanner;

public class E05 {
	private int mode;
	private int column;
	private int i, j;
	
	public E05() {
		getMode();
	}
	
	public void getMode() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("�������� ��¸��(1: Ȧ����, 2: ¦����)�� �Է��ϼ��� ");
		mode = s.nextInt();
		System.out.print("�� �ٿ� ����� ������ �Է��ϼ��� ");
		column = s.nextInt();
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
					if (j % column == 0)
						System.out.println();
				}
				break;
			case 2:
				for (j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d\t", i * 2, j, calculate(i * 2, j));
					if (j % column == 0)
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
