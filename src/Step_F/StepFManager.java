package Step_F;

import java.util.Scanner;

public class StepFManager {
	public StepFManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. �� ��°�� ū ���� ���� ã��\n");
			printf("2. �ɻ����� ���\n");
			printf("3. 5���� ��, ��, �� 3���� ������ ���� ����, ��հ� ���ϱ�\n");
			printf("4. 5���� ��, ��, �� 3���� ������ �л��� ����, ��հ� ���ϱ�\n");
			printf("5. �� ����\n");
			printf("6. 5�� ����Ʈ�� ������ ���� ���ϱ�\n");
			printf("7. 5�� ����Ʈ�� ����, ȣ���� ������ ���� ���ϱ�\n");
			printf("8. ��ġ�� �ʴ� ���� 10�� �Է� �ޱ�\n");
			printf("9. �迭�� �̿��� ���� ��¥ ���\n");
			printf("=>���ϴ� �޴���?(0:exit) : ");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				F01 f01 = new F01();
				f01.printNum();
				break;
			case 2:
				F02 f02 = new F02();
				f02.printScore();
				break;
			case 3:
				F03 f03 = new F03();
				f03.printScore();
				break;
			case 4:
				F04 f04 = new F04();
				f04.printScore();
				break;
			case 5:
				F05 f05 = new F05();
				f05.printBMI();
				break;
			case 6:
				F06 f06 = new F06();
				f06.printNum();
				break;
			case 7:
				F07 f07 = new F07();
				f07.printNum();
				break;
			case 8:
				F08 f08 = new F08();
				f08.printNum();
				break;
			case 9:
				F09 f09 = new F09();
				f09.printDay();
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
