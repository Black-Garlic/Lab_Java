package Step_E;

import java.util.Scanner;

public class E06 {
	private int rows, columns;
	private int number;
	
	public E06() {
		getSize();
	}
	
	public void getSize() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("����Ϸ��� ���� ũ��� ���� ũ�⸦ �Է��ϼ��� ");
		rows = s.nextInt();
		columns = s.nextInt();
	}
	
	public void printNum() {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				number = i * j;
				System.out.printf("%4d", number);
			}
			System.out.println();
		}
	}
}
