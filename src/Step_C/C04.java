package Step_C;

import java.util.Scanner;

public class C04 {
	private double m2_area;
	private double pyung_area;
	
	public C04() {
		getArea();
	}
	
	public void getArea() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("����Ʈ�� �о� ������ �Է��Ͻÿ� ");
		m2_area = s.nextDouble();
		pyung_area = m2_area / 3.305;
	}
	
	public void printPyung() {
		System.out.printf("����Ʈ�� ������ %.1f �Դϴ�\n", pyung_area);
		if (pyung_area >= 50) {
			System.out.println("���� ����Ʈ�Դϴ�");
		} else if (pyung_area >= 30 && pyung_area < 50) {
			System.out.println("���� ����Ʈ�Դϴ�");
		} else if (pyung_area >= 15 && pyung_area < 30) {
			System.out.println("�߼��� ����Ʈ�Դϴ�");
		} else {
			System.out.println("���� ����Ʈ�Դϴ�");
		}
	}
}
