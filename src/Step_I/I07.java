package Step_I;

import java.util.Scanner;

public class I07 {
	private int total;
	private int count;
	private int menu_price[] = {700, 300, 1000, 500, 600};
	
	public I07() {	}
	
	public void getMenu() {
		int menu;
		char response;
		count = 0;
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			showMenu();
			menu = selectMenu();

			calMenu(menu);
			count++;
			System.out.print("�� �ʿ��Ͻʴϱ�?(Y/N) ");
			response = s.nextLine().charAt(0);
			
			if (response == 'N') {
				totalPrice();
				break;
			}
		}
		s.close();
	}
	
	public void showMenu() {
		System.out.println("1. �ݶ�(700��) 2. ����Ŀ��(300��) 3. �����ּ�(1000��)");
		System.out.println("4. ȫ��(500��) 5. ���ھ�(600��)");
	}
	
	public int selectMenu() {
		int select;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("�޴��� �������ּ���. (���� : 5) ");
		select = s.nextInt();
		
		s.close();
		
		return select;
	}
	
	public void calMenu(int menu) {
		total += menu_price[menu - 1];
	}
	
	public void totalPrice() {
		System.out.println(count + "���� ���Ḧ �����Ͽ� �� " + total + "�� �Դϴ�");
	}
}
