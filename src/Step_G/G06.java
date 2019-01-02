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
		
		System.out.println("�� ������ ��ǰ�� �ֽ��ϴ�");
		System.out.println("1. �����尩 1����, 2. ���尩 6õ��, 3. ����尩 3õ��");
		
		while (true) {
			for (int i = 0; i < 3; i++) {
				System.out.printf("%d�� ��ǰ�� ��� �����ϽǷ���? ", i + 1);
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
		System.out.println("�Ǹ� �ݾ��� " + sale + "�� �Դϴ�");
	}
	
	public void printTotalCharge() {
		calTotalSale();
		System.out.println("���ݱ����� �� ���� �ݾ��� "+ total_sale + "�� �Դϴ�");
	}
}
