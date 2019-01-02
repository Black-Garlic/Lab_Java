package Step_G;

import java.util.Scanner;

public class G06 {
	private int order[] = {0, 0, 0};
	private int sale;
	private int total_sale;
	private int total_order[] = {0, 0, 0};
	private int price[] = {10000, 6000, 3000};
	
	public G06() { }
	
	public void getSale() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("세 종류의 제품이 있습니다");
		System.out.println("1. 가죽장갑 1만원, 2. 털장갑 6천원, 3. 비닐장갑 3천원");
		
		while (true) {
			for (int i = 0; i < 3; i++) {
				System.out.printf("%d번 제품은 몇개를 구입하실래요? ", i + 1);
				order[i] = s.nextInt();
			}

			if (order[0] == 0 && order[1] == 0 && order[2] == 0) break;
			
			for (int i = 0; i < 3; i++) {
				total_order[i] += order[i];
			}
			
			calSale();
			printCharge();
		}
		printTotalCharge();
	}
	
	public void calSale() {
		sale = 0;
		for (int i = 0; i < 3; i++) {
			sale += order[i] * price[i];
		}
	}
	
	public void calTotalSale() {
		total_sale = 0;
		for (int i = 0; i < 3; i++) {
			total_sale += total_order[i] * price[i];
		}
	}
	
	public void printCharge() {
		System.out.println("판매 금액은 " + sale + "원 입니다");
	}
	
	public void printTotalCharge() {
		calTotalSale();
		System.out.println("지금까지의 총 매출 금액은 "+ total_sale + "원 입니다");
	}
}
