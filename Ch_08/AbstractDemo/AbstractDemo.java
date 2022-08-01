// A Simple demonstration of abstract.

abstract class A {
	abstract void callme();

	void callmetoo() {
		System.out.println("Call me too");
	}
}

class B extends A {
	void callme() {
		System.out.println("Call me");
	}
}

class AbstractDemo {
	public static void main(String[] args) {
		B b = new B();

		b.callmetoo();
		b.callme();
	}
}