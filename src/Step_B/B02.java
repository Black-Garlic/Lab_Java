package Step_B;

import java.util.Scanner;

public class B02 {
	private double input_degree;
	private double output_degree;
	private String kind;
	
	public B02() {
		getDegree();
	}
	
	public void getDegree() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("�µ��� �Է��ϼ���. ");
		input_degree = s.nextDouble();
		kind = s.nextLine();
		System.out.print("�Է��Ͻ� �µ��� �����µ���� C��, ȭ���µ��̸� F�� �Է��ϼ��� ");
		kind = s.nextLine();
		
		convert();
	}
	
	public void convert() {
		if (kind.equals("C")) {
			output_degree = (input_degree * 1.8) + 32;
		} else if (kind.equals("F")) {
			output_degree = (input_degree - 32) / 1.8;
		}
	}
	
	public void printDegree() {
		System.out.printf("��ȯ�� �µ��� %.1f �Դϴ�\n", output_degree);
	}
}
