package Step_I;

import java.util.Scanner;

public class I03 {
	public I03() { }
	
	public void getBMI() {
		int height;
		int weight;
		
		Scanner s = new Scanner(System.in);
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "��° ����� ����(cm)�� ü��(kg)�� �Է��ϼ��� ");
			height = s.nextInt();
			weight = s.nextInt();
			
			askBiman(height, weight);
		}
		s.close();
	}
	
	public void askBiman(int height, int weight) {
		int bmi = weight  * 10000 / (height * height);
		if (bmi >= 30) {
			System.out.println("�����Դϴ�");
		} else if (bmi < 30 && bmi >= 25) {
			System.out.println("�浵���Դϴ�");
		} else if (bmi < 25 && bmi >= 23) {
			System.out.println("��ü���Դϴ�");
		} else if (bmi < 23 && bmi >= 18.5) {
			System.out.println("����ü���Դϴ�");
		} else {
			System.out.println("��ü���Դϴ�");
		}
	}
}
