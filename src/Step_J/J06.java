package Step_J;

public class J06 {
	public J06() { }
	
	public void printFibonacci() {
		System.out.println("1���� 20���� �Ǻ���ġ ���� ������ �����ϴ�");
		for(int i = 1; i <= 20; i++) {
			System.out.printf("%2d��° : %d\n", i, fibonacci(i));
		}
	}
	
	public int fibonacci(int n) {
		if (n <= 1)
			return n;
		else
			return fibonacci(n - 2) + fibonacci(n - 1);
	}
}
