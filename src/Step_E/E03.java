package Step_E;

import java.util.Scanner;

public class E03 {
	private int height;
	
	public E03() {
		getSize();
	}
	
	public void getSize() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("�̵ �ﰢ���� ���̸� �Է��ϼ��� ");
		height = s.nextInt();
		
		s.close();
	}
	
	public void printTri() {
		for (int i = 1; i <= height; i++) {			
			for (int j = 0; j < height - i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i * 2 - 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
