// Autoboxing / unboxing takes place with method parameters and return values
class AutoBox2 {
	// Take an Integer parameter and return an int value
	static int m(Integer v) {
		return v; // auto-unbox to in
	}

	public static void main(String[] args) {
		// Pass an int to m() and asign the return value
		// to an Integer. Here, the argument 100 is autoboxed into an Integer.
		// The return value is also autoboxed into an Integer.
		Integer intOb = m(100);

		System.out.println(intOb);
	}
}