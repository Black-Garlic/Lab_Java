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
		
		System.out.print("���� ������ �Է��ϼ���. ");
		kor = s.nextInt();
		System.out.print("���� ������ �Է��ϼ���. ");
		eng = s.nextInt();
		System.out.print("���� ������ �Է��ϼ���. ");
		math = s.nextInt();
		
		total = kor + eng + math;
		average = total / 3;
		
		System.out.println("�Է��Ͻ� ������ ������ " + total + "�̰�,");
		System.out.print("����� ");
		System.out.printf("%.1f", average);
		System.out.println("�Դϴ�.");
	}
}
