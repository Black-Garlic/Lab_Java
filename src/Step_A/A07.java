package Step_A;

import java.util.Scanner;

public class A07 {
	private int gigabytes;
	private int megabytes;
	private int kilobytes;
	private long bytes;
	
	public A07() {
		this.gigabytes = 0;
		this.megabytes = 0;
		this.kilobytes = 0;
		this.bytes = 0;
	}
	
	public void problem() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� �뷮�� �Ⱑ����Ʈ ������ �Է��ϼ���. ");
		gigabytes = s.nextInt();
		
		megabytes = gigabytes * 1024;
		kilobytes = megabytes * 1024;
		bytes = kilobytes * 1024;
		
		System.out.println("�Է��Ͻ� ������ �뷮��");
		System.out.println(megabytes + " �ް�����Ʈ,");
		System.out.println(kilobytes + " ų�ι���Ʈ,");
		System.out.println(bytes + " ����Ʈ �Դϴ�.");
	}
}
