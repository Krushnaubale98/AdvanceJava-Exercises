package T07Threads;

// java program to demostrate deadlock
//using main thread

//imp== The statements "Thread.currentThread().join()", will tell main thread to wait for this thread (i.e. 
//  wait for itself) to die. this main thrad wait for itself to die,which is nothing but a deadlock
public class DeadlockThread {

	public static void main(String[] args) {

		try {

			System.out.println("Entering into Deadlock");
			Thread.currentThread().join();
			
			// following statements will never Execute
			
			System.out.println("This statements will never execute");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
