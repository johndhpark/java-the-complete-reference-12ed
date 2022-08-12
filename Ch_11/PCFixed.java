// A correct implementation of a producer and consumer.
class Q {
	int n;
	boolean valueSet = false;

	synchronized int get() {
		while (!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		}

		System.out.println("Got: " + n);
		valueSet = false;
		notify();
		return n;
	}

	synchronized void put(int n) {
		while (valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		}

		this.n = n;
		valueSet = true;
		System.out.println("PUt: " + n);
		notify();
	}
}

class Producer implements Runnable {
	Q q;
	Thread t;

	Producer(Q q) {
		this.q = q;
		t = new Thread(this);
	}

	public void run() {
		int i = 0;

		while (true) {
			q.put(i++);
		}
	}
}

class Consumer implements Runnable {
	Q q;
	Thread t;

	Consumer(Q q) {
		this.q = q;
		t = new Thread(this);
	}

	public void run() {
		while (true) {
			q.get();
		}
	}
}

class PCFixed {
	public static void main(String[] args) {
		Q t = new Q();
		Producer p = new Producer(t);
		Consumer c = new Consumer(t);

		// Start the threads
		p.t.start();
		c.t.start();

		System.out.println("Press Control-C to stop.");
	}
}