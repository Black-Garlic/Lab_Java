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
		System.out.println("�޴���ȣ\t�޴��̸�12\t\t������\t1�κа���");
		menu.printMenu();
	}
}
