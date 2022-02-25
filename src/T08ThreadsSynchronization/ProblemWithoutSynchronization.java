package T08ThreadsSynchronization;

class Table {
	void prinTable(int n) {// mehtod not synchronized
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);

			try {
				Thread.sleep(400);

			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyThread1 extends Thread {
	Table t;

	MyThread1(Table t) {
		this.t = t;
	}

	public void run() {
		t.prinTable(5);
	}
}

class MyThread2 extends Thread {

	Table k;

	MyThread2(Table k) {
		this.k = k;
	}

	public void run() {
		k.prinTable(20);
	}
}

public class ProblemWithoutSynchronization {

	public static void main(String[] args) {

		Table obj = new Table();// only one object

		MyThread1 t1 = new MyThread1(obj);
		MyThread2 k2 = new MyThread2(obj);

		t1.start();
		k2.start();
	}

}
