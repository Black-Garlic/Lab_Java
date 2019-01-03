package Step_C;

import java.util.Scanner;

public class StepCManager {
	public StepCManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이 계산 및 연령대 판정\n");
			printf("2. 물의 온도 구간 판정\n");
			printf("3. 직사각형 형태 판정\n");
			printf("4. 아파트 평형 계산 및 종류 판정\n");
			printf("5. 연중 날짜 계산\n");
			printf("6. 점수 계산\n");
			printf("7. 파일 전송 시간 계산\n");
			printf("8. 3개의 수 중 최댓값과 최솟값 구하기\n");
			printf("9. 소득세 계산\n");
			printf("10. 간단한 사칙연산 계산기\n");
			printf("11. 윤년 판정하기\n");
			printf("=>원하는 메뉴는?(0:exit) : ");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				C01 c01 = new C01();
				c01.printAdult();
				break;
			case 2:
				C02 c02 = new C02();
				c02.printDegree();
				break;
			case 3:
				C03 c03 = new C03();
				c03.printArea();
				break;
			case 4:
				C04 c04 = new C04();
				c04.printPyung();
				break;
			case 5:
				C05 c05 = new C05();
				c05.printDay();
				break;
			case 6:
				C06 c06 = new C06();
				c06.printScore();
				break;
			case 7:
				C07 c07 = new C07();
				c07.printFileTime();
				break;
			case 8:
				C08 c08 = new C08();
				c08.printMaxMin();
				break;
			case 9:
				C09 c09 = new C09();
				c09.printTax();
				break;
			case 10:
				C10 c10 = new C10();
				c10.printResult();
				break;
			case 11:
				C11 c11 = new C11();
				c11.printYear();
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
