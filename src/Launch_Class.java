import java.util.Scanner;

import Step_A.*;

public class Launch_Class {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("실행할 문제를 말해주세요. ");
			count = s.nextInt();
			switch(count) {
			case 1 :
				A01 a01 = new A01();
				a01.problem();
				break;
			case 2 :
				A02 a02 = new A02();
				a02.problem();
				break;
			case 3 :
				A03 a03 = new A03();
				a03.problem();
				break;
			case 4 :
				A04 a04 = new A04();
				a04.problem();
				break;
			case 5 :
				A05 a05 = new A05();
				a05.problem();
				break;
			case 6 :
				A06 a06 = new A06();
				a06.problem();
				break;
			case 7 :
				A07 a07 = new A07();
				a07.problem();
				break;
			default :
				System.out.println("다시 입력해주세요");
				break;
			}
		}
		
		
	}

}
