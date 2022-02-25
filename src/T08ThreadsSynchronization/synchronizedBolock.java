package T08ThreadsSynchronization;

class tabl {

	void printtable(int n) {

		synchronized (this) {// this is synchronized block
			for (int i = 1; i <= 5; i++) {
				System.out.println(n * i);

				try {
					Thread.sleep(500);
				} catch (Exception e) {
					
				}
			}
		}
	}// end of method
}

class Thread3 extends Thread {
	tabl t;
	Thread3(tabl t) {
		this.t = t;
	}
	public void run() {
		t.printtable(10);
		System.out.println("\n");	
	}
	
}
class Thread4 extends Thread {
	tabl t;
	Thread4(tabl t) {
		this.t = t;
	}

	public void run() {
		
		t.printtable(20);
	}
}

public class synchronizedBolock {

	public static void main(String[] args) {
		tabl tb = new tabl();

		Thread3 t3 = new Thread3(tb);
		Thread4 t4 = new Thread4(tb);
		
		t3.start();
		t4.start();
	}

}
