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
				
				
				break;
			case 3:
				
				
				break;
			case 4:
				
				
				break;
			case 5:
				
				
				break;
			case 6:
				
				
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
