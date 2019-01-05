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
		
		System.out.println("신장(cm단위)를 입력하세요 ");
		height = s.nextInt();
		System.out.println("체중(kg단위)를 입력하세요 ");
		weight = s.nextInt();
		
		bmi = weight  * 10000 / (height * height);
	}
	
	public void printBMI() {
		if (bmi >= 25) {
			System.out.println("당신은 비만입니다");
		} else {
			System.out.println("당신은 비만이 아닙니다");
		}
	}
}
