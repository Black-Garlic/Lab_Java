package Step_F;

import java.util.Scanner;

public class StepFManager {
	public StepFManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 두 번째로 큰 수의 순서 찾기\n");
			printf("2. 심사점수 계산\n");
			printf("3. 5명의 국, 영, 수 3과목 점수의 과목별 총점, 평균값 구하기\n");
			printf("4. 5명의 국, 영, 수 3과목 점수의 학생별 총점, 평균값 구하기\n");
			printf("5. 비만 판정\n");
			printf("6. 5층 아파트의 거주자 숫자 구하기\n");
			printf("7. 5층 아파트의 층별, 호수별 거주자 숫자 구하기\n");
			printf("8. 겹치지 않는 숫자 10개 입력 받기\n");
			printf("9. 배열을 이용한 연중 날짜 계산\n");
			printf("=>원하는 메뉴는?(0:exit) : ");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				F01 f01 = new F01();
				f01.printNum();
				break;
			case 2:
				F02 f02 = new F02();
				f02.printScore();
				break;
			case 3:
				F03 f03 = new F03();
				f03.printScore();
				break;
			case 4:
				F04 f04 = new F04();
				f04.printScore();
				break;
			case 5:
				F05 f05 = new F05();
				f05.printBMI();
				break;
			case 6:
				F06 f06 = new F06();
				f06.printNum();
				break;
			case 7:
				F07 f07 = new F07();
				f07.printNum();
				break;
			case 8:
				F08 f08 = new F08();
				f08.printNum();
				break;
			case 9:
				F09 f09 = new F09();
				f09.printDay();
				break;
			default:
				System.out.println("다시 입력해주세요.");
				break;
			}
		}
		s.close();
	}
	void printf(String s){System.out.print(s);} 
}
