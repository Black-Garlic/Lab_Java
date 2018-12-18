package Step_B;

import java.util.Scanner;

public class B04 {
	private double m2_area;
	private double pyung_area;
	
	public B04() {
		getArea();
	}
	
	public void getArea() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("아파트의 분양 면적을 입력하시오 ");
		m2_area = s.nextDouble();
		pyung_area = m2_area / 3.305;
	}
	
	public void printPyung() {
		System.out.printf("아파트의 평형은 %.1f 이고\n", pyung_area);
		if (pyung_area < 30) {
			System.out.println("30평 미만이므로 작은 아파트입니다");
		} else {
			System.out.println("30평 이상이므로 큰 아파트입니다");
		}
		
	}
}
