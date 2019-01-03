package Step_J;

public class J10 {
	public J10() { }
	
	public void printRatio() {
		double beforenum, presentnum = 3;
		int count = 2;
		
		while(true) {
			beforenum = presentnum;
			presentnum = (double) fibonacci(count + 1) / fibonacci(count);
			System.out.printf("%2d번째 비율 (%d / %d) : %f\n",
					count, fibonacci(count + 1), fibonacci(count), presentnum);
			if (beforenum > presentnum) {
				if (beforenum - presentnum <= 0.000001)
					break;
			} else if (beforenum < presentnum) {
				if (presentnum - beforenum <= 0.000001)
					break;
			}
			count++;
		}
	}
	
	public int fibonacci(int n) {
		if (n <= 1)
			return n;
		else
			return fibonacci(n - 2) + fibonacci(n - 1);
	}
}
