package Step_K;

import java.util.Scanner;

public class K04 {
	private double x[] = new double[100];
	private double y[] = new double[100];
	private int number;
	private int area[] = new int[100];
	private Point point = new Point();
	private int count[] = {0, 0, 0, 0};
	
	public K04() {
		getXY();
	}
	
	public void getXY() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("��� ��ǥ�� �Է��Ͻðڽ��ϱ�? ");
		number = s.nextInt();
		
		for (int i = 1; i <= number; i++) {
			System.out.print(i + "��° ��ǥ�� X, Y ���� �Է��ϼ��� => ");
			x[i - 1] = s.nextDouble();
			y[i - 1] = s.nextDouble();
		}
		
		for (int i = 0; i < number; i++) {
			area[i] = point.getArea(x[i], y[i]);
			switch(area[i]) {
			case 1:
				count[0]++;
				break;
			case 2:
				count[1]++;
				break;
			case 3:
				count[2]++;
				break;
			case 4:
				count[3]++;
				break;
			default:
				break;
			}
		}
	}
	
	public void printArea() {
		System.out.println("=========================");
		for (int i = 1; i <= number; i++) {
			System.out.println("1��° ��ǥ�� " + area[i - 1] + "��и鿡 ��ġ�մϴ�");
		}
		for (int i = 1; i <= 4; i++) {
			System.out.println(i + "��и� ��ǥ�� ��� " + count[i - 1] + "���Դϴ�");
		}
	}
}
