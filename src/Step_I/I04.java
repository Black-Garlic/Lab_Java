package Step_I;

import java.util.Scanner;

public class I04 {
	private int total;
	private int menu_price[] = {15000, 10000, 7000, 2000};
	
	public I04() {	}
	
	public void getMenu() {
		int menu;
		
		while(true) {
			showMenu();
			menu = selectMenu();
			if (menu == -1) {
				totalPrice();
				break;
			}
			calMenu(menu);
		}
	}
	
	public void showMenu() {
		System.out.println("1. ����(15,000��) 2. ���İ�Ƽ(10,000��) 3. ������(7,000��) 4. �����(2,000��)");
	}
	
	public int selectMenu() {
		int select;
		Scanner s = new Scanner(System.in);
		
		System.out.print("�޴��� �������ּ���. (���� : 5) ");
		select = s.nextInt();
		
		s.close();
		
		if (!(select == 1 || select == 2 || select == 3 || select == 4))
			return -1;
		return select;
	}
	
	public void calMenu(int menu) {
		total += menu_price[menu - 1];
		System.out.println("��������� �ֹ� �ݾ��� " + total + "�� �Դϴ�\n");
	}
	
	public void totalPrice() {
		System.out.println("\n�� �ֹ� �ݾ��� " + total + "�� �Դϴ�");
	}
}
