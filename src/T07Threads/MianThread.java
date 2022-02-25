package T07Threads;

// java program to control the main thread 

public class MianThread extends Thread {

	public static void main(String[] args) {

		// getting reference to main Thread
		Thread t = Thread.currentThread();

		// getting name of main thread
		System.out.println("Current thread :" + t.getName());

		// changing the name of main thread
		t.setName("Geeks");
		System.out.println("After name change:" + t.getName());

		// getting priority of main thread
		System.out.println("Main thread priority:" + t.getPriority());

		// setting priority of main thread to MAX(10)
		t.setPriority(MAX_PRIORITY);
		System.out.println("main thread new priority:" + t.getPriority());

		for (int i = 0; i < 5; i++) {
			System.out.println("Main thread");

		}

		// main thread creating a child thread
		ChildThread ct = new ChildThread();

		// getting priority of child thread
		// which will be inherited from main thread
		// as it is created by main thread
		System.out.println("Child thread prioity:" + ct.getPriority());

		// setting priority of main thread to MIN(1)

		ct.setPriority(MAX_PRIORITY);

		System.out.println("Child thread new priority: " + ct.getPriority());

		// starting child thread
		ct.start();

	}

}

class ChildThread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
		}
	}

}