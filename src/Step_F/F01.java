package Step_F;

import java.util.Scanner;

public class F01 {
	private int num[] = new int[10];
	private int first;
	private int second;
	private int second_max_index;
	
	public F01() {
		getNum();
	}
	
	public void getNum() {
		Scanner s = new Scanner(System.in);
		
		for (int i = 0 ; i < 10; i++) {
			System.out.printf("%d번째 수를 입력하세요 ", i + 1);
			num[i] = s.nextInt();
			findSecond(i);
		}
		s.close();
	}
	
	public void findSecond(int index) {
		if (index == 0) {
			first = num[index];
			return;
		} else if (index == 1){
			if (num[index] > first) {
				second = first;
				second_max_index = 0;
				first = num[index];
			} else {
				second = num[index];
				second_max_index = 1;
			}
		} else {
			if (num[index] > first) {
				second = first;
				second_max_index = findIndex(first, index);
				first = num[index];
			} else if (num[index] < first && num[index] > second){
				second = num[index];
				second_max_index = index;
			}
		}
		
	}
	
	public int findIndex(int number, int index) {
		for (int j = 0; j < index; j++) {
			if (num[j] == number) return j;
		}
		return index;
	}
	
	public void printNum() {
		System.out.printf("두 번쨰로 큰 수는 %d번째 수 %d입니다.\n", second_max_index + 1, second);
	}
}
