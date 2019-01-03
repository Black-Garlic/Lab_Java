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
			System.out.print("더 필요하십니까?(Y/N) ");
			response = s.nextLine().charAt(0);
			
			if (response == 'N') {
				totalPrice();
				break;
			}
		}
		s.close();
	}
	
	public void showMenu() {
		System.out.println("1. 콜라(700원) 2. 원두커피(300원) 3. 레몬주수(1000원)");
		System.out.println("4. 홍차(500원) 5. 코코아(600원)");
	}
	
	public int selectMenu() {
		int select;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("메뉴를 선택해주세요. (종료 : 5) ");
		select = s.nextInt();
		
		s.close();
		
		return select;
	}
	
	public void calMenu(int menu) {
		total += menu_price[menu - 1];
	}
	
	public void totalPrice() {
		System.out.println(count + "개의 음료를 선택하여 총 " + total + "원 입니다");
	}
}
