package Step_B;

import java.util.Scanner;

public class B04 {
	private double m2_area;
	private double pyung_area;
	
	public B04() {
		getArea();
	}
	
	public void getArea() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("����Ʈ�� �о� ������ �Է��Ͻÿ� ");
		m2_area = s.nextDouble();
		pyung_area = m2_area / 3.305;
	}
	
	public void printPyung() {
		System.out.printf("����Ʈ�� ������ %.1f �̰�\n", pyung_area);
		if (pyung_area < 30) {
			System.out.println("30�� �̸��̹Ƿ� ���� ����Ʈ�Դϴ�");
		} else {
			System.out.println("30�� �̻��̹Ƿ� ū ����Ʈ�Դϴ�");
		}
		
	}
}
