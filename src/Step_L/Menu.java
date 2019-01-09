package Step_L;

import java.util.Scanner;

public class Menu {
	private String name;
	private String from;
	private int price;
	
	public void setMenu() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("=> 메뉴의 메뉴명, 원산지, 가격을 입력하세요 ");
		name = s.next();
		from = s.next();
		price = s.nextInt();
	}
	
	public void printMenu() {
		System.out.println("\t" + name + "\t\t" + from + "\t" + price);
	}
}
