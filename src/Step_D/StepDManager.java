package Step_D;

import java.util.Scanner;

public class StepDManager {
	public StepDManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 1부터 숫자 더하기\n");
			printf("2. 입력 받은 숫자들 중에서 가장 큰 수와 가장 작은 수 구하기\n");
			printf("3. 입력 받은 숫자들의 총합계와 평균 값 구하기\n");
			printf("4. 미성년자 숫자 세기\n");
			printf("5. 직사각형 형태 개수 세기\n");
			printf("6. 아파트 평형 꼐산 및 종류 판정\n");
			printf("7. 1차 메소드의 좌표 구하기\n");
			printf("8. 2차 메소드의 좌표 구하기\n");
			printf("9. 원하는 구구단의 단 출력하기\n");
			printf("10. 두 수의 배타적 배수 출력하기\n");
			printf("=>원하는 메뉴는?(0:exit) : ");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				D01 d01 = new D01();
				d01.printNum();
				break;
			case 2:
				D02 d02 = new D02();
				d02.printNum();
				break;
			case 3:
				D03 d03 = new D03();
				d03.printNum();
				break;
			case 4:
				D04 d04 = new D04();
				d04.printYoung();
				break;
			case 5:
				D05 d05 = new D05();
				d05.printSquare();
				break;
			case 6:
				D06 d06 = new D06();
				d06.printApart();
				break;
			case 7:
				D07 d07 = new D07();
				d07.printPoint();
				break;
			case 8:
				D08 d08 = new D08();
				d08.printPoint();
				break;
			case 9:
				D09 d09 = new D09();
				d09.printDan();
				break;
			case 10:
				D10 d10 = new D10();
				d10.printNum();
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
