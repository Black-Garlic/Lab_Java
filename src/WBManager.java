import java.util.Scanner;

import Step_A.StepAManager;
import Step_B.StepBManager;
import Step_C.StepCManager;
import Step_D.StepDManager;
import Step_E.StepEManager;
import Step_F.StepFManager;
public class WBManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("원하는 Step은? ");
		String step = s.next();
		if(step.equalsIgnoreCase("A")) 
			new StepAManager();
		if(step.equalsIgnoreCase("B"))
			new StepBManager();
		if(step.equalsIgnoreCase("C"))
			new StepCManager();
		if(step.equalsIgnoreCase("D"))
			new StepDManager();
		if(step.equalsIgnoreCase("E"))
			new StepEManager();
		if(step.equalsIgnoreCase("F"))
			new StepFManager();
		System.out.printf("종료되었습니다.\n");
	}	
}