package Lab_A;

import java.util.Scanner;

public class A06 {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;
	
	public A06() {
		this.kor = 0;
		this.eng = 0;
		this.math = 0;
		this.total = 0;
		this.average = 0;
	}
	
	public void problem() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요. ");
		kor = s.nextInt();
		System.out.print("영어 점수를 입력하세요. ");
		eng = s.nextInt();
		System.out.print("수학 점수를 입력하세요. ");
		math = s.nextInt();
		
		total = kor + eng + math;
		average = total / 3;
		
		System.out.println("입력하신 점수의 총점은 " + total + "이고,");
		System.out.print("평균은 ");
		System.out.printf("%.1f", average);
		System.out.println("입니다.");
	}
}
