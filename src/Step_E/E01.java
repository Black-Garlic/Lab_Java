package Step_E;

import java.util.Scanner;

public class E01 {
	private int length;
	private int i, j;
	
	public E01() {
		getSize();
	}
	
	public void getSize() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("���簢���� ũ�⸦ �Է��ϼ��� ");
		length = s.nextInt();
	}
	
	public void printRect() {
		for (i = 0; i < length; i++) {
			for (j = 0; j < length; j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}
}
