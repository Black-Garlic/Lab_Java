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
		
		System.out.print("파일 용량을 기가바이트 단위로 입력하세요. ");
		gigabytes = s.nextInt();
		
		megabytes = gigabytes * 1024;
		kilobytes = megabytes * 1024;
		bytes = kilobytes * 1024;
		
		System.out.println("입력하신 파일의 용량은");
		System.out.println(megabytes + " 메가바이트,");
		System.out.println(kilobytes + " 킬로바이트,");
		System.out.println(bytes + " 바이트 입니다.");
	}
}
