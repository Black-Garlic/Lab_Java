package Lab_A;

import java.util.Scanner;

public class A03 {
	private int width;
	private int height;
	private int area;
	
	public A03() {
		this.width = 0;
		this.height = 0;
		this.area = 0;
	}
	
	public void problem() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("직사각형의 가로 크기를 입력하시오. ");
		width = s.nextInt();
		System.out.print("직사각형의 가로 크기를 입력하시오. ");
		height = s.nextInt();
		
		area = width * height;
		
		System.out.println("직사각형의 넓이는 " + area + "입니다.");
	}
}
