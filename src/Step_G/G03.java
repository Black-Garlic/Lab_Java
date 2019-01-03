package Step_G;

import java.util.Scanner;

public class G03 {
	private int jumsu[][] = new int[5][3];
	private int c_average[] = new int[3];
	private String class_name[] = {"국어", "영어", "수학"};
	private int kor, eng, math;
	private int sum;
	private double average;
	
	public G03() {
		getScore();
	}
	
	public void getScore() {
		Scanner s = new Scanner(System.in);
		
		for (int i = 0 ; i < 5; i++) {
			System.out.printf("%d번 학생의 국어, 영어, 수학 점수를 입력하세요 ", i + 1);
			kor = s.nextInt();
			eng = s.nextInt();
			math = s.nextInt();
			
			jumsu[i][0] = kor;
			jumsu[i][1] = eng;
			jumsu[i][2] = math;
		}
		calSubjectSum();
		s.close();
	}
	
	public void calSubjectSum() {
		for (int i = 0; i < 3; i++) {
			c_average[i] = 0;
			for (int j = 0; j < 5; j++) {
				c_average[i] = c_average[i] + jumsu[j][i];
			}
		}
	}
	
	public void calStudentSum(int index) {
		sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += jumsu[index][i];
		}
	}
	
	public double calSubjectAverage(int index) {
		average = (double) c_average[index] / 5;
		return average;
	}
	
	public void calStudentAverage() {
		average = (double) sum / 3;
	}
	
	public char calGrade() {
		if (average >= 90) {
			return 'A';
		} else if (average < 90 && average >= 80) {
			return 'B';
		} else if (average < 80 && average >= 70) {
			return 'C';
		} else if (average < 70 && average >= 60) {
			return 'D';
		} else {
			return 'F';
		}
	}
	
	public void printScore() {
		System.out.println("1) 각 과목별 총점과 평균 점수");
		for (int i = 0; i < 3; i++) {
			System.out.println(class_name[i] + " 과목 총점은 " + c_average[i] + " 평균은 " + calSubjectAverage(i) + "입니다");
		}
		
		System.out.println("2) 각 학생별 총점과 평균 점수");
		
		for (int j = 0; j < 5; j++) {
			calStudentSum(j);
			calStudentAverage();
			System.out.printf("%d번 학생 점수 : 총점 %d, 평균 %.1f, 등급 %c\n", j + 1, sum, average, calGrade());
		}
	}
}
