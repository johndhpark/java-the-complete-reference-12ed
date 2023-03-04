// Demonstrate a simple lambda expression.

// A functional interface
interface MyNumber {
	double getValue();
}

class LambdaDemo {
	public static void main(String[] args) {
		MyNumber myNum; // declare an interface reference

		// Here, the lambda expression is simply a constant expression.
		// When it is assigned to myNum, a class instance is constructred in which the
		// lambda expression implements
		// the getValue() method in MyNumber.
		myNum = () -> 123.45;

		// Call getValue(), which is provided by the previously assigned lambda
		// expression.
		System.out.println("A fixed value: " + myNum.getValue());

		// Here, a more complexed expression is used.
		myNum = () -> Math.random() * 100;

		// 
	}
}