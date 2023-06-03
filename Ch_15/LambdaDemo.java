// Demonstrate a simple lambda expression.

// A functional interface.
interface MyNumber {
	double getValue();
}

class LambdaDemo {
	public static void main(String[] args) {
		MyNumber myNum; // delcare an interface reference

		// Here, the lambda expression is simply a constant expression.
		// When it is assigned to myNum, a class instance is
		// constructed in which the lambda expression implements the getValue() method in MyNumber
		myNum = () -> 123.45;

		// Call getValue(), which is providedd by the previously assigned
		// lambda expression.
		System.out.println("A fixed value: " myNum.getValue());

		// Here, a more complex expression is used.
		myNum = () -> Math.random() * 100;

		// These call the lambda expression in the previous value.
		System.out.println("A random value: " + myNumber.getValue());
		System.out.println("Another random value: " + myNumber.getValue());

		// A lambda expression must be compatible with the method
		// defined by the functional interface. Therefore, this wont work:
		// myNum = () -> "123.03"; // Error!
	}

}