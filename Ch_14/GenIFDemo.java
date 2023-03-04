// A generic interface example.

// A Min//Max Interface
interface MinMax<T extends Comparable<T>> {
	T min();

	T max();
}

// Now implement MinMax

class MyClass<T extends Comparable<T>> implements MinMax<T> {
	T[] vals;

	MyClass(T[] o) {
		vals = o;
	}

	// Return the minimum value in vals
	public T min() {
		T v = vals[0];

		for (int i = 1; i < vals.length; ++i) {
			if (vals[i].compareTo(v) < 0) {
				v = vals[i];
			}
		}

		return v;
	}

	public T max() {
		T v = vals[0];

		for (int i = 0; i < vals.length; ++i) {
			if (vals[i].compareTo(v) > 0) {
				v = vals[i];
			}

		}

		return v;
	}
}

class GenIFDemo {
	public static void main(String[] args) {
		Integer[] nums = { 3, 6, 2, 8, 6 };
		Character[] chs = { 'b', 'r', 'p', 'w' };

		MyClass<Integer> iOb = new MyClass<Integer>(nums);
		MyClass<Character> cOb = new MyClass<Character>(chs);

		System.out.println("Max value in inums: " + iOb.max());
		System.out.println("Min value in nums: " + iOb.min());

		System.out.println("Max value in  chs: " + cOb.max());
		System.out.println("Min value in chs: " + cOb.min());
	}
}