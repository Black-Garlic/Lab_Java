package Step_D;

import java.util.Scanner;

public class D06 {
	private double m2_area;
	private double pyung_area;
	private int count1; //소형 아파트
	private int count2; //중수형 아파트
	private int count3; //중형 아파트
	private int count4; //대형 아파트
	
	public D06() {
		count1 = 0;
		count2 = 0;
		count3 = 0;
		count4 = 0;
		
		getArea();
	}
	
	public void getArea() {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print("아파트의 분양 면적(제곱미터)을 입력하시오 ");
			m2_area = s.nextDouble();
			pyung_area = m2_area / 3.305;
			calculate();
			printPyung();
		}
		
		s.close();
	}
	
	public void printPyung() {
		System.out.printf("--> 이 아파트의 평형은 %.1f 입니다\n", pyung_area);
	}
	
	public void calculate() {
		if (pyung_area >= 50) {
			count4++;
		} else if (pyung_area >= 30 && pyung_area < 50) {
			count3++;
		} else if (pyung_area >= 15 && pyung_area < 30) {
			count2++;
		} else {
			count1++;
		}
	}
	
	public void printApart() {
		System.out.println("'소형 아파트'의 개수는 " + count1 + "입니다");
		System.out.println("'중소형 아파트'의 개수는 " + count2 + "입니다");
		System.out.println("'중형 아파트'의 개수는 " + count3 + "입니다");
		System.out.println("'대형 아파트'의 개수는 " + count4 + "입니다");
	}
}
