package Step_B;

import java.util.Scanner;

public class B06 {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;
	
	public B06() {
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
		average = total / 3;
	}
	
	public void printScore() {
		System.out.println("입력하신 점수의 총점은 " + total + "이고,");
		System.out.printf("평균은 %.1f 입니다.\n", average);
		if (kor >= 90)
			System.out.println("국어점수가 우수합니다.");
		if (eng >= 90)
			System.out.println("영어점수가 우수합니다.");
		if (math >= 90)
			System.out.println("수학점수가 우수합니다.");
	}
}
