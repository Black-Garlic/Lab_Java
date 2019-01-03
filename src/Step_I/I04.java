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
		System.out.println("1. 피자(15,000원) 2. 스파게티(10,000원) 3. 샐러드(7,000원) 4. 음료수(2,000원)");
	}
	
	public int selectMenu() {
		int select;
		Scanner s = new Scanner(System.in);
		
		System.out.print("메뉴를 선택해주세요. (종료 : 5) ");
		select = s.nextInt();
		
		s.close();
		
		if (!(select == 1 || select == 2 || select == 3 || select == 4))
			return -1;
		return select;
	}
	
	public void calMenu(int menu) {
		total += menu_price[menu - 1];
		System.out.println("현재까지의 주문 금액은 " + total + "원 입니다\n");
	}
	
	public void totalPrice() {
		System.out.println("\n총 주문 금액은 " + total + "원 입니다");
	}
}
