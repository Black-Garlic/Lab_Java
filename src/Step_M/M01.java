package Step_M;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Step_L.Menu;

public class M01 {
	private int select;
	private ArrayList<Menu> menu = new ArrayList<Menu>();
	
	public M01() {	}
	
	public void saveMenu() {
		Scanner s = new Scanner(System.in);
		
		select = 0;
		
		while(true) {
			System.out.println("-------------------------------------------------------");
			System.out.print("1) �߰� 2) ���� 3) ���� 4) ����Ʈ 5) �Ѱ��� 6) txt�� ���� 7)���� => ");
			select = s.nextInt();
			System.out.println("-------------------------------------------------------");
			
			if (select == 1)
				addMenu();
			else if (select == 2)
				editMenu();
			else if (select == 3)
				deleteMenu();
			else if (select == 4)
				showMenu();
			else if (select == 5)
				numMenu();
			else if (select == 6)
				saveTxt();
			else if (select == 7) {
				System.out.println("����Ǿ����ϴ�");
				break;
			}
		}
	}
	
	public void addMenu() {
		menu.add(new Menu());
		menu.get(menu.size() - 1).setMenu();
		
		System.out.println("�ԷµǾ����ϴ�\n");
	}
	
	public void editMenu() {
		Scanner s = new Scanner(System.in);
		int edit = 0;
		
		showMenu();
		System.out.print("=> ������ ��ȣ�� �Է��ϼ��� ");
		edit = s.nextInt();
		
		if (edit > menu.size())
			return;
		
		menu.get(edit - 1).setMenu();
		System.out.println("�����Ǿ����ϴ�\n");
	}
	
	public void deleteMenu() {
		Scanner s = new Scanner(System.in);
		int delete = 0;
		
		showMenu();
		System.out.print("=> ������ ��ȣ�� �Է��ϼ��� ");
		delete = s.nextInt();
		
		if (delete > menu.size())
			return;
		
		menu.remove(delete - 1);
		System.out.println("�����Ǿ����ϴ�\n");
	}
	
	public void showMenu() {
		System.out.println("�޴���ȣ\t�޴��̸�\t\t������\t1�κа���");
		for (int i = 0; i < menu.size(); i++) {
			System.out.print(i + 1);
			menu.get(i).printMenu();
		}
		System.out.println();
	}
	
	public void numMenu() {
		System.out.println(menu.size() + "���� �޴��� ��ϵǾ� �ֽ��ϴ�\n");
	}
	
	public void saveTxt() {
		File file = new File("menu.txt");
        FileWriter writer = null;
        
        try {
            writer = new FileWriter(file, false);
            writer.write("�޴���ȣ\t�޴��̸�\t\t������\t1�κа���\r\n");
            for (int i = 0; i < menu.size(); i++) {
            	writer.write(String.valueOf(i + 1));
            	writer.write(menu.get(i).getMenu());
    		}
            
            System.out.println("menu.txt���Ϸ� ���� �Ϸ��߽��ϴ�");
            writer.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
	}
}
