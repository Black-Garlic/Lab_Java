package Step_M;

import java.util.Scanner;

public class StepMManager {
	public StepMManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. �޴��� txt���Ϸ� �����ϱ�\n");
			printf("=>���ϴ� �޴���?(0:exit) : ");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				M01 m01 = new M01();
				m01.saveMenu();
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
