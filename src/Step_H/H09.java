package Step_H;

import java.util.Scanner;

public class H09 {
	private String input;
	private String userList[] = new String[100];
	private String userInfo[] = new String[100];
	private int count;
	
	public H09() {	}
	
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
				splitUser();
				printResult();
			}
		}
	}
	
	public void splitUser() {
		String splitStr[] =  input.split("###");
		int index;
		count = 0;
		
		for (int i = 0; i < splitStr.length; i++) {
			index = splitStr[i].indexOf("|");
			
			userList[i] = splitStr[i].substring(0, index);
			userInfo[i] = splitStr[i].substring(index + 1, splitStr[i].length());
			
			count++;
		}
	}
	
	public void printResult() {
		System.out.println("\n=> �� " + count + "���� ��ϵǾ����ϴ�");
		for (int i = 1; i <= count; i++) {
			System.out.println(i + " " + userList[i -1] + " " + userInfo[i - 1]);
		}
		System.out.println();
	}
}
