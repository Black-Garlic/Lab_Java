package Step_L;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class L02 {
	private SimpleDateFormat f = new SimpleDateFormat("YYYY년 MM월 DD일 hh시 mm분", Locale.KOREA);
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
			System.out.print("1) 입차 2) 출차 3) 리스트 4) 입차 총 개수 5) 주차 잔여 개수 6) 종료 => ");
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
				System.out.println("종료되었습니다");
				break;
			}
				
		}
	}
	
	public void makeList() {
		Scanner s = new Scanner(System.in);
		
		int number;
		
		System.out.print("주차할 수 있는 차의 개수를 입력하세요 ");
		number = s.nextInt();
		
		for (int i = 0; i < number; i++)
			car.add(new Car());
	}
	
	public void addCar() {
		for (int i = 0; i < car.size(); i++) {
			if (car.get(i).getValid() == false) {
				car.get(i).setCar(today);
				System.out.printf("[%d번] %s 입차되었습니다\n\n", i + 1, today);
				break;
			}
		}
		count++;
	}
	
	public void deleteCar() {
		Scanner s = new Scanner(System.in);
		int delete = 0;
		
		showList();
		System.out.print("=> 수정할 번호를 입력하세요 ");
		delete = s.nextInt();
		
		if (delete > count)
			return;
		
		int time = calTime(today, car.get(delete - 1).getDate());
		
		if (time <= 10) {
			System.out.println("=> 현재시간은 [" + today + "]이므로 주차금액은 무료입니다");
		} else {
			System.out.println("=> 현재시간은 [" + today + "]이므로 주차금액은 " + calCharge(time) + "입니다");
		}
		
		car.get(delete - 1).setFalse();
		count--;
		
		System.out.println("=> 정산되었습니다\n");
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
				System.out.printf("[%d번] ", i + 1);
				car.get(i).printCar();
			}
		}
		System.out.println();
	}
	
	public void numCar() {
		System.out.println("총 " + count + "대가 주차되어 있습니다\n");
	}
	
	public void emptyCar() {
		int empty = car.size() - count;
		System.out.println("주차 가능한 자리는 " + empty + "대 입니다\n");
	}
}
