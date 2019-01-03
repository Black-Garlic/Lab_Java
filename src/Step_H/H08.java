package Step_H;

import java.util.Scanner;

public class H08 {
	private String input;
	private String findStr;
	private String replaceStr;
	
	public H08() {	}
	
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
				System.out.print("=> ã�� ���ڿ��� �Է��ϼ��� ");
				findStr = s.nextLine();
				
				System.out.print("=> �ٲ� ���ڿ��� �Է��ϼ��� ");
				replaceStr = s.nextLine();
		
				input = input.replace(findStr, replaceStr);
				
				printResult();
			}
		}
		s.close();
	}
	
	public void printResult() {
		int count = 0;
		
		for (int i = 0; i < input.length() - replaceStr.length() + 1; i++) {
			if (input.substring(i, i + replaceStr.length()).equals(replaceStr)) {
				count++;
			}
		}
		
		System.out.println("\n=> �� " + count + "�� �ٲ�����ϴ�");
		System.out.println("=> " + input);
		System.out.println();
	}
}
