package Step_B;

import java.util.Scanner;

public class B02 {
	private double input_degree;
	private double output_degree;
	private String kind;
	
	public B02() {
		getDegree();
	}
	
	public void getDegree() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("온도를 입력하세요. ");
		input_degree = s.nextDouble();
		kind = s.nextLine();
		System.out.print("입력하신 온도가 섭씨온도라면 C를, 화씨온도이면 F를 입력하세요 ");
		kind = s.nextLine();
		
		convert();
	}
	
	public void convert() {
		if (kind.equals("C")) {
			output_degree = (input_degree * 1.8) + 32;
		} else if (kind.equals("F")) {
			output_degree = (input_degree - 32) / 1.8;
		}
	}
	
	public void printDegree() {
		System.out.printf("변환된 온도는 %.1f 입니다\n", output_degree);
	}
}
