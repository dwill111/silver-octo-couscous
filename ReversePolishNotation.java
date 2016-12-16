import java.util.*;

public class ReversePolishNotation {
	private static Stack<Integer> stack = new Stack<Integer>();
	private static Scanner keyIn = new Scanner(System.in);
	
	public static void main(String[] args) {
		String input = " ";
		while (!input.equals("Stop")) {
			System.out.print("Enter number: ");
			input = keyIn.next();
			try {
				int whatever = Integer.valueOf(input);
				stack.push(whatever);
			} catch (Exception e) {
				if (input.equals("*")) {
					stack.push(stack.pop() * stack.pop());

				} else if (input.equals("/")) {
					stack.push((int) stack.pop() / stack.pop());

				} else if (input.equals("+")) {
					stack.push(stack.pop() + stack.pop());

				} else if (input.equals("-")) {
					stack.push(stack.pop() - stack.pop());

				} else if (input.equals("=")) {
					System.out.println(stack.pop());	
				}
			}
		}
	}
}