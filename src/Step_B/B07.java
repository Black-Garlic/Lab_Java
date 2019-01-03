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
		
		System.out.print("파일 용량을 메가바이트 단위로 입력하세요. ");
		megabytes = s.nextInt();
		usb2 = s.nextLine();
		System.out.print("USB 포트가 2.0이면 Y, 아니면 N을 입력하세요 ");
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
		System.out.println("파일 전송 시간은 " + calculate() + "초 입니다");
	}
}
