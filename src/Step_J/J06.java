package Step_J;

public class J06 {
	public J06() { }
	
	public void printFibonacci() {
		System.out.println("1부터 20까지 피보나치 수는 다음과 같습니다");
		for(int i = 1; i <= 20; i++) {
			System.out.printf("%2d번째 : %d\n", i, fibonacci(i));
		}
	}
	
	public int fibonacci(int n) {
		if (n <= 1)
			return n;
		else
			return fibonacci(n - 2) + fibonacci(n - 1);
	}
}
