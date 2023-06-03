// Demonstrate a raw type
class Gen<T> {
	T ob; // declare an object of type T

	Gen(T o) {
		ob = o;
	}

	T getOb() {
		return ob;
	}
}

// Demonstrate a raw type
class RawDemo {
	public static void main(String[] args) {
		// Create a Gen object for Integers
		Gen<Integer> iOb = new Gen<Integer>(88);

		// Create a Gen object for Strings.
		Gen<String> strOb = new Gen<String>("Generics Test");

		// Create a raw-type Gen object and give it a Double value.
		Gen raw = new Gen(Double.valueOf(98.6));

		// Case here is necessary because type is unknown
		double d = (Double) raw.getOb();
		System.out.println("value: " + d);

		// The use of raw type can lead to a run-time exceptions. Here are some
		// examples.

		// The following cast causes a run-time error!
		// int i = (Integer) raw.getOb(); // run-time error

		// This assignment overrides type safety
		strOb = raw; // OK, but potentially wrong
		// String str = strOb.getOb(); // run-time error

		// This assignment also overrides type safety.
		raw = iOb; // OK, but potentially wrong
		// d = (Double) raw.getOb(); // run-time error
	}
}