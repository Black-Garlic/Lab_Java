package Step_E;

import java.util.Scanner;

public class StepEManager {
	public StepEManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 입력한 숫자 크기의 정사각형 출력하기\n");
			printf("2. 입력한 숫자 크기의 높이를 갖는 우직각 삼각형 출력하기\n");
			printf("3. 입력한 숫자 크기의 높이를 갖는 이등변 삼각형 출력하기\n");
			printf("4. 홀수단 또는 짝수단의 구구단 출력하기\n");
			printf("5. 홀수단 또는 짝수단의 구구단을 열의 개수를 맞추어 출력하기\n");
			printf("6. 2차원 숫자 출력하기\n");
			printf("=>원하는 메뉴는?(0:exit) : ");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				E01 e01 = new E01();
				e01.printRect();
				break;
			case 2:
				E02 e02 = new E02();
				e02.printTri();
				break;
			case 3:
				E03 e03 = new E03();
				e03.printTri();
				break;
			case 4:
				E04 e04 = new E04();
				e04.printDan();
				break;
			case 5:
				E05 e05 = new E05();
				e05.printDan();
				break;
			case 6:
				E06 e06 = new E06();
				e06.printNum();
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
