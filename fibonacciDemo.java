import java.util.Scanner;

public class fibonacciDemo {
	private int n;

	public int iteration(int n) {
		this.n = n;
		int x = 1;
		int y = 1;
		int z = 0;
		if(n == 1 || n == 2){
			return 1;
		}
		
		for (int i = 2; i < n; i++) {
			z = x + y;
			x = y;
			y = z;
		} 
		return z;
	}

	public int recursion(int n) {
		this.n = n;

		if (n == 1 || n == 2) {
			return 1;
		} else {
			return recursion(n - 1) + recursion(n - 2);
		}
	}

	public static void main(String[] args) {
		Scanner keyIn = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = keyIn.nextInt();

		fibonacciDemo number1 = new fibonacciDemo();
		fibonacciDemo number2 = new fibonacciDemo();

		number1.iteration(number);
		number2.recursion(number);

		System.out.println("fib using iteration: " + number1.iteration(number));
		System.out.println("fib using recursion: " + number2.recursion(number));
	}
}
