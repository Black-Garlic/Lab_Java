package Step_L;

import java.util.ArrayList;
import java.util.Scanner;

public class L01 {
	private int select;
	private ArrayList<Menu> menu = new ArrayList<Menu>();
	
	public L01() {
		saveMenu();
	}
	
	public void saveMenu() {
		Scanner s = new Scanner(System.in);
		
		select = 0;
		
		while(true) {
			System.out.println("-----------------------------------------------");
			System.out.print("1) 추가 2) 수정 3) 삭제 4) 리스트 5) 총개수 6) 종료 => ");
			select = s.nextInt();
			System.out.println("-----------------------------------------------");
			
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
			else if (select == 6) {
				System.out.println("종료되었습니다");
				break;
			}
		}
	}
	
	public void addMenu() {
		menu.add(new Menu());
		menu.get(menu.size() - 1).setMenu();
		
		System.out.println("입력되었습니다\n");
	}
	
	public void editMenu() {
		Scanner s = new Scanner(System.in);
		int edit = 0;
		
		showMenu();
		System.out.print("=> 수정할 번호를 입력하세요 ");
		edit = s.nextInt();
		
		if (edit > menu.size())
			return;
		
		menu.get(edit - 1).setMenu();
		System.out.println("수정되었습니다\n");
	}
	
	public void deleteMenu() {
		Scanner s = new Scanner(System.in);
		int delete = 0;
		
		showMenu();
		System.out.print("=> 수정할 번호를 입력하세요 ");
		delete = s.nextInt();
		
		if (delete > menu.size())
			return;
		
		menu.remove(delete - 1);
		System.out.println("삭제되었습니다\n");
	}
	
	public void showMenu() {
		System.out.println("메뉴번호\t메뉴이름\t\t원산지\t1인분가격");
		for (int i = 0; i < menu.size(); i++) {
			System.out.print(i + 1);
			menu.get(i).printMenu();
		}
		System.out.println();
	}
	
	public void numMenu() {
		System.out.println(menu.size() + "개의 메뉴가 등록되어 있습니다\n");
	}
}
