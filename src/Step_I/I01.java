package Step_I;

import java.util.Scanner;

public class I01 {
	private int total;
	private int menu;
	private int menu_price[] = {15000, 10000, 7000, 2000};
	
	public I01() {	}
	
	public void getMenu() {
		Scanner s = new Scanner(System.in);
		menu = 0;
		
		while(true) {
			showMenu();
			System.out.print("�޴��� �������ּ���. (���� : 5) ");
			menu = s.nextInt();
			if (menu == 5) {
				totalPrice();
				break;
			}
			calMenu();
		}
	}
	
	public void showMenu() {
		System.out.println("1. ����(15,000��) 2. ���İ�Ƽ(10,000��) 3. ������(7,000��) 4. �����(2,000��)");
	}
	
	public void calMenu() {
		total += menu_price[menu - 1];
		System.out.println("��������� �ֹ� �ݾ��� " + total + "�� �Դϴ�\n");
	}
	
	public void totalPrice() {
		System.out.println("\n�� �ֹ� �ݾ��� " + total + "�� �Դϴ�");
	}
}
