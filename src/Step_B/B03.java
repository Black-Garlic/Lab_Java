package Step_B;

import java.util.Scanner;

public class B03 {
	private int width;
	private int height;
	private int area;
	
	public B03() {
		getArea();
	}
	
	public void getArea() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("직사각형의 가로 크기를 입력하시오. ");
		width = s.nextInt();
		System.out.print("직사각형의 가로 크기를 입력하시오. ");
		height = s.nextInt();
		
		area = width * height;
		
		s.close();
	}
	
	public void printArea() {
		System.out.println("직사각형의 넓이는 " + area + "입니다.");
		if (width == height) {
			System.out.println("정사각형입니다.");
		} else {
			System.out.println("정사각형이 아닙니다.");
		}
	}
}
