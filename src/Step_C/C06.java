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
		
		System.out.print("���� ������ �Է��ϼ���. ");
		kor = s.nextInt();
		System.out.print("���� ������ �Է��ϼ���. ");
		eng = s.nextInt();
		System.out.print("���� ������ �Է��ϼ���. ");
		math = s.nextInt();
		
		total = kor + eng + math;
		average = (double) total / 3;
		
		s.close();
	}
	
	public void printScore() {
		System.out.println("�Է��Ͻ� ������ ������ " + total + "�̰�,");
		System.out.printf("����� %.1f �Դϴ�.\n", average);
		if (average >= 90) {
			System.out.println("�� �Դϴ�");
		} else if (average >= 80 && average < 90) {
			System.out.println("�� �Դϴ�");
		} else if (average >= 70 && average < 80) {
			System.out.println("�� �Դϴ�");
		} else if (average >= 60 && average < 70) {
			System.out.println("�� �Դϴ�");
		} else if (average < 60) {
			System.out.println("�� �Դϴ�");
		}
	}
}
