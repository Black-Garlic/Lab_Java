package Step_D;

import java.util.Scanner;

public class D08 {
	private int a, b, c;
	private int x_begin, x_end;
	private int x, y;
	
	public D08() {
		getPoint();
	}
	
	public void getPoint() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("1�� �Լ� y = ax^2 + bx + c�� ��� a�� b�� c�� �Է��ϼ��� ");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		
		System.out.print("x��ǥ�� ���� ���� �� ���� �Է��ϼ��� ");
		x_begin = s.nextInt();
		x_end = s.nextInt();
	}
	
	public void calPoint() {
		y = a * x * x + b * x + c;
	}
	
	public void printPoint() {
		for (x = x_begin; x <= x_end; x++) {
			calPoint();
			System.out.println("��ǥ (" + x + ", " + y + ")");
		}
	}
}
