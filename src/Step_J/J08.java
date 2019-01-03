package Step_J;

public class J08 {
	public J08() { }
	
	public void printAckermann() {
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				System.out.println("Ackermann(" + i + ", " + j + ") = " + ackermann(i, j));
			}
		}
	}
	
	public int ackermann(int i, int j) {
		if (i == 0)
			return j + 1;
		else if (j == 0)
			return ackermann(i - 1, 1);
		else
			return ackermann(i - 1, ackermann(i, j - 1));
	}
}
