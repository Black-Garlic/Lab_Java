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
			System.out.print("=> 문자열을 입력하세요 (x: 종료) : ");
			input = s.nextLine();
			
			if (input.equals("x")) {
				System.out.println("* 종료되었습니다");
				break;
			} else {
				System.out.print("=> 찾을 문자열을 입력하세요 ");
				findStr = s.nextLine();
				
				System.out.print("=> 바꿀 문자열을 입력하세요 ");
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
		
		System.out.println("\n=> 총 " + count + "번 바뀌었습니다");
		System.out.println("=> " + input);
		System.out.println();
	}
}
