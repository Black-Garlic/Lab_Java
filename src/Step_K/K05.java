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
		System.out.println("등록된 학생 목록은 다음과 같습니다");
		System.out.println("------------------------");
		System.out.println("번호\t아이디\t비밀번호");
		user.print(index);
	}
}
