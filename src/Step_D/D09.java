package Step_D;

import java.util.Scanner;

public class D09 {
	private int dan;
	
	public D09() {
		getDan();
	}
	
	public void getDan() {
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.print("����ϰ� ���� �������� �ܼ��� �Է��ϼ��� (2 ~ 9) ");
			dan = s.nextInt();
			if (dan >= 2 && dan <= 9) {
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
			}
		}
	}
	
	public int calDan(int count) {
		return count * dan;
	}
	
	public void printDan() {
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + calDan(i)); 
		}
	}
}
