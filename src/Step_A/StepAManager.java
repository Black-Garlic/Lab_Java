package Step_A;

import java.util.Scanner;

public class StepAManager {
	public StepAManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. ���̰��\n");
			printf("2. �µ���ȯ\n");
			printf("3. ���簢�� ���̰��\n");
			printf("4. ����Ʈ ���� ���\n");
			printf("5. ��¥���\n");
			printf("6. �������\n");
			printf("7. ���� �뷮 ���\n");
			printf("=>���ϴ� �޴���?(0:exit) : ");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				A01 a01 = new A01();
				a01.printAge();
				break;
			case 2:
				A02 a02 = new A02();
				a02.printDegree();
				break;
			case 3:
				A03 a03 = new A03();
				a03.printArea();
				break;
			case 4:
				A04 a04 = new A04();
				a04.printPyung();
				break;
			case 5:
				A05 a05 = new A05();
				a05.printSecond();
				break;
			case 6:
				A06 a06 = new A06();
				a06.printScore();
				break;
			case 7:
				A07 a07 = new A07();
				a07.printFileSize();
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