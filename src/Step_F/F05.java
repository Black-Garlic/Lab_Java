package Step_F;

import java.util.Scanner;

public class F05 {
	private int height, weight;
	private int bmi;
	private int bmilist[][] = new int[10][3];
	private int count;
	
	public F05() {
		getBMI();
	}
	
	public void getBMI() {
		Scanner s = new Scanner(System.in);
		
		for (int i = 0 ; i < 10; i++) {
			System.out.printf("%d��° ����� ����(cm)�� ü��(kg)�� �Է��ϼ��� ", i + 1);
			height = s.nextInt();
			weight = s.nextInt();
			bmi = weight * 10000 / (height * height);
			
			bmilist[i][0] = height;
			bmilist[i][1] = weight;
			bmilist[i][2] = bmi;
		}
	}
	
	public void printBMI() {
		for (int i = 0; i < 10; i++) {
			if (bmilist[i][2] >= 25) {
				System.out.printf("%d��° ����� ���Դϴ�\n" , i + 1);
				count++;
			}
		}
		System.out.println("�� " + count + "���� ����� ���Դϴ�");
	}
}
