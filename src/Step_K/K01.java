package Step_K;

public class K01 {
	private MenuPan menu = new MenuPan();
	public K01() {
		setMenu();
	}

	public void setMenu() {
		menu.getMenu();
	}
	
	public void showMenu() {
		System.out.println("===================================");
		System.out.println("메뉴번호\t메뉴이름12\t\t원산지\t1인분가격");
		menu.printMenu();
	}
}
