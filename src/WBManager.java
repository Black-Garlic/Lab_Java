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
import Step_K.StepKManager;
import Step_L.StepLManager;
import Step_M.StepMManager;
public class WBManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("���ϴ� Step��? ");
		String step = s.next();
		if(step.equalsIgnoreCase("A") || step.equalsIgnoreCase("��")) 
			new StepAManager();
		if(step.equalsIgnoreCase("B") || step.equalsIgnoreCase("��"))
			new StepBManager();
		if(step.equalsIgnoreCase("C") || step.equalsIgnoreCase("��"))
			new StepCManager();
		if(step.equalsIgnoreCase("D") || step.equalsIgnoreCase("��"))
			new StepDManager();
		if(step.equalsIgnoreCase("E") || step.equalsIgnoreCase("��"))
			new StepEManager();
		if(step.equalsIgnoreCase("F") || step.equalsIgnoreCase("��"))
			new StepFManager();
		if(step.equalsIgnoreCase("G") || step.equalsIgnoreCase("��"))
			new StepGManager();
		if(step.equalsIgnoreCase("H") || step.equalsIgnoreCase("��"))
			new StepHManager();
		if(step.equalsIgnoreCase("I") || step.equalsIgnoreCase("��"))
			new StepIManager();
		if(step.equalsIgnoreCase("J") || step.equalsIgnoreCase("��"))
			new StepJManager();
		if(step.equalsIgnoreCase("K") || step.equalsIgnoreCase("��"))
			new StepKManager();
		if(step.equalsIgnoreCase("L") || step.equalsIgnoreCase("��"))
			new StepLManager();
		if(step.equalsIgnoreCase("M") || step.equalsIgnoreCase("��"))
			new StepMManager();
		System.out.printf("����Ǿ����ϴ�.\n");
		
		s.close();
	}	
}