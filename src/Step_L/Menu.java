package Step_L;

import java.util.Scanner;

public class Menu {
	private String name;
	private String from;
	private int price;
	
	public void setMenu() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("=> �޴��� �޴���, ������, ������ �Է��ϼ��� ");
		name = s.next();
		from = s.next();
		price = s.nextInt();
	}
	
	public void printMenu() {
		System.out.println("\t" + name + "\t\t" + from + "\t" + price);
	}
}
