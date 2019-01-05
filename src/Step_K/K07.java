package Step_K;

import java.util.Scanner;

public class K07 {
	private int number;
	private Student student[] = new Student[5];
	
	public K07() {
		setStudent();
	}
	
	public void setStudent() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("등록할 학생의 숫자는? ");
		number = s.nextInt();
		
		for (int i = 0; i < number; i++) {
			student[i] = new Student();
			System.out.printf("%d번 ", i + 1);
			student[i].input();
		}
	}
	
	public void printStudent() {
		System.out.println("========================");
		System.out.println("등록된 " + number + "명의 학생 목록은 다음과 같습니다");
		System.out.println("------------------------");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점");
		for (int i = 0; i < number; i++) {
			student[i].print(i + 1);
		}
	}
}
