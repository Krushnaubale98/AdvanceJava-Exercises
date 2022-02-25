package T07Threads;

//java code for thread Creation by extending the thread class

class multithreaddemo extends Thread {

	public void run() {

		try {

			// Displaying the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

public class ThreadClass {
	public static void main(String[] args) {

		int n=8;  // numbers of threads
		
		for(int i=0;i<n;i++) {
			multithreaddemo obj=new multithreaddemo();
			
			obj.start();
		}
	}
}
