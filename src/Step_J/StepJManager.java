package Step_J;

import java.util.Scanner;

public class StepJManager {
	public StepJManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. ���� ��� �� ���ɴ� ����\n");
			printf("2. �ɻ����� ���\n");
			printf("3. ���� �µ� ���� ���� ����\n");
			printf("4. ���� ��¥ ���� �޼ҵ带 �̿��� ��¥ ���� ����\n");
			printf("5. ���� ���� �ý���\n");
			printf("6. �Ǻ���ġ �� ���ϱ�\n");
			printf("7. 2�� ������ ���ϱ�\n");
			printf("8. Ackermann �� ���ϱ�\n");
			printf("9. pow() �޼ҵ� �����\n");
			printf("10. �Ǻ���ġ ������ Ȳ�ݺ��� ���ϱ�\n");
			printf("=>���ϴ� �޴���?(0:exit) : ");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				J01 j01 = new J01();
				j01.printCount();
				break;
			case 2:
				J02 j02 = new J02();
				j02.printScore();
				break;
			case 3:
				J03 j03 = new J03();
				j03.printDegree();
				break;
			case 4:
				J04 j04 = new J04();
				j04.getDays();
				break;
			case 5:
				J05 j05 = new J05();
				j05.getTime();
				break;
			case 6:
				J06 j06 = new J06();
				j06.printFibonacci();
				break;
			case 7:
				J07 j07 = new J07();
				j07.getNum();
				break;
			case 8:
				J08 j08 = new J08();
				j08.printAckermann();
				break;
			case 9:
				J09 j09 = new J09();
				j09.getNum();
				break;
			case 10:
				J10 j10 = new J10();
				j10.printRatio();
				break;
			default:
				System.out.println("�ٽ� �Է����ּ���.");
				break;
			}
		}
		s.close();
	}
	void printf(String s){System.out.print(s);} 
}
