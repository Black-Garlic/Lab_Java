package Step_K;

import java.util.Scanner;

public class StepKManager {
	public StepKManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 메뉴판 저장하기\n");
			printf("2. 메뉴판 저장하기\n");
			printf("3. 좌표 저장하기\n");
			printf("4. 좌표 저장하기\n");
			printf("5. 사용자 목록 저장하기\n");
			printf("6. 사용자 목록 저장하기\n");
			printf("7. 학생 점수 결과 저장하기\n");
			printf("=>원하는 메뉴는?(0:exit) : ");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				K01 k01 = new K01();
				k01.showMenu();
				break;
			case 2:
				K02 k02 = new K02();
				k02.showMenu();
				break;
			case 3:
				K03 k03 = new K03();
				k03.printArea();
				break;
			case 4:
				K04 k04 = new K04();
				k04.printArea();
				break;
			case 5:
				K05 k05 = new K05();
				k05.printUser();
				break;
			case 6:
				K06 k06 = new K06();
				k06.printUser();
				break;
			case 7:
				K07 k07 = new K07();
				k07.printStudent();
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
