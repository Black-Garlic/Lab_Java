package Step_B;

import java.util.Scanner;

public class B07 {
	private int megabytes;
	private long bytes;
	private String usb2;
	private int time;
	
	public B07() {
		getBytes();
	}
	
	public void getBytes() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� �뷮�� �ް�����Ʈ ������ �Է��ϼ���. ");
		megabytes = s.nextInt();
		usb2 = s.nextLine();
		System.out.print("USB ��Ʈ�� 2.0�̸� Y, �ƴϸ� N�� �Է��ϼ��� ");
		usb2 = s.nextLine();
		
		bytes = megabytes * 1024 * 1024;
		
		s.close();
	}
	
	public int calculate() {
		if (usb2.equals("Y")) {
			time = (int) (bytes / 60000000);
		} else {
			time = (int) (bytes / 1500000);
		}
		return time;
	}
	
	public void printFileTime() {
		System.out.println("���� ���� �ð��� " + calculate() + "�� �Դϴ�");
	}
}
