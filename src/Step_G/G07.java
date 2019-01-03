package Step_G;

import java.util.Scanner;

public class G07 {
	private int team_count;
	private int charge[] = {5000, 10000, 15000, 3000};
	private int count[] = new int[4];
	private int v_count[] = {0, 0, 0, 0};
	private int total_count = 0;
	private int sum;
	private int total_sum = 0;
	private int membership = 0;
	
	public G07() { }
	
	public void getTeam() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("오늘 방문한 팀 수를 입력하세요 ");
		team_count = s.nextInt();
		
		for (int i = 0; i < team_count; i++) {
			System.out.printf("%d번팀 인원수(초등학생, 청소년, 일반, 경로대상)를 입력하세요 ", i + 1);
			
			for (int j = 0; j < 4; j++) {
				count[j] = s.nextInt();
			}
			
			System.out.printf("%d번팀 할인카드 종류(카드없음 : 0, 일반등급 : 1, VIP등급 : 2)를 입력하세요 ", i + 1);
			membership = s.nextInt();
			
			calSale();
			printSale(i);
		}
		printTotalSale();
		s.close();
	}
	
	public void calSale() {
		sum = 0;
		for (int j = 0; j < 4; j++) {
			v_count[j] += count[j];
			total_count += count[j];
			
			switch(membership) {
			case 0:
				sum += count[j] * charge[j];
				break;
			case 1:
				sum += count[j] * charge[j] * 0.9;
				break;
			case 2:
				sum += count[j] * charge[j] * 0.8;
				break;
			default :
				break;
			}
		}
		total_sum += sum;
	}
	
	public void printSale(int index) {
		System.out.printf("%d번팀 입장료는 %d원 입니다\n\n", index + 1, sum);
	}
	
	public void printTotalSale() {
		System.out.println("오늘 총 방문자 수는 " + total_count + "명 입니다");
		System.out.println("초등학생 수는 " + v_count[0] + "명 입니다");
		System.out.println("청소년 수는 " + v_count[1] + "명 입니다");
		System.out.println("일반인 수는 " + v_count[2] + "명 입니다");
		System.out.println("경로대상 수는 " + v_count[3] + "명 입니다");
		System.out.println("총 입장료는 " + total_sum + "원 입니다");
	}
}
