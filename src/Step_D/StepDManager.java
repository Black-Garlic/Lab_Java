package Step_D;

import java.util.Scanner;

public class StepDManager {
	public StepDManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 1���� ���� ���ϱ�\n");
			printf("2. �Է� ���� ���ڵ� �߿��� ���� ū ���� ���� ���� �� ���ϱ�\n");
			printf("3. �Է� ���� ���ڵ��� ���հ�� ��� �� ���ϱ�\n");
			printf("4. �̼����� ���� ����\n");
			printf("5. ���簢�� ���� ���� ����\n");
			printf("6. ����Ʈ ���� ���� �� ���� ����\n");
			printf("7. 1�� �޼ҵ��� ��ǥ ���ϱ�\n");
			printf("8. 2�� �޼ҵ��� ��ǥ ���ϱ�\n");
			printf("9. ���ϴ� �������� �� ����ϱ�\n");
			printf("10. �� ���� ��Ÿ�� ��� ����ϱ�\n");
			printf("=>���ϴ� �޴���?(0:exit) : ");
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
				System.out.println("�ٽ� �Է����ּ���.");
				break;
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}
