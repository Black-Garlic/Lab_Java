package Step_I;

import java.util.Scanner;

public class StepIManager {
	public StepIManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. �޴��� �����ִ� �޼ҵ� �����\n");
			printf("2. ��ĭ�� �Բ� Ư�� ���ڸ� ������ŭ ��� �޼ҵ� �����\n");
			printf("3. �� ����\n");
			printf("4. �޴� ��ȣ �޾ƿ��� �޼ҵ� �����\n");
			printf("5. �ִ� �����ϴ� �޼ҵ� �����\n");
			printf("6. ������ ���ڸ� ����� ������ �����ϴ� �޼ҵ� �����\n");
			printf("7. ���Ǳ⿡�� ������ ���� ������ �����ϴ� �޼ҵ� �����\n");
			printf("=>���ϴ� �޴���?(0:exit) : ");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				I01 i01 = new I01();
				i01.getMenu();
				break;
			case 2:
				I02 i02 = new I02();
				i02.getSize();
				break;
			case 3:
				I03 i03 = new I03();
				i03.getBMI();
				break;
			case 4:
				I04 i04 = new I04();
				i04.getMenu();
				break;
			case 5:
				I05 i05 = new I05();
				i05.getNum();
				break;
			case 6:
				I06 i06 = new I06();
				i06.generateNum();
				break;
			case 7:
				I07 i07 = new I07();
				i07.getMenu();
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
