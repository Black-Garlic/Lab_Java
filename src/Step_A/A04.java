package Step_A;

import java.util.Scanner;

public class A04 {
	private double m2_area;
	private double pyung_area;
	
	public A04() {
		this.m2_area = 0;
		this.pyung_area = 0;
	}
	
	public void printPyung() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("아파트의 분양 면적을 입력하시오 ");
		m2_area = s.nextDouble();
		pyung_area = m2_area / 3.305;
		
		System.out.print("아파트의 평형은 ");
		System.out.printf("%.1f", pyung_area);
		System.out.println("입니다.");
		
		s.close();
	}
}
