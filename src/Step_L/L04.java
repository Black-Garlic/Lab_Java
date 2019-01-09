package Step_L;

import java.util.ArrayList;
import java.util.Scanner;

public class L04 {
	private ArrayList<Student> student = new ArrayList<Student>();
	private int select;
	
	public L04() {	}
	
	public void getStudent() {
		Scanner s = new Scanner(System.in);
		
		select = 0;
		
		while(true) {
			System.out.println("--------------------------------------------------------");
			System.out.print("1) 학생등록 2) 정보수정 3) 삭제 4) 리스트 5) 이름검색 6) 복학생리스트 7) 주소검색 8) 종료 => ");
			select = s.nextInt();
			System.out.println("--------------------------------------------------------");
			
			if (select == 1)
				addStu();
			else if (select == 2)
				editStu();
			else if (select == 3)
				deleteStu();
			else if (select == 4)
				showList();
			else if (select == 5)
				findName();
			else if (select == 6)
				printReturn();
			else if (select == 7)
				findAddress();
			else if (select == 8) {
				System.out.println("종료되었습니다");
				break;
			}
		}
	}
	
	public void addStu() {
		student.add(new Student());
		student.get(student.size() - 1).getInfo();
		
		System.out.println("총 " + student.size() + "명이 등록되었습니다\n");
	}
	
	public void editStu() {
		Scanner s = new Scanner(System.in);
		int edit = 0;
		
		showList();
		System.out.print("=> 수정할 번호를 입력하세요 ");
		edit = s.nextInt();

		if (edit > student.size() || edit < 1)
			return;
		
		student.get(edit - 1).getInfo();
		
		System.out.println("수정되었습니다\n");
	}
	
	public void deleteStu() {
		Scanner s = new Scanner(System.in);
		int delete = 0;
		String YN = "N";
		
		showList();
		System.out.print("=> 삭제할 번호를 입력하세요 ");
		delete = s.nextInt();
		
		if (delete > student.size() || delete < 1)
			return;
		
		System.out.print("정말로 삭제하시겠습니까?(Y/N) ");
		YN = s.next();
		
		if (YN.equals("Y") || YN.equals("y")) {
			student.remove(delete - 1);
			System.out.println("삭제되었습니다\n");
		}
	}
	
	public void showList() {
		System.out.println("번호\t이름\t학번\t\t성별\t주소\t전화번호\t\t복학생");
		for (int i = 0; i < student.size(); i++) {
			System.out.printf("%d\t", i + 1);
			student.get(i).printStudent();
		}
		System.out.println();
	}
	
	public void findName() {
		Scanner s = new Scanner(System.in);
		String name;
		
		System.out.print("검색하실 이름을 입력하세요 : ");
		name = s.nextLine();
		
		System.out.println("번호\t이름\t학번\t\t성별\t주소\t전화번호\t\t복학생");
		for (int i = 0; i < student.size(); i++) {
			if (student.get(i).getName().contains(name)) {
				System.out.printf("%d\t", i + 1);
				student.get(i).printStudent();
			}
		}
		System.out.println();
	}
	
	public void printReturn() {
		System.out.println("번호\t이름\t학번\t\t성별\t주소\t전화번호\t\t복학생");
		for (int i = 0; i < student.size(); i++) {
			if (student.get(i).getReturnStu()) {
				System.out.printf("%d\t", i + 1);
				student.get(i).printStudent();
			}
		}
		System.out.println();
	}
	
	public void findAddress() {
		Scanner s = new Scanner(System.in);
		String address;
		
		System.out.print("검색하실 주소를 입력하세요 : ");
		address = s.nextLine();
		
		System.out.println("번호\t이름\t학번\t\t성별\t주소\t전화번호\t\t복학생");
		for (int i = 0; i < student.size(); i++) {
			if (student.get(i).getAddress().contains(address)) {
				System.out.printf("%d\t", i + 1);
				student.get(i).printStudent();
			}
		}
		System.out.println();
	}
}
