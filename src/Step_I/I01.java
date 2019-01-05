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
			System.out.print("메뉴를 선택해주세요. (종료 : 5) ");
			menu = s.nextInt();
			if (menu == 5) {
				totalPrice();
				break;
			}
			calMenu();
		}
	}
	
	public void showMenu() {
		System.out.println("1. 피자(15,000원) 2. 스파게티(10,000원) 3. 샐러드(7,000원) 4. 음료수(2,000원)");
	}
	
	public void calMenu() {
		total += menu_price[menu - 1];
		System.out.println("현재까지의 주문 금액은 " + total + "원 입니다\n");
	}
	
	public void totalPrice() {
		System.out.println("\n총 주문 금액은 " + total + "원 입니다");
	}
}
