package Step_K;

import java.util.Scanner;

public class K03 {
	private double x, y;
	private int area;
	private Point point = new Point();
	
	public K03() {
		getXY();
	}
	
	public void getXY() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("��ǥ�� X, Y ���� �Է��ϼ��� => ");
		x = s.nextDouble();
		y = s.nextDouble();
		
		area = point.getArea(x, y);
	}
	
	public void printArea() {
		System.out.println("=========================");
		System.out.println("1��° ��ǥ�� " + area + "��и鿡 ��ġ�մϴ�");
		for (int i = 1; i <= 4; i++) {
			if (area == i)
				System.out.println(i + "��и� ��ǥ�� ��� 1���Դϴ�");
			else
				System.out.println(i + "��и� ��ǥ�� ��� 0���Դϴ�");
		}
	}
}
