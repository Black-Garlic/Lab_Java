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
			System.out.print("1) �л���� 2) �������� 3) ���� 4) ����Ʈ 5) �̸��˻� 6) ���л�����Ʈ 7) �ּҰ˻� 8) ���� => ");
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
				System.out.println("����Ǿ����ϴ�");
				break;
			}
		}
	}
	
	public void addStu() {
		student.add(new Student());
		student.get(student.size() - 1).getInfo();
		
		System.out.println("�� " + student.size() + "���� ��ϵǾ����ϴ�\n");
	}
	
	public void editStu() {
		Scanner s = new Scanner(System.in);
		int edit = 0;
		
		showList();
		System.out.print("=> ������ ��ȣ�� �Է��ϼ��� ");
		edit = s.nextInt();

		if (edit > student.size() || edit < 1)
			return;
		
		student.get(edit - 1).getInfo();
		
		System.out.println("�����Ǿ����ϴ�\n");
	}
	
	public void deleteStu() {
		Scanner s = new Scanner(System.in);
		int delete = 0;
		String YN = "N";
		
		showList();
		System.out.print("=> ������ ��ȣ�� �Է��ϼ��� ");
		delete = s.nextInt();
		
		if (delete > student.size() || delete < 1)
			return;
		
		System.out.print("������ �����Ͻðڽ��ϱ�?(Y/N) ");
		YN = s.next();
		
		if (YN.equals("Y") || YN.equals("y")) {
			student.remove(delete - 1);
			System.out.println("�����Ǿ����ϴ�\n");
		}
	}
	
	public void showList() {
		System.out.println("��ȣ\t�̸�\t�й�\t\t����\t�ּ�\t��ȭ��ȣ\t\t���л�");
		for (int i = 0; i < student.size(); i++) {
			System.out.printf("%d\t", i + 1);
			student.get(i).printStudent();
		}
		System.out.println();
	}
	
	public void findName() {
		Scanner s = new Scanner(System.in);
		String name;
		
		System.out.print("�˻��Ͻ� �̸��� �Է��ϼ��� : ");
		name = s.nextLine();
		
		System.out.println("��ȣ\t�̸�\t�й�\t\t����\t�ּ�\t��ȭ��ȣ\t\t���л�");
		for (int i = 0; i < student.size(); i++) {
			if (student.get(i).getName().contains(name)) {
				System.out.printf("%d\t", i + 1);
				student.get(i).printStudent();
			}
		}
		System.out.println();
	}
	
	public void printReturn() {
		System.out.println("��ȣ\t�̸�\t�й�\t\t����\t�ּ�\t��ȭ��ȣ\t\t���л�");
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
		
		System.out.print("�˻��Ͻ� �ּҸ� �Է��ϼ��� : ");
		address = s.nextLine();
		
		System.out.println("��ȣ\t�̸�\t�й�\t\t����\t�ּ�\t��ȭ��ȣ\t\t���л�");
		for (int i = 0; i < student.size(); i++) {
			if (student.get(i).getAddress().contains(address)) {
				System.out.printf("%d\t", i + 1);
				student.get(i).printStudent();
			}
		}
		System.out.println();
	}
}
