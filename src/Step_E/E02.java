package Step_E;

import java.util.Scanner;

public class E02 {
	private int height;
	private int blank;
	
	public E02() {
		getSize();
	}
	
	public void getSize() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� �ﰢ���� ���̿� ���� ������ ũ�⸦ �Է��ϼ��� ");
		height = s.nextInt();
		blank = s.nextInt();
	}
	
	public void printTri() {
		for (int i = 1; i <= height; i++) {
			for (int j = 0; j < blank; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < height - i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
