import java.util.Scanner;

import Step_A.StepAManager;
import Step_B.StepBManager;
import Step_C.StepCManager;
public class WBManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("���ϴ� Step��? ");
		String step = s.next();
		if(step.equalsIgnoreCase("A")) 
			new StepAManager();
		if(step.equalsIgnoreCase("B"))
			new StepBManager();
		if(step.equalsIgnoreCase("C"))
			new StepCManager();
		System.out.printf("����Ǿ����ϴ�.\n");
	}	
}