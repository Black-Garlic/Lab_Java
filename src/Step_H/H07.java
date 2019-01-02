package Step_H;

import java.util.Scanner;

public class H07 {
	private String input;

	public H07() {	}
	
	public void getString() {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("=========================");
			System.out.print("=> 문자열을 입력하세요 (x: 종료) : ");
			input = s.nextLine();
			
			if (input.equals("x")) {
				System.out.println("* 종료되었습니다");
				break;
			} else {
				printResult();
			}
		}
	}
	
	public void printResult() {
		System.out.println("=> 총 문자의 개수는 " + input.length() + "개 입니다");
		for (int i = 0; i < input.length(); i++) {
			System.out.println("=> " + input.substring(i, i + 1));
		}
		System.out.println();
	}
}
