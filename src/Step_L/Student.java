package Step_L;

import java.util.Scanner;

public class Student {
	private String name;
	private String stunum;
	private String MW;
	private String address;
	private String phone;
	private String returnstu;
	
	public void getInfo() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("�л��̸�, �й�, ������ �Է��ϼ��� : ");
		name = s.next();
		stunum = s.next();
		MW = s.next();
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		address = s.nextLine();
		address = s.nextLine();
		System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
		phone = s.next();
		System.out.print("���л��Դϱ�?(Y/N) ");
		returnstu = s.next();
	}
	
	public void printStudent() {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n",
				name, stunum, MW, address, phone, returnstu);
	}
	
	public String getName() {
		return name;
	}
	
	public boolean getReturnStu() {
		if (returnstu.equals("Y") || returnstu.equals("y"))
			return true;
		else
			return false;
	}
	
	public String getAddress() {
		return address;
	}
}
