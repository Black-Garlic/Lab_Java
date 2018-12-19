package Step_D;

import java.util.Scanner;

public class D05 {
	private int width;
	private int height;
	private int count1; //���簢��
	private int count2; //�¿�� ������ ���簢��
	private int count3; //���Ʒ��� ������ ���簢��
	private int count4; //�Ϲ����� ������ ���簢��
	private int count5; //�Ϲ����� ������ ���簢��
	
	public D05() {
		count1 = 0;
		count2 = 0;
		count3 = 0;
		count4 = 0;
		count5 = 0;
		
		getArea();
	}
	
	public void getArea() {
		Scanner s = new Scanner(System.in);
				
		while(true) {
			System.out.print("���簢���� ���� ũ��� ���� ũ�⸦ �Է��Ͻÿ� ");
			width = s.nextInt();
			height = s.nextInt();
			if (width < 0 || height < 0) break;
			calculate();			
		}		
	}
	
	public void calculate() {
		if (width == height) {
			count1++;
		} else if (width >= height * 2) {
			count2++;
		} else if (height >= width * 2) {
			count3++;
		} else if (width > height) {
			count4++;
		} else if (height > width) {
			count5++;
		}
	}
	
	public void printSquare() {
		System.out.println("'���簢��'�� ������ " + count1 + "�Դϴ�");
		System.out.println("'�¿�� ������ ���簢��'�� ������ " + count2 + "�Դϴ�");
		System.out.println("'���Ʒ��� ������ ���簢��'�� ������ " + count3 + "�Դϴ�");
		System.out.println("'�Ϲ����� ������ ���簢��'�� ������ " + count4 + "�Դϴ�");
		System.out.println("'�Ϲ����� ������ ���簢��'�� ������ " + count5 + "�Դϴ�");
	}
}
