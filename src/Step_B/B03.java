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
		
		System.out.print("���簢���� ���� ũ�⸦ �Է��Ͻÿ�. ");
		width = s.nextInt();
		System.out.print("���簢���� ���� ũ�⸦ �Է��Ͻÿ�. ");
		height = s.nextInt();
		
		area = width * height;
		
		s.close();
	}
	
	public void printArea() {
		System.out.println("���簢���� ���̴� " + area + "�Դϴ�.");
		if (width == height) {
			System.out.println("���簢���Դϴ�.");
		} else {
			System.out.println("���簢���� �ƴմϴ�.");
		}
	}
}
