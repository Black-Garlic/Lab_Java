package Step_K;

import java.util.Scanner;

public class K06 {
	private int number;
	private UserInfo user[] = new UserInfo[10];
	
	public K06() {
		setUser();
	}
	
	public void setUser() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("등록할 학생의 숫자는? ");
		number = s.nextInt();
		
		for (int i = 0; i < number; i++) {
			user[i] = new UserInfo();
			System.out.printf("%d번 ", i + 1);
			user[i].input();
		}
	}
	
	public void printUser() {
		System.out.println("========================");
		System.out.println("등록된 " + number + "명의 학생 목록은 다음과 같습니다");
		System.out.println("------------------------");
		System.out.println("번호\t아이디\t비밀번호");
		for (int i = 0; i < number; i++) {
			user[i].print(i + 1);
		}
	}
}
