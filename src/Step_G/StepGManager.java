package Step_G;

import java.util.Scanner;

public class StepGManager {
	public StepGManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. ���� ��� �� ���ɴ� ����\n");
			printf("2. ���� �µ� ���� ����\n");
			printf("3. ���� ���\n");
			printf("4. �ε��� �߰� ������ ����\n");
			printf("5. PC�� �̿�� ����\n");
			printf("6. ���θ� ���� ����\n");
			printf("7. ���̰��� ��ǥ��\n");
			printf("=>���ϴ� �޴���?(0:exit) : ");
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
				System.out.println("�ٽ� �Է����ּ���.");
				break;
			}
		}
		s.close();
	}
	void printf(String s){System.out.print(s);} 
}
