package Step_L;

import java.util.Scanner;

public class Order {
	private boolean valid;
	private int number;
	private int menu[] = {0, 0, 0};
	private int price[] = {25000, 15000, 17000};
	private String membership;
	private String date;
	private int charge;
	
	public void getOrder() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("손님 수를 입력하세요 ");
		number = s.nextInt();
		System.out.print("스테이크, 스파게티, 파스타의 개수를 입력하세요 : ");
		for (int i = 0; i < 3; i++)
			menu[i] = s.nextInt();
		System.out.print("멤버쉽 카드가 있습니까? (Y: 있음) ");
		membership = s.next();
		
		calCharge();
	}
	
	public void calCharge() {
		charge = 0;
		for(int i = 0; i < 3; i++)
			charge += menu[i] * price[i];
		
		if (membership.equals("Y"))
			charge *= 0.9;
		
		if (charge < 100000)
			charge *= 1.07 * 1.1;
		else
			charge *= 1.1 * 1.1;
	}
	
	public int getCharge() {
		return charge;
	}
	
	public void setDate(String date) { 
		this.date = date;
	}
	
	public void printOrder() {
		System.out.printf("%d\t%d\t%d\t%d\t%s\t%d\t%s\n",
				number, menu[0], menu[1], menu[2], membership, charge, date);
	}
}
