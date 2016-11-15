import static org.junit.Assert.*;
import org.junit.Test;


public class fibonacciDemoTest {
	@Test
	public void testRecursive() throws Exception {
		fibonacciDemo number = new fibonacciDemo();

		assertEquals(5, number.recursion(5));

		assertEquals(21, number.recursion(8));

		assertEquals(3, number.iteration(4));

		assertEquals(55, number.iteration(10));
		
	}
}
