package Step_K;

import java.util.Scanner;

public class Student {
	private int score[] = new int [3];
	private int sum;
	private double average;
	private String grade;

	public void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("학생의 아이디, 비밀번호를 입력하세요 => ");
		for (int i = 0; i < 3; i++)
			score[i] = s.nextInt();
		
		calculate();
	}
	
	public void calculate() {
		sum = 0;
		for (int i = 0; i < 3; i++)
			sum += score[i];
		
		average = (double) sum / 3;
		
		if (average >= 90) {
			grade = "A";
		} else if (average < 90 && average >= 85) {
			grade = "B+";
		} else if (average < 85 && average >= 80) {
			grade = "B";
		} else if (average < 80 && average >= 75) {
			grade = "C+";
		} else if (average < 75 && average >= 70) {
			grade = "C";
		} else if (average < 70 && average >= 65) {
			grade = "D+";
		} else if (average < 65 && average >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
	}
	
	public void print(int index) {
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%.1f\t%s\n",
				index, score[0], score[1], score[2], sum, average, grade);
	}
}
