import java.util.Scanner;

public class BasicStepManager {
	public BasicStepManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. \n");
			printf("2. \n");
			printf("3. \n");
			printf("4. \n");
			printf("5. \n");
			printf("6. \n");
			printf("=>���ϴ� �޴���?(0:exit) : ");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				
				
				break;
			case 2:
				
				
				break;
			case 3:
				
				
				break;
			case 4:
				
				
				break;
			case 5:
				
				
				break;
			case 6:
				
				
				break;
			default:
				System.out.println("�ٽ� �Է����ּ���.");
				break;
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}
