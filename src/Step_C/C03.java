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
		
		System.out.print("���簢���� ���� ũ�⸦ �Է��Ͻÿ�. ");
		width = s.nextInt();
		System.out.print("���簢���� ���� ũ�⸦ �Է��Ͻÿ�. ");
		height = s.nextInt();
		
		s.close();
	}
	
	public void printArea() {
		if (width == height) {
			System.out.println("���簢���Դϴ�");
		} else if (width >= height * 2) {
			System.out.println("�¿�� ������ ���簢���Դϴ�");
		} else if (height >= width * 2) {
			System.out.println("���Ʒ��� ������ ���簢���Դϴ�");
		} else if (width > height) {
			System.out.println("�Ϲ����� ������ ���簢���Դϴ�");
		} else if (height > width) {
			System.out.println("�Ϲ����� ������ ���簢���Դϴ�");
		}
	}
}
