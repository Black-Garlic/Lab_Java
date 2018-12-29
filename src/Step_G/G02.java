package Step_G;

import java.util.Scanner;

public class G02 {
	private double input_degree;
	private double degrees[] = new double[10];
	private String degree_name[] = {"냉수", "미온수", "온수", "끓는물"};
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
			System.out.printf("%d번 물의 온도를 입력하세요 ", i + 1);
			input_degree = s.nextDouble();
			if (input_degree < 0) {
				System.out.println("잘못 입력하셨습니다");
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
			System.out.printf("%d번 물의 온도는 %.1f도 입니다. %s\n", i + 1, degrees[i], degree_name[calDegree(i)]);
		}
		System.out.println("냉수 입력 횟수 : " + count[0]);
		System.out.println("미온수 입력 횟수 : " + count[1]);
		System.out.println("온수 입력 횟수 : " + count[2]);
		System.out.println("끓는물 입력 횟수 : " + count[3]);
	}
}
