// Object may be passed to methods
class Test {
	int a, b;

	Test(int i, int j) {
		a = i;
		b = j;
	}

	// return true if o is equal to the invoking object
	boolean equalTo(Test o) {
		if (a == o.a && b == o.b)
			return true;
		return false;
	}
}

class PassObj {
	public static void main(String[] args) {
		Test ob1 = new Test(100, 22);
		Test ob2 = new Test(100, 22);
		Test ob3 = new Test(-1, -1);

		System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
		System.out.println("obj1 == obj3: " + ob1.equalTo(ob3));
	}
}