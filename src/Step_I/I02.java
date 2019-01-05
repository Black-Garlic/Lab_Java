package Step_I;

import java.util.Scanner;

public class I02 {
	
	public I02() { }
	
	public void getSize() {
		int height;
		int blank;
		char shape;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("직각 삼각형을 그리는데 사용할 문자를 입력하세요 ");
		shape = s.nextLine().charAt(0);
		
		System.out.print("직각 삼각형의 높이와 왼쪽 여백의 크기를 입력하세요 ");
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
