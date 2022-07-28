class OverloadDemo {
	void test() {
		System.out.println("No parameters");
	}

	// Overload test for two integer parameters
	void test(int a, int b) {
		System.out.println("int a and b: " + a + " " + b);
	}

	// Overload test for two double parameters
	double test(double a) {
		System.out.println("double a: " + a);

		return a * a;
	}
}

class Overload2 {
	public static void main(String[] args) {
		OverloadDemo ob = new OverloadDemo();
		int i = 88;

		// call all versions of test()
		ob.test();
		ob.test(10, 20);

		ob.test(i); // this will invoke test (double)
		ob.test(123.2); // this will invoke test (double)
	}
}