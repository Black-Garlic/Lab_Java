package Step_G;

import java.util.Scanner;

public class G04 {
	private int kind;
	private int money;
	private int charge;
	private int total_charge;
	
	public G04() { }
	
	public void getCharge() {
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.print("�ε��� �ŷ�����(1: �Ÿ�, 2: �Ӵ�, 0: �������)�� �Է��ϼ��� ");
			kind = s.nextInt();

			if (kind == 0) break;
			
			System.out.print("�ε��� �ŷ��ݾ�(��)�� �Է��ϼ��� ");
			money = s.nextInt();
			
			if (kind == 1) {
				sell();
				System.out.println("�̿� ���� �߰� ������� " + charge + "�Դϴ�");
			}
			else if (kind == 2) {
				lent();
				System.out.println("�̿� ���� �߰� ������� " + charge + "�Դϴ�");
			}
		}
		printCharge();
		s.close();
	}
	
	public void sell() {
		if (money < 50000000) {
			if (money * 0.006 > 250000) {
				charge = 250000;
			} else {
				charge = (int) (money * 0.006);
			}
		} else if (money < 200000000 && money >= 50000000) {
			if (money * 0.005 > 800000) {
				charge = 800000;
			} else {
				charge = (int) (money * 0.005);
			}
		} else {
			charge = (int) (money * 0.004);
		}
		total_charge += charge;
	}
	
	public void lent() {
		if (money < 20000000) {
			if (money * 0.005 > 70000) {
				charge = 70000;
			} else {
				charge = (int) (money * 0.005);
			}
		} else if (money < 50000000 && money >= 20000000) {
			if (money * 0.005 > 200000) {
				charge = 200000;
			} else {
				charge = (int) (money * 0.005);
			}
		} else if (money < 100000000 && money >= 50000000) {
			if (money * 0.004 > 300000) {
				charge = 300000;
			} else {
				charge = (int) (money * 0.004);
			}
		}
		else {
			charge = (int) (money * 0.003);
		}
		total_charge += charge;
	}
	
	public void printCharge() {
		System.out.println("���ݱ����� ������ �Ѿ��� " + total_charge + "�� �Դϴ�");
	}
}
