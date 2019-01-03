package Step_G;

import java.util.Scanner;

public class G07 {
	private int team_count;
	private int charge[] = {5000, 10000, 15000, 3000};
	private int count[] = new int[4];
	private int v_count[] = {0, 0, 0, 0};
	private int total_count = 0;
	private int sum;
	private int total_sum = 0;
	private int membership = 0;
	
	public G07() { }
	
	public void getTeam() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� �湮�� �� ���� �Է��ϼ��� ");
		team_count = s.nextInt();
		
		for (int i = 0; i < team_count; i++) {
			System.out.printf("%d���� �ο���(�ʵ��л�, û�ҳ�, �Ϲ�, ��δ��)�� �Է��ϼ��� ", i + 1);
			
			for (int j = 0; j < 4; j++) {
				count[j] = s.nextInt();
			}
			
			System.out.printf("%d���� ����ī�� ����(ī����� : 0, �Ϲݵ�� : 1, VIP��� : 2)�� �Է��ϼ��� ", i + 1);
			membership = s.nextInt();
			
			calSale();
			printSale(i);
		}
		printTotalSale();
		s.close();
	}
	
	public void calSale() {
		sum = 0;
		for (int j = 0; j < 4; j++) {
			v_count[j] += count[j];
			total_count += count[j];
			
			switch(membership) {
			case 0:
				sum += count[j] * charge[j];
				break;
			case 1:
				sum += count[j] * charge[j] * 0.9;
				break;
			case 2:
				sum += count[j] * charge[j] * 0.8;
				break;
			default :
				break;
			}
		}
		total_sum += sum;
	}
	
	public void printSale(int index) {
		System.out.printf("%d���� ������ %d�� �Դϴ�\n\n", index + 1, sum);
	}
	
	public void printTotalSale() {
		System.out.println("���� �� �湮�� ���� " + total_count + "�� �Դϴ�");
		System.out.println("�ʵ��л� ���� " + v_count[0] + "�� �Դϴ�");
		System.out.println("û�ҳ� ���� " + v_count[1] + "�� �Դϴ�");
		System.out.println("�Ϲ��� ���� " + v_count[2] + "�� �Դϴ�");
		System.out.println("��δ�� ���� " + v_count[3] + "�� �Դϴ�");
		System.out.println("�� ������ " + total_sum + "�� �Դϴ�");
	}
}
