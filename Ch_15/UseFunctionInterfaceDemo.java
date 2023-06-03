
// Use the Function built-in functional interfaces.

// Import the Function interface.
import java.util.function.Function;

/**
 * UseFunctionInterfaceDemo
 */
public class UseFunctionInterfaceDemo {

	public static void main(String[] args) {

		// This block lambda computes the factorial of an int value.
		// This time, Function is the functional interface.
		Function<Integer, Integer> factorial = n -> {
			int result = 1;

			for (int i = 1; i <= n; ++i) {
				result *= i;
			}

			return result;
		};

		System.out.println("The factorial of 3 is " + factorial.apply(3));
		System.out.println("The factorial of 5 is " + factorial.apply(5));
	}
}