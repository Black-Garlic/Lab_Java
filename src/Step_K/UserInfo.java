package Step_K;

import java.util.Scanner;

public class UserInfo {
	private String ID;
	private String password;
	
	public void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("�л��� ���̵�, ��й�ȣ�� �Է��ϼ��� => ");
		ID = s.next();
		password = s.next();
	}
	
	public void print(int index) {
		System.out.println(index + "\t" + ID + "\t" + password);
	}
}
