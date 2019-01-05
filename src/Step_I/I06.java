package Step_I;

import java.util.Random;
import java.util.Scanner;

public class I06 {
	private byte number[] = new byte[10];
	private int size[] = {0, 0, 0};
	
	public I06() {	}
	
	public void generateNum() {
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			number[i] = getRandom();
			System.out.println("생성된 임의의 숫자는 " + number[i] + "입니다");
			if (number[i] >= 70) {
				size[0]++;
			} else if (number[i] < 70 && number[i] >= 40) {
				size[1]++;
			} else {
				size[2]++;
			}
		}
		printResult();
	}
	
	public byte getRandom() {
		Random generator = new Random();
		byte number;
		
		number = (byte) (generator.nextInt(100) + 1);
		return number;
	}
	
	public void printResult() {
		System.out.println();
		System.out.println("1. 대 (70 이상) : " + size[0] + "회 생성");
		System.out.println("2. 중 (40 이상) : " + size[1] + "회 생성");
		System.out.println("3. 소 (40 미만) : " + size[2] + "회 생성");
	}
}
