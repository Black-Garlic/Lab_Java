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
		
		System.out.print("���簢���� ���� ũ�⸦ �Է��Ͻÿ�. ");
		width = s.nextInt();
		System.out.print("���簢���� ���� ũ�⸦ �Է��Ͻÿ�. ");
		height = s.nextInt();
		
		area = width * height;
		
		System.out.println("���簢���� ���̴� " + area + "�Դϴ�.");
	}
}
