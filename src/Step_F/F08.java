package Step_F;

import java.util.Scanner;

public class F08 {
	private int number[] = new int[10];
	private int newnum;
	private int count;
	
	public F08() {
		getNum();
	}
	
	public void getNum() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("1���� 100 ������ ���ڸ� �Է��ϼ���");
		
		count = 0;
		
		while(count < 10) {
			System.out.printf("%d��° ���ڸ� �Է��ϼ��� ", count + 1);
			newnum = s.nextInt();
			
			if (newnum < 0 || newnum > 100) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���");
			} else if (!checkDup(newnum)) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���");
			} else {
				number[count] = newnum;
				count++;
			}
		}
		s.close();
	}
	
	public boolean checkDup(int num) {
		for (int i = 0; i < count ; i++) {
			if (number[i] == num) return false;
		}
		return true;
	}
	
	public void printNum() {
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d��° ���ڴ� %d�Դϴ�\n", i + 1, number[i]);
		}
	}
}
