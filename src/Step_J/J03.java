package Step_J;

import java.util.Scanner;

public class J03 {
	private double input_degree;
	private double degrees[] = new double[10];
	private String degree_name[] = {"�ü�", "�̿¼�", "�¼�", "���¹�"};
	private int count[] = {0, 0, 0, 0};
	
	public J03() {
		getDegree();
	}
	
	public void getDegree() {
		Scanner s = new Scanner(System.in);
		
		int i = 0;
		while (i < 10) {
			System.out.printf("%d�� ���� �µ��� �Է��ϼ��� ", i + 1);
			input_degree = s.nextDouble();
			if (input_degree < 0) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
			} else {
				degrees[i] = input_degree;
				count[askWater(input_degree)]++;
				i++;
			}
		}
	}
	
	public byte askWater(double degree) {
		if (degree >= 80) {
			return 3;
		} else if (degree >= 40 && degree < 80) {
			return 2;
		} else if (degree >= 25 && degree < 40) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public void printDegree() {
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d�� ���� �µ��� %.1f�� �Դϴ�.\n", i + 1, degrees[i]);
		}
		for (int i = 0; i < 4; i++) {
			System.out.println(degree_name[i] + " �Է� Ƚ���� " + count[i] + " �Դϴ�");
		}
	}
}
