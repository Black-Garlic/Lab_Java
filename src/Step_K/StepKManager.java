package Step_K;

import java.util.Scanner;

public class StepKManager {
	public StepKManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. �޴��� �����ϱ�\n");
			printf("2. �޴��� �����ϱ�\n");
			printf("3. ��ǥ �����ϱ�\n");
			printf("4. ��ǥ �����ϱ�\n");
			printf("5. ����� ��� �����ϱ�\n");
			printf("6. ����� ��� �����ϱ�\n");
			printf("7. �л� ���� ��� �����ϱ�\n");
			printf("=>���ϴ� �޴���?(0:exit) : ");
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
				System.out.println("�ٽ� �Է����ּ���.");
				break;
			}
		}
		s.close();
	}
	void printf(String s){System.out.print(s);} 
}
