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
		
		System.out.print("좌표의 X, Y 값을 입력하세요 => ");
		x = s.nextDouble();
		y = s.nextDouble();
		
		area = point.getArea(x, y);
	}
	
	public void printArea() {
		System.out.println("=========================");
		System.out.println("1번째 좌표는 " + area + "사분면에 위치합니다");
		for (int i = 1; i <= 4; i++) {
			if (area == i)
				System.out.println(i + "사분면 좌표는 모두 1개입니다");
			else
				System.out.println(i + "사분면 좌표는 모두 0개입니다");
		}
	}
}
