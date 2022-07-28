class Stack {
	private int[] stack;
	private int tos;

	Stack() {
		stack = new int[10];
		tos = -1;
	}

	void push(int val) {
		if (tos == 9) {
			System.out.println("Stack is full.");
		} else {
			stack[++tos] = val;
		}
	}

	int pop() {
		if (tos < 0) {
			System.out.println("Stack underflow");
			return -1;
		} else {
			return stack[tos--];
		}
	}
}

class TestStack {
	public static void main(String[] args) {
		Stack mystack1 = new Stack();
		Stack mystack2 = new Stack();

		for (int i = 0; i < 10; i++) {
			mystack1.push(i);
		}

		for (int i = 0; i < 20; i++) {
			mystack2.push(i);
		}

		// pop numbers off stack1
		System.out.println("Stack in mystack1: ");
		for (int i = 0; i < 10; i++) {
			System.out.println(mystack1.pop());
		}

		// pop numbers off stack2
		System.out.println("Stack in mystack2: ");
		for (int i = 0; i < 10; i++) {
			System.out.println(mystack2.pop());
		}

		// these statements are not legal
		// mystack1.tos = -2;
		// mystack2.stack[3] = 100;
	}
}