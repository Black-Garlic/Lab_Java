package Step_E;

import java.util.Scanner;

public class E02 {
	private int height;
	private int blank;
	private int i, j;
	
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
		for (i = 1; i <= height; i++) {
			for (j = 0; j < blank; j++) {
				System.out.print(" ");
			}
			
			for (j = 0; j < height - i; j++) {
				System.out.print(" ");
			}
			
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
