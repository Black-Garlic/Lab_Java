package Step_E;

import java.util.Scanner;

public class E03 {
	private int height;
	private int i, j;
	
	public E03() {
		getSize();
	}
	
	public void getSize() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("�̵ �ﰢ���� ���̸� �Է��ϼ��� ");
		height = s.nextInt();
	}
	
	public void printTri() {
		for (i = 1; i <= height; i++) {			
			for (j = 0; j < height - i; j++) {
				System.out.print(" ");
			}
			
			for (j = 0; j < i * 2 - 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
