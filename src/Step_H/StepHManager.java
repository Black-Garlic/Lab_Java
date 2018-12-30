package Step_H;

import java.util.Scanner;

public class StepHManager {
	public StepHManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. ���� �˾� ���߱�\n");
			printf("2. �ζ� ��ȣ �����\n");
			printf("3. �ζ� ��ȣ ��÷ Ȯ���ϱ�\n");
			printf("4. ���������� �����ϱ�\n");
			printf("5. ���Ըӽ� �����\n");
			printf("6. 5�� ������ ������ ���� ���ϱ�\n");
			printf("7. ������ ������ ������ ����ϱ�\n");
			printf("8. ���ڿ� �ٲٱ�\n");
			printf("9. ����� ���� ����ϱ�\n");
			printf("=>���ϴ� �޴���?(0:exit) : ");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				H01 h01 = new H01();
				h01.getNum();
				break;
			case 2:
				H02 h02 = new H02();
				h02.makeLotto();
				break;
			case 3:
				H03 h03 = new H03();
				h03.makeLotto();
				break;
			case 4:
				H04 h04 = new H04();
				h04.doRSP();
				break;
			case 5:
				H05 h05 = new H05();
				h05.playSlotmachine();
				break;
			case 6:
				H06 h06 = new H06();
				h06.printResult();
				break;
			case 7:
				H07 h07 = new H07();
				h07.getString();
				break;
			case 8:
				H08 h08 = new H08();
				h08.getString();
				break;
			case 9:
				H09 h09 = new H09();
				h09.getString();
				break;
			default:
				System.out.println("�ٽ� �Է����ּ���.");
				break;
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}
