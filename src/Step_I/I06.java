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
			System.out.println("������ ������ ���ڴ� " + number[i] + "�Դϴ�");
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
		System.out.println("1. �� (70 �̻�) : " + size[0] + "ȸ ����");
		System.out.println("2. �� (40 �̻�) : " + size[1] + "ȸ ����");
		System.out.println("3. �� (40 �̸�) : " + size[2] + "ȸ ����");
	}
}
