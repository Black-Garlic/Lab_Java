package Step_J;

import java.util.Scanner;

public class J03 {
	private double input_degree;
	private double degrees[] = new double[10];
	private String degree_name[] = {"냉수", "미온수", "온수", "끓는물"};
	private int count[] = {0, 0, 0, 0};
	
	public J03() {
		getDegree();
	}
	
	public void getDegree() {
		Scanner s = new Scanner(System.in);
		
		int i = 0;
		while (i < 10) {
			System.out.printf("%d번 물의 온도를 입력하세요 ", i + 1);
			input_degree = s.nextDouble();
			if (input_degree < 0) {
				System.out.println("잘못 입력하셨습니다");
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
			System.out.printf("%d번 물의 온도는 %.1f도 입니다.\n", i + 1, degrees[i]);
		}
		for (int i = 0; i < 4; i++) {
			System.out.println(degree_name[i] + " 입력 횟수는 " + count[i] + " 입니다");
		}
	}
}
