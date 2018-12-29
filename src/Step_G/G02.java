package Step_G;

import java.util.Scanner;

public class G02 {
	private double input_degree;
	private double degrees[] = new double[10];
	private String degree_name[] = {"�ü�", "�̿¼�", "�¼�", "���¹�"};
	private int count[] = {0, 0, 0, 0};
	private int i;
	private int sel;
	
	
	public G02() {
		getDegree();
	}
	
	public void getDegree() {
		Scanner s = new Scanner(System.in);
		
		i = 0;
		while (i < 10) {
			System.out.printf("%d�� ���� �µ��� �Է��ϼ��� ", i + 1);
			input_degree = s.nextDouble();
			if (input_degree < 0) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
			} else {
				degrees[i] = input_degree;
				i++;
			}
		}
	}
	
	public int calDegree(int index) {
		if (degrees[index] >= 80) {
			count[3]++;
			return 3;
		} else if (degrees[index] >= 40 && degrees[index] < 80) {
			count[2]++;
			return 2;
		} else if (degrees[index] >= 25 && degrees[index] < 40) {
			count[1]++;
			return 1;
		} else if (degrees[index] >= 0 && degrees[index] < 25) {
			count[0]++;
			return 0;
		} else {
			return 0;
		}
	}
	
	public void printDegree() {
		for (i = 0; i < 10; i++) {
			System.out.printf("%d�� ���� �µ��� %.1f�� �Դϴ�. %s\n", i + 1, degrees[i], degree_name[calDegree(i)]);
		}
		System.out.println("�ü� �Է� Ƚ�� : " + count[0]);
		System.out.println("�̿¼� �Է� Ƚ�� : " + count[1]);
		System.out.println("�¼� �Է� Ƚ�� : " + count[2]);
		System.out.println("���¹� �Է� Ƚ�� : " + count[3]);
	}
}
