package Step_C;

import java.util.Scanner;

public class C06 {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;
	
	public C06() {
		getScore();
	}
	
	public void getScore() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요. ");
		kor = s.nextInt();
		System.out.print("영어 점수를 입력하세요. ");
		eng = s.nextInt();
		System.out.print("수학 점수를 입력하세요. ");
		math = s.nextInt();
		
		total = kor + eng + math;
		average = (double) total / 3;
		
		s.close();
	}
	
	public void printScore() {
		System.out.println("입력하신 점수의 총점은 " + total + "이고,");
		System.out.printf("평균은 %.1f 입니다.\n", average);
		if (average >= 90) {
			System.out.println("수 입니다");
		} else if (average >= 80 && average < 90) {
			System.out.println("우 입니다");
		} else if (average >= 70 && average < 80) {
			System.out.println("미 입니다");
		} else if (average >= 60 && average < 70) {
			System.out.println("양 입니다");
		} else if (average < 60) {
			System.out.println("가 입니다");
		}
	}
}
