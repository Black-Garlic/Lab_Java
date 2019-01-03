package Step_C;

import java.util.Scanner;

public class C07 {
	private int megabytes;
	private long bytes;
	private byte kind;
	private double time;
	
	public C07() {
		getBytes();
	}
	
	public void getBytes() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� �뷮�� �ް�����Ʈ ������ �Է��ϼ���. ");
		megabytes = s.nextInt();
		System.out.print("���۹���� 1: Wi-Fi, 2: BlueTooth, 3: LTE, 4: USB ���� �����Ͽ� �Է��ϼ��� ");
		kind = s.nextByte();
		
		bytes = megabytes * 1024 * 1024;
		
		s.close();
	}
	
	public double calculate() {
		switch(kind) {
		case 1:
			time = (double) bytes / 1500000;
			break;
		case 2:
			time = (double) bytes / 300000;
			break;
		case 3:
			time = (double) bytes / 1000000;
			break;
		case 4:
			time = (double) bytes / 60000000;
		default:
			time = 0;
			break;
		}
		return time;
	}
	
	public void printFileTime() {
		System.out.printf("���� ���� �ð��� %.1f�� �Դϴ�\n", calculate());
	}
}
