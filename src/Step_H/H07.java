package Step_H;

import java.util.Scanner;

public class H07 {
	private String input;

	public H07() {	}
	
	public void getString() {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("=========================");
			System.out.print("=> ���ڿ��� �Է��ϼ��� (x: ����) : ");
			input = s.nextLine();
			
			if (input.equals("x")) {
				System.out.println("* ����Ǿ����ϴ�");
				break;
			} else {
				printResult();
			}
		}
	}
	
	public void printResult() {
		System.out.println("=> �� ������ ������ " + input.length() + "�� �Դϴ�");
		for (int i = 0; i < input.length(); i++) {
			System.out.println("=> " + input.substring(i, i + 1));
		}
		System.out.println();
	}
}
