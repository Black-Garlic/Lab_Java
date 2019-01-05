package Step_K;

import java.util.Scanner;

public class UserInfo {
	private String ID;
	private String password;
	
	public void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("학생의 아이디, 비밀번호를 입력하세요 => ");
		ID = s.next();
		password = s.next();
	}
	
	public void print(int index) {
		System.out.println(index + "\t" + ID + "\t" + password);
	}
}
