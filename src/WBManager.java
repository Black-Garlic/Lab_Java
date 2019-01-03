import java.util.Scanner;

import Step_A.StepAManager;
import Step_B.StepBManager;
import Step_C.StepCManager;
import Step_D.StepDManager;
import Step_E.StepEManager;
import Step_F.StepFManager;
import Step_G.StepGManager;
import Step_H.StepHManager;
import Step_I.StepIManager;
import Step_J.StepJManager;
public class WBManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("원하는 Step은? ");
		String step = s.next();
		if(step.equalsIgnoreCase("A") || step.equalsIgnoreCase("ㅁ")) 
			new StepAManager();
		if(step.equalsIgnoreCase("B") || step.equalsIgnoreCase("ㅠ"))
			new StepBManager();
		if(step.equalsIgnoreCase("C") || step.equalsIgnoreCase("ㅊ"))
			new StepCManager();
		if(step.equalsIgnoreCase("D") || step.equalsIgnoreCase("ㅇ"))
			new StepDManager();
		if(step.equalsIgnoreCase("E") || step.equalsIgnoreCase("ㄷ"))
			new StepEManager();
		if(step.equalsIgnoreCase("F") || step.equalsIgnoreCase("ㄹ"))
			new StepFManager();
		if(step.equalsIgnoreCase("G") || step.equalsIgnoreCase("ㅎ"))
			new StepGManager();
		if(step.equalsIgnoreCase("H") || step.equalsIgnoreCase("ㅗ"))
			new StepHManager();
		if(step.equalsIgnoreCase("I") || step.equalsIgnoreCase("ㅑ"))
			new StepIManager();
		if(step.equalsIgnoreCase("J") || step.equalsIgnoreCase("ㅓ"))
			new StepJManager();
		System.out.printf("종료되었습니다.\n");
		
		s.close();
	}	
}