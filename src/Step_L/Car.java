package Step_L;

import java.util.Scanner;

public class Car {
	private boolean valid = false;
	private int number;
	private String name;
	private String date;
	
	public void setCar(String date) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("=> ������ ���� ��ȣ�� ������ �Է��ϼ��� ");
		number = s.nextInt();
		name = s.next();
		this.date = date;
		valid = true;
	}
	
	public void printCar() {
		System.out.println(number + " " + name + " " + date);
	}
	
	public String getDate() {
		return date;
	}
	
	public boolean getValid() {
		return valid;
	}
	
	public void setFalse() {
		valid = false;
	}
}
