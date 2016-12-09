import java.util.*;

public class Recursion {

	public int recursion(int n) {
		if (n == 1) {
			return 0;
		} else if (n == 2) {
			return (1);
		} else
			return (n + recursion(n - 1)) - 1;
	}

	public static void main(String[] args) {
		Recursion show = new Recursion();
		Scanner keyIn = new Scanner(System.in);

		System.out.print("The number of people who shook hands: ");
		int number = keyIn.nextInt();

		System.out.println("The number of handshakes that took placed: " + show.recursion(number));

	}
}
