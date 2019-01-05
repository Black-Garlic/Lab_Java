package Step_C;

import java.util.Scanner;

public class C04 {
	private double m2_area;
	private double pyung_area;
	
	public C04() {
		getArea();
	}
	
	public void getArea() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("아파트의 분양 면적을 입력하시오 ");
		m2_area = s.nextDouble();
		pyung_area = m2_area / 3.305;
	}
	
	public void printPyung() {
		System.out.printf("아파트의 평형은 %.1f 입니다\n", pyung_area);
		if (pyung_area >= 50) {
			System.out.println("대형 아파트입니다");
		} else if (pyung_area >= 30 && pyung_area < 50) {
			System.out.println("중형 아파트입니다");
		} else if (pyung_area >= 15 && pyung_area < 30) {
			System.out.println("중소형 아파트입니다");
		} else {
			System.out.println("소형 아파트입니다");
		}
	}
}
