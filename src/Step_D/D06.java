package Step_D;

import java.util.Scanner;

public class D06 {
	private double m2_area;
	private double pyung_area;
	private int count1; //���� ����Ʈ
	private int count2; //�߼��� ����Ʈ
	private int count3; //���� ����Ʈ
	private int count4; //���� ����Ʈ
	
	public D06() {
		count1 = 0;
		count2 = 0;
		count3 = 0;
		count4 = 0;
		
		getArea();
	}
	
	public void getArea() {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print("����Ʈ�� �о� ����(��������)�� �Է��Ͻÿ� ");
			m2_area = s.nextDouble();
			pyung_area = m2_area / 3.305;
			calculate();
			printPyung();
		}
		
		s.close();
	}
	
	public void printPyung() {
		System.out.printf("--> �� ����Ʈ�� ������ %.1f �Դϴ�\n", pyung_area);
	}
	
	public void calculate() {
		if (pyung_area >= 50) {
			count4++;
		} else if (pyung_area >= 30 && pyung_area < 50) {
			count3++;
		} else if (pyung_area >= 15 && pyung_area < 30) {
			count2++;
		} else {
			count1++;
		}
	}
	
	public void printApart() {
		System.out.println("'���� ����Ʈ'�� ������ " + count1 + "�Դϴ�");
		System.out.println("'�߼��� ����Ʈ'�� ������ " + count2 + "�Դϴ�");
		System.out.println("'���� ����Ʈ'�� ������ " + count3 + "�Դϴ�");
		System.out.println("'���� ����Ʈ'�� ������ " + count4 + "�Դϴ�");
	}
}
