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
		
		System.out.print("���� ������ �Է��ϼ���. ");
		kor = s.nextInt();
		System.out.print("���� ������ �Է��ϼ���. ");
		eng = s.nextInt();
		System.out.print("���� ������ �Է��ϼ���. ");
		math = s.nextInt();
		
		total = kor + eng + math;
		average = total / 3;
	}
	
	public void printScore() {
		System.out.println("�Է��Ͻ� ������ ������ " + total + "�̰�,");
		System.out.printf("����� %.1f �Դϴ�.\n", average);
		if (kor >= 90)
			System.out.println("���������� ����մϴ�.");
		if (eng >= 90)
			System.out.println("���������� ����մϴ�.");
		if (math >= 90)
			System.out.println("���������� ����մϴ�.");
	}
}
