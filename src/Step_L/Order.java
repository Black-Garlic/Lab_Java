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
		
		System.out.print("�մ� ���� �Է��ϼ��� ");
		number = s.nextInt();
		System.out.print("������ũ, ���İ�Ƽ, �Ľ�Ÿ�� ������ �Է��ϼ��� : ");
		for (int i = 0; i < 3; i++)
			menu[i] = s.nextInt();
		System.out.print("����� ī�尡 �ֽ��ϱ�? (Y: ����) ");
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
