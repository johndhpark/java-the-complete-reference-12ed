// A non-generic class can be superclass of a generic subclass

// A non-generic class
class NonGen {
	int num;

	NonGen(int i) {
		num = i;
	}

	int getnum() {
		return num;
	}
}

// A generic subclass
class Gen<T> extends NonGen {
	T ob; // delcare an object of type T

	// Pass the construcstor a reference to an object of type T.
	Gen(T o, int i) {
		super(i);
		ob = o;
	}

	// Return ob
	T getOb() {
		return ob;
	}
}

// Create a Gen object.
class HierDemo2 {
	public static void main(String[] args) {

		// Create a Gen object for String
		Gen<String> w = new Gen<String>("Hello", 47);

		System.out.println(w.getOb() + " ");
		System.out.println(w.getnum());
	}
}