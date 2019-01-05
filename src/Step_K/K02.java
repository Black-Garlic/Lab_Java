package Step_K;

import java.util.ArrayList;
import java.util.Scanner;

public class K02 {
	private int number;
	private ArrayList<MenuPan> menu = new ArrayList<MenuPan>();
	
	public K02() {
		setMenu();
	}

	public void setMenu() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("등록하실 메뉴의 개수를 입력하세요 ");
		number = s.nextInt();
		
		for (int i = 0; i < number; i++) {
			menu.add(new MenuPan());
			menu.get(i).getMenu();	
		}
	}
	
	public void showMenu() {
		System.out.println("===================================");
		System.out.println("메뉴번호\t메뉴이름12\t\t원산지\t1인분가격");
		for (int i = 0; i < number; i++)
			menu.get(i).printMenu();
	}
}
