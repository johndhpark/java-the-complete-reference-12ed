class Stack {
	int[] stack = new int[10];
	int tos;

	// Initialize top of the stack
	Stack() {
		tos = -1;
	}

	// Push an item onto the stack
	void push(int item) {
		if (tos == 9) {
			System.out.println("Stack is full.");
		} else {
			stack[++tos] = item;
		}
	}

	// Pop an item from the stack
	int pop() {
		if (tos == -1) {
			System.out.println("Stack underflow.");
			return -1;
		} else {
			return stack[--tos];
		}
	}
}

class TestStack {
	public static void main(String[] args) {
		Stack myStack = new Stack();

		for (int i = 0; i < 10; i++) {
			myStack.push(i);
		}

		myStack.push(10);

		for (int i = 0; i < 9; i++) {
			System.out.println(myStack.pop());
		}
	}
}