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
		
		System.out.print("몇개의 좌표를 입력하시겠습니까? ");
		number = s.nextInt();
		
		for (int i = 1; i <= number; i++) {
			System.out.print(i + "번째 좌표의 X, Y 값을 입력하세요 => ");
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
			System.out.println("1번째 좌표는 " + area[i - 1] + "사분면에 위치합니다");
		}
		for (int i = 1; i <= 4; i++) {
			System.out.println(i + "사분면 좌표는 모두 " + count[i - 1] + "개입니다");
		}
	}
}
