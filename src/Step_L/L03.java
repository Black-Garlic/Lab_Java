package Step_L;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class L03 {
	private SimpleDateFormat f = new SimpleDateFormat("YYYY�� MM�� DD�� hh:mm", Locale.KOREA);
	private String today = f.format(new Date());
	private ArrayList<Order> order = new ArrayList<Order>();
	private int select;
	
	public L03() {	}
	
	public void getOrder() {
		Scanner s = new Scanner(System.in);
		
		select = 0;
		
		while(true) {
			System.out.println("--------------------------------------------------------");
			System.out.print("1) �ֹ� 2) ���� 3) ����Ʈ 4) ���� => ");
			select = s.nextInt();
			System.out.println("--------------------------------------------------------");
			
			if (select == 1)
				addBill();
			else if (select == 2)
				deleteBill();
			else if (select == 3)
				showList();
			else if (select == 4) {
				System.out.println("����Ǿ����ϴ�");
				break;
			}
		}
	}
	
	public void addBill() {
		order.add(new Order());
		order.get(order.size() - 1).getOrder();
		order.get(order.size() - 1).setDate(today);
		
		System.out.println("������ �ð��� " + today + "�Դϴ�");
		System.out.println("�� �ݾ��� " + order.get(order.size() - 1).getCharge() + "���Դϴ�\n");
	}
	
	public void deleteBill() {
		Scanner s = new Scanner(System.in);
		int delete = 0;
		
		showList();
		System.out.print("=> �����Ͻ� ��ȣ�� �Է��ϼ��� ");
		delete = s.nextInt();
		
		if (delete > order.size())
			return;
		
		order.remove(delete - 1);
		
		System.out.println("=> �����Ǿ����ϴ�\n");
	}
	
	public void showList() {
		System.out.println("��ȣ\t�մԼ�\t������ũ\t���İ�Ƽ\t�Ľ���\t�����\t�����ݾ�\t����ð�");
		for (int i = 0; i < order.size(); i++) {
			System.out.printf("%d\t", i + 1);
			order.get(i).printOrder();
		}
		System.out.println();
	}
}
