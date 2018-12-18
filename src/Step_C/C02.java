package Step_C;

import java.util.Scanner;

public class C02 {
	private double input_degree;
	
	public C02() {
		getDegree();
	}
	
	public void getDegree() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("온도를 입력하세요. ");
		input_degree = s.nextDouble();
	}
	
	public void printDegree() {
		if (input_degree >= 80) {
			System.out.println("끓는물입니다");
		} else if (input_degree >= 40 && input_degree < 80) {
			System.out.println("온수입니다");
		} else if (input_degree >= 25 && input_degree < 40) {
			System.out.println("미온수입니다");
		} else if (input_degree >= 0 && input_degree < 25) {
			System.out.println("냉수입니다");
		} else {
			System.out.println("잘못 입력하셨습니다");
		}
	}
}
