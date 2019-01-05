package Step_J;

import java.util.Scanner;

public class J05 {
	private int count;
	private int total_charge;
	
	public J05() { }
	
	public void getTime() {
		Scanner s = new Scanner(System.in);
		
		count = 1;
		total_charge = 0;
		char YN = 'N';
		int start_h, start_m;
		int end_h, end_m;
		int charge;
		
		while(true) {
			System.out.print(count + "번 차량 주차 시작 시각 (시 분) : ");
			start_h = s.nextInt();
			start_m = s.nextInt();
			
			System.out.print(count + "번 차량 주차 종료 시각 (시 분) : ");
			end_h = s.nextInt();
			end_m = s.nextInt();
			
			charge = calcParking(start_h, start_m, end_h, end_m);
			total_charge += charge;
			
			System.out.println("주차요금 : " + charge + "원");
			
			System.out.print("더 입력하시겠습니까? (Y/N) ");
			YN = s.next().charAt(0);
			
			if (YN == 'N' || YN == 'n')
				break;
			
			count++;
		}
		printTotalCharge();
	}
	
	public int calcParking(int start_h, int start_m, int end_h, int end_m) {
		int start_total = start_h * 60 + start_m;
		int end_total = end_h * 60 + end_m;
		
		int parking_time = end_total - start_total;
		
		if (parking_time % 10 == 0) {
			return parking_time / 10 * 500;
		} else {
			return (parking_time / 10 + 1) * 500;
		}
	}
	
	public void printTotalCharge() {
		System.out.println("주차차량 " + count + "대의 총 주차 요금은 " + total_charge + "원 입니다");
	}
}
