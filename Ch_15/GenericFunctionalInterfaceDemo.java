// Use generic functional interface with lambda expressions.

// A generic functional interface.
interface SomeFunc<T> {
	T func(T t);
}

/**
 * GenericFunctionalInterfaceDemo
 */
public class GenericFunctionalInterfaceDemo {
	public static void main(String[] args) {

		// Use a String-based version of SomeFunc
		SomeFunc<String> reverse = (str) -> {
			String result = "";

			for (int i = str.length() - 1; i >= 0; --i) {
				result += str.charAt(i);
			}

			return result;
		};

		System.out.println("Lambda reversed is " + reverse.func("Lambda"));
		System.out.println("Expression reversed is " + reverse.func("Expression"));

		// Now, use an Integer-based version of SomeFunc.
		SomeFunc<Integer> factorial = n -> {
			int result = 1;

			for (int i = 1; i <= n; ++i) {
				result *= result;
			}

			return result;
		};

		System.out.println("The factorial of 3 is " + factorial.func(3));
		System.out.println("The factorial of 5 is " + factorial.func(5));
	}

}