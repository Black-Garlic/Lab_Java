package Step_L;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class L03 {
	private SimpleDateFormat f = new SimpleDateFormat("YYYY년 MM월 DD일 hh:mm", Locale.KOREA);
	private String today = f.format(new Date());
	private ArrayList<Order> order = new ArrayList<Order>();
	private int select;
	
	public L03() {	}
	
	public void getOrder() {
		Scanner s = new Scanner(System.in);
		
		select = 0;
		
		while(true) {
			System.out.println("--------------------------------------------------------");
			System.out.print("1) 주문 2) 결제 3) 리스트 4) 종료 => ");
			select = s.nextInt();
			System.out.println("--------------------------------------------------------");
			
			if (select == 1)
				addBill();
			else if (select == 2)
				deleteBill();
			else if (select == 3)
				showList();
			else if (select == 4) {
				System.out.println("종료되었습니다");
				break;
			}
		}
	}
	
	public void addBill() {
		order.add(new Order());
		order.get(order.size() - 1).getOrder();
		order.get(order.size() - 1).setDate(today);
		
		System.out.println("들어오신 시간은 " + today + "입니다");
		System.out.println("총 금액은 " + order.get(order.size() - 1).getCharge() + "원입니다\n");
	}
	
	public void deleteBill() {
		Scanner s = new Scanner(System.in);
		int delete = 0;
		
		showList();
		System.out.print("=> 결제하실 번호를 입력하세요 ");
		delete = s.nextInt();
		
		if (delete > order.size())
			return;
		
		order.remove(delete - 1);
		
		System.out.println("=> 결제되었습니다\n");
	}
	
	public void showList() {
		System.out.println("번호\t손님수\t스테이크\t스파게티\t파스터\t멤버쉽\t결제금액\t입장시간");
		for (int i = 0; i < order.size(); i++) {
			System.out.printf("%d\t", i + 1);
			order.get(i).printOrder();
		}
		System.out.println();
	}
}
