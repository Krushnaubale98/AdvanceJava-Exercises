package T07Threads;

//java code for thread creation by implementing 
//the Runnable interface

class multithreadingdemo implements Runnable {

	@Override
	public void run() {
		try {

			// Displaying the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId());
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

public class CreateRunnableInterface {

	public static void main(String[] args) {
		int n=8;// number of threads
		for(int i=0;i<n;i++) {
			Thread object =new Thread(new multithreadingdemo());
			object.start();
		}

	}

}
