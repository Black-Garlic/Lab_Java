package Step_K;

import java.util.ArrayList;
import java.util.Scanner;

public class K02 {
	private int number;
	private ArrayList<MenuPan> menu = new ArrayList<MenuPan>();
	
	public K02() {
		setMenu();
	}

	public void setMenu() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("����Ͻ� �޴��� ������ �Է��ϼ��� ");
		number = s.nextInt();
		
		for (int i = 0; i < number; i++) {
			menu.add(new MenuPan());
			menu.get(i).getMenu();	
		}
	}
	
	public void showMenu() {
		System.out.println("===================================");
		System.out.println("�޴���ȣ\t�޴��̸�12\t\t������\t1�κа���");
		for (int i = 0; i < number; i++)
			menu.get(i).printMenu();
	}
}
