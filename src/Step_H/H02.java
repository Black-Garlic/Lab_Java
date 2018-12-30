package Step_H;

import java.util.Random;
import java.util.Scanner;

public class H02 {
	private int lotto[] = new int[6];
	private int count;
	private String onemore;
	private int i;
	
	public H02() {
		onemore = "Y";
	}
	
	public void makeLotto() {
		Scanner s = new Scanner(System.in);
		
		
		while (onemore.equals("Y")) {
			generateLotto();
			printLotto();
			
			System.out.print("더 만드시겠습니까? (Y/N) ");
			onemore = s.nextLine();
		}
	}
	
	public void generateLotto() {
		Random generator = new Random();
		
		for (count = 0; count < 6; count++) {
			lotto[count] = generator.nextInt(45) + 1;
		}
	}
	
	public void printLotto() {
		System.out.print("생성된 로또 번호는 ");
		for (i = 0; i < 6; i++) {
			System.out.print(lotto[i] + "  ");
		}
		System.out.println("입니다");
	}
}
