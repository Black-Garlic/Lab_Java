package Step_H;

import java.util.Random;
import java.util.Scanner;

public class H05 {
	private int coins;
	private int number[] = new int[3];
	private int dummy;
	
	public H05() {
		getCoins();
	}
	
	public void getCoins() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("����Ͻ� ������ ������ �Է��ϼ��� ");
		coins = s.nextInt();
		s.close();
	}
	
	public void playSlotmachine() {
		Scanner s = new Scanner(System.in);
		
		int count = 1;
		
		while (coins != 0) {
			System.out.print("���� " + count + "ȸ Start!! (�ƹ� ���ڳ� �Է��ϼ���) ");
			dummy = s.nextInt();
			coins--;
			
			generateSlot();
			switch(checkSlot()) {
			case 3:
				System.out.println("���� 3�� ��ġ... ���� 4�� �߰�");
				coins += 4;
				break;
			case 2:
				System.out.println("���� 2�� ��ġ... ���� 2�� �߰�");
				coins += 2;
				break;
			case 1:
				System.out.println("���Դϴ�... �ƽ�����");
				break;
			}
			System.out.println("�����ִ� ������ " + coins + "�� �Դϴ�");
		}
		printEnd();
		s.close();
	}
	
	public void generateSlot() {
		Random generator = new Random();
		
		System.out.print("���� ��� : ");
		
		for (int i = 0; i < 3; i++) {
			number[i] = generator.nextInt(9) + 1;
			System.out.print(number[i] + " ");
		}
		
		System.out.print("----> ");
	}
	
	public int checkSlot() {
		if (number[0] == number[1] && number[0] == number[2]) {
			return 3;
		} else if (number[0] == number[1] ||
				number[1] == number[2] ||
				number[2] == number[0]) {
			return 2;
		} else {
			return 1;
		}
	}
	
	public void printEnd() {
		System.out.println("\n���� ����!!");
	}
}
