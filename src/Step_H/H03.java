package Step_H;

import java.util.Random;
import java.util.Scanner;

public class H03 {
	private int lotto_com[] = new int[6];
	private int lotto_user[] = new int[6];
	private int count;
	private int match_count;
	
	public H03() {
		generateLotto();
	}
	
	public void makeLotto() {
		Scanner s = new Scanner(System.in);
		
		count = 0;
		
		while (count < 6) {
			System.out.printf("원하는 %d번째 로또 숫자를 입력하세요 ", count + 1);
			lotto_user[count] = s.nextInt();
			
			if (!checkLotto()) {
				System.out.println("=> 잘못 입력하셨습니다");
			} else {
				count++;
			}
		}
		printLotto();
		s.close();
	}
	
	public void generateLotto() {
		Random generator = new Random();
		
		for (count = 0; count < 6; count++) {
			lotto_com[count] = generator.nextInt(45) + 1;
		}
	}
	
	public boolean checkLotto() {
		if (lotto_user[count] < 1 || lotto_user[count] > 45) return false;
		
		for (int i = 0; i < count; i++) {
			if (lotto_user[i] == lotto_user[count]) return false;
		}
		matchLotto(lotto_user[count]);
		return true;
	}
	
	public void printLotto() {
		System.out.print("\n이번 주의 로또 당첨 번호는 ");
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto_com[i] + "  ");
		}
		System.out.println("입니다\n");
		
		System.out.println("일치하는 로또 번호는 " + match_count + "개 입니다");
	}
	
	public void matchLotto(int lottoNum) {
		for (int i = 0; i < 6; i++)
			if (lottoNum == lotto_com[i])
				match_count++;
	}
}
