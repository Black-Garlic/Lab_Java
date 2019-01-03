package Step_D;

import java.util.Scanner;

public class D07 {
	private int a, b;
	private int x_begin, x_end;
	private int x, y;
	
	public D07() {
		getPoint();
	}
	
	public void getPoint() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("1차 함수 y = ax + b의 계수 a와 b를 입력하세요 ");
		a = s.nextInt();
		b = s.nextInt();
		
		System.out.print("x좌표의 시작 값과 끝 값을 입력하세요 ");
		x_begin = s.nextInt();
		x_end = s.nextInt();
		
		s.close();
	}
	
	public void calPoint() {
		y = a * x + b;
	}
	
	public void printPoint() {
		for (x = x_begin; x <= x_end; x++) {
			calPoint();
			System.out.println("좌표 (" + x + ", " + y + ")");
		}
	}
}
