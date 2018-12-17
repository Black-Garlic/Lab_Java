package Step_A;

import java.util.Scanner;

public class A02 {
	private double c_degree;
	private double f_degree;
	
	public A02() {
		this.c_degree = 0;
		this.f_degree = 0;
	}
	
	public void problem() {
		Scanner s = new Scanner(System.in);
		System.out.print("섭씨 온도를 입력하시오. ");
		c_degree = s.nextDouble();
		f_degree = c_degree * 1.8 + 32;
		System.out.println("화씨 온도는 " + f_degree + "입니다.");
	}
}
