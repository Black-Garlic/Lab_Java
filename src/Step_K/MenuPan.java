package Step_K;

import java.util.Scanner;

public class MenuPan {
	private int num;
	private String name;
	private String from;
	private int price;
	
	public void getMenu() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("메뉴의 번호, 메뉴명, 원산지, 가격을 입력하세요 ");
		num = s.nextInt();
		name = s.next();
		from = s.next();
		price = s.nextInt();
	}
	
	public void printMenu() {
		System.out.println(num + "\t" + name + "\t\t" + from + "\t" + price);
	}
}
