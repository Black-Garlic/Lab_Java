package Step_L;

import java.util.Scanner;

public class StepLManager {
	public StepLManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. �޴��� ���ϱ�\n");
			printf("2. ������ ����� ����\n");
			printf("3. �Ĵ� �ֹ� ����\n");
			printf("4. �л� ���� ����\n");
			printf("=>���ϴ� �޴���?(0:exit) : ");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				L01 l01 = new L01();
				break;
			case 2:
				L02 l02 = new L02();
				break;
			case 3:
				L03 l03 = new L03();
				l03.getOrder();
				break;
			case 4:
				L04 l04 = new L04();
				l04.getStudent();
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
