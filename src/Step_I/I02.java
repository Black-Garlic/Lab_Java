package Step_I;

import java.util.Scanner;

public class I02 {
	
	public I02() { }
	
	public void getSize() {
		int height;
		int blank;
		char shape;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� �ﰢ���� �׸��µ� ����� ���ڸ� �Է��ϼ��� ");
		shape = s.nextLine().charAt(0);
		
		System.out.print("���� �ﰢ���� ���̿� ���� ������ ũ�⸦ �Է��ϼ��� ");
		height = s.nextInt();
		blank = s.nextInt();
		
		printCharWithBlank(blank, height, shape);
	}
	
	public void printCharWithBlank(int blanks, int size, char ch) {
		for (int i = 1; i <= size; i++) {
			for (int j = 0; j < blanks; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < size - i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i; j++) {
				System.out.print(ch);
			}
			
			System.out.println();
		}
	}
}
