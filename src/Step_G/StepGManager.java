package Step_G;

import java.util.Scanner;

public class StepGManager {
	public StepGManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이 계산 및 연령대 판정\n");
			printf("2. 물의 온도 구간 판정\n");
			printf("3. 점수 계산\n");
			printf("4. 부동산 중개 수수료 계산기\n");
			printf("5. PC방 이용료 계산기\n");
			printf("6. 쇼핑몰 매출 계산기\n");
			printf("7. 놀이공원 매표소\n");
			printf("=>원하는 메뉴는?(0:exit) : ");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				G01 g01 = new G01();
				g01.printCount();
				break;
			case 2:
				G02 g02 = new G02();
				g02.printDegree();
				break;
			case 3:
				G03 g03 = new G03();
				g03.printScore();
				break;
			case 4:
				G04 g04 = new G04();
				g04.getCharge();
				break;
			case 5:
				G05 g05 = new G05();
				g05.getCharge();
				break;
			case 6:
				G06 g06 = new G06();
				g06.getSale();
				break;
			case 7:
				G07 g07 = new G07();
				g07.getTeam();
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
