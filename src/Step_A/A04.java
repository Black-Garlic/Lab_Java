package Step_A;

import java.util.Scanner;

public class A04 {
	private double m2_area;
	private double pyung_area;
	
	public A04() {
		this.m2_area = 0;
		this.pyung_area = 0;
	}
	
	public void printPyung() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("����Ʈ�� �о� ������ �Է��Ͻÿ� ");
		m2_area = s.nextDouble();
		pyung_area = m2_area / 3.305;
		
		System.out.print("����Ʈ�� ������ ");
		System.out.printf("%.1f", pyung_area);
		System.out.println("�Դϴ�.");
		
		s.close();
	}
}
