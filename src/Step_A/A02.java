package Step_A;

import java.util.Scanner;

public class A02 {
	private double c_degree;
	private double f_degree;
	
	public A02() {
		this.c_degree = 0;
		this.f_degree = 0;
	}
	
	public void problem() {
		Scanner s = new Scanner(System.in);
		System.out.print("���� �µ��� �Է��Ͻÿ�. ");
		c_degree = s.nextDouble();
		f_degree = c_degree * 1.8 + 32;
		System.out.println("ȭ�� �µ��� " + f_degree + "�Դϴ�.");
	}
}
