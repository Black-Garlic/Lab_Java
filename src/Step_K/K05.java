package Step_K;

public class K05 {
	private int index;
	private UserInfo user = new UserInfo();
	
	public K05() {
		this.index = 0;
		setUser();
	}
	
	public void setUser() {
		user.input();
		index++;
	}
	
	public void printUser() {
		System.out.println("========================");
		System.out.println("��ϵ� �л� ����� ������ �����ϴ�");
		System.out.println("------------------------");
		System.out.println("��ȣ\t���̵�\t��й�ȣ");
		user.print(index);
	}
}
