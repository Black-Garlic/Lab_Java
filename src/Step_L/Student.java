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
		
		System.out.print("학생이름, 학번, 성별을 입력하세요 : ");
		name = s.next();
		stunum = s.next();
		MW = s.next();
		System.out.print("주소를 입력하세요 : ");
		address = s.nextLine();
		address = s.nextLine();
		System.out.print("전화번호를 입력하세요 : ");
		phone = s.next();
		System.out.print("복학생입니까?(Y/N) ");
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
