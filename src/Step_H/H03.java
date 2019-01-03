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
			System.out.printf("���ϴ� %d��° �ζ� ���ڸ� �Է��ϼ��� ", count + 1);
			lotto_user[count] = s.nextInt();
			
			if (!checkLotto()) {
				System.out.println("=> �߸� �Է��ϼ̽��ϴ�");
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
		System.out.print("\n�̹� ���� �ζ� ��÷ ��ȣ�� ");
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto_com[i] + "  ");
		}
		System.out.println("�Դϴ�\n");
		
		System.out.println("��ġ�ϴ� �ζ� ��ȣ�� " + match_count + "�� �Դϴ�");
	}
	
	public void matchLotto(int lottoNum) {
		for (int i = 0; i < 6; i++)
			if (lottoNum == lotto_com[i])
				match_count++;
	}
}
