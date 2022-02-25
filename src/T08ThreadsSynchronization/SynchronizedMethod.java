package T08ThreadsSynchronization;

class table1 {

	synchronized void printtable(int n) {// this is synchronized method

		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);

			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Thread1 extends Thread {
	table1 t;

	Thread1(table1 t) {
		this.t = t;
	}

	public void run() {
		t.printtable(10);
		System.out.println("\n ");
	}
}

class Thread2 extends Thread {
	table1 t;

	Thread2(table1 t) {
		this.t = t;
	}

	public void run() {
		t.printtable(20);
	}
}

public class SynchronizedMethod {

	public static void main(String[] args) {

		table1 pt = new table1();
		Thread1 t1 = new Thread1(pt);
		Thread2 t2 = new Thread2(pt);
		t1.run();
		t2.run();

	}

}
