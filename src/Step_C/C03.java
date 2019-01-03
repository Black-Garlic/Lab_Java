package Step_C;

import java.util.Scanner;

public class C03 {
	private int width;
	private int height;
	
	public C03() {
		getArea();
	}
	
	public void getArea() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("직사각형의 가로 크기를 입력하시오. ");
		width = s.nextInt();
		System.out.print("직사각형의 가로 크기를 입력하시오. ");
		height = s.nextInt();
		
		s.close();
	}
	
	public void printArea() {
		if (width == height) {
			System.out.println("정사각형입니다");
		} else if (width >= height * 2) {
			System.out.println("좌우로 길쭉한 직사각형입니다");
		} else if (height >= width * 2) {
			System.out.println("위아래로 길쭉한 직사각형입니다");
		} else if (width > height) {
			System.out.println("일반적인 가로형 직사각형입니다");
		} else if (height > width) {
			System.out.println("일반적인 세로형 직사각형입니다");
		}
	}
}
