package Step_B;

import java.util.Scanner;

public class B09 {
	private int height;
	private int weight;
	private int bmi;
	
	public B09() {
		getBMI();
	}
	
	public void getBMI() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("����(cm����)�� �Է��ϼ��� ");
		height = s.nextInt();
		System.out.println("ü��(kg����)�� �Է��ϼ��� ");
		weight = s.nextInt();
		
		bmi = weight  * 10000 / (height * height);
	}
	
	public void printBMI() {
		if (bmi >= 25) {
			System.out.println("����� ���Դϴ�");
		} else {
			System.out.println("����� ���� �ƴմϴ�");
		}
	}
}
