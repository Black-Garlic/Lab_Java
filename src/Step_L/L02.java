package Step_L;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class L02 {
	private SimpleDateFormat f = new SimpleDateFormat("YYYY�� MM�� DD�� hh�� mm��", Locale.KOREA);
	private String today = f.format(new Date());
	private ArrayList<Car> car = new ArrayList<Car>();
	private int select;
	private int count;
	
	public L02() {
		saveCar();
	}
	
	public void saveCar() {
		Scanner s = new Scanner(System.in);
		
		select = 0;
		count = 0;
		
		makeList();
		
		while(true) {
			System.out.println("--------------------------------------------------------");
			System.out.print("1) ���� 2) ���� 3) ����Ʈ 4) ���� �� ���� 5) ���� �ܿ� ���� 6) ���� => ");
			select = s.nextInt();
			System.out.println("--------------------------------------------------------");
			
			if (select == 1)
				addCar();
			else if (select == 2)
				deleteCar();
			else if (select == 3)
				showList();
			else if (select == 4)
				numCar();
			else if (select == 5)
				emptyCar();
			else if (select == 6) {
				System.out.println("����Ǿ����ϴ�");
				break;
			}
				
		}
	}
	
	public void makeList() {
		Scanner s = new Scanner(System.in);
		
		int number;
		
		System.out.print("������ �� �ִ� ���� ������ �Է��ϼ��� ");
		number = s.nextInt();
		
		for (int i = 0; i < number; i++)
			car.add(new Car());
	}
	
	public void addCar() {
		for (int i = 0; i < car.size(); i++) {
			if (car.get(i).getValid() == false) {
				car.get(i).setCar(today);
				System.out.printf("[%d��] %s �����Ǿ����ϴ�\n\n", i + 1, today);
				break;
			}
		}
		count++;
	}
	
	public void deleteCar() {
		Scanner s = new Scanner(System.in);
		int delete = 0;
		
		showList();
		System.out.print("=> ������ ��ȣ�� �Է��ϼ��� ");
		delete = s.nextInt();
		
		if (delete > count)
			return;
		
		int time = calTime(today, car.get(delete - 1).getDate());
		
		if (time <= 10) {
			System.out.println("=> ����ð��� [" + today + "]�̹Ƿ� �����ݾ��� �����Դϴ�");
		} else {
			System.out.println("=> ����ð��� [" + today + "]�̹Ƿ� �����ݾ��� " + calCharge(time) + "�Դϴ�");
		}
		
		car.get(delete - 1).setFalse();
		count--;
		
		System.out.println("=> ����Ǿ����ϴ�\n");
	}
	
	public int calTime(String now, String park) {
		int nowyear, nowmonth, nowday, nowhour, nowmin, nowtotalmin;
		int parkyear, parkmonth, parkday, parkhour, parkmin, parktotalmin;
		
		nowyear = Integer.parseInt(now.substring(0, 3));
		nowmonth = Integer.parseInt(now.substring(6, 7));
		nowday = Integer.parseInt(now.substring(10, 11));
		nowhour = Integer.parseInt(now.substring(14, 15));
		nowmin = Integer.parseInt(now.substring(18, 19));
		nowtotalmin = nowyear * 525600 + nowmonth * 43200 + nowday * 1440 + nowhour * 60 + nowmin;
		
		parkyear = Integer.parseInt(now.substring(0, 3));
		parkmonth = Integer.parseInt(now.substring(6, 7));
		parkday = Integer.parseInt(now.substring(10, 11));
		parkhour = Integer.parseInt(now.substring(14, 15));
		parkmin = Integer.parseInt(now.substring(18, 19));
		parktotalmin = parkyear * 525600 + parkmonth * 43200 + parkday * 1440 + parkhour * 60 + parkmin;
		
		return nowtotalmin - parktotalmin;
	}
	
	public int calCharge(int time) {
		return (time - 10) / 10 * 500;
	}
	
	public void showList() {
		for (int i = 0; i < car.size(); i++) {
			if (car.get(i).getValid() == true) {
				System.out.printf("[%d��] ", i + 1);
				car.get(i).printCar();
			}
		}
		System.out.println();
	}
	
	public void numCar() {
		System.out.println("�� " + count + "�밡 �����Ǿ� �ֽ��ϴ�\n");
	}
	
	public void emptyCar() {
		int empty = car.size() - count;
		System.out.println("���� ������ �ڸ��� " + empty + "�� �Դϴ�\n");
	}
}
