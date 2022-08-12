class Callme {
	public void call(String msg) {
		try {
			System.out.print("[" + msg);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}

		System.out.println("]");
	}
}

class Caller implements Runnable {
	Thread t;
	String msg;
	Callme target;

	Caller(Callme targ, String m) {
		t = new Thread(this);
		msg = m;
		target = targ;
	}

	// synchronized calls to call()
	public void run() {
		synchronized (target) {
			target.call(msg);
		}
	}
}

class Synch1 {
	public static void main(String[] args) {
		Callme target = new Callme();
		Caller obj1 = new Caller(target, "Hello");
		Caller obj2 = new Caller(target, "Synchronized");
		Caller obj3 = new Caller(target, "World");

		obj1.t.start();
		obj2.t.start();
		obj3.t.start();

		try {
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
}