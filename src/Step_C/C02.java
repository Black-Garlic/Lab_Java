package Step_C;

import java.util.Scanner;

public class C02 {
	private double input_degree;
	
	public C02() {
		getDegree();
	}
	
	public void getDegree() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("�µ��� �Է��ϼ���. ");
		input_degree = s.nextDouble();
	}
	
	public void printDegree() {
		if (input_degree >= 80) {
			System.out.println("���¹��Դϴ�");
		} else if (input_degree >= 40 && input_degree < 80) {
			System.out.println("�¼��Դϴ�");
		} else if (input_degree >= 25 && input_degree < 40) {
			System.out.println("�̿¼��Դϴ�");
		} else if (input_degree >= 0 && input_degree < 25) {
			System.out.println("�ü��Դϴ�");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
		}
	}
}
