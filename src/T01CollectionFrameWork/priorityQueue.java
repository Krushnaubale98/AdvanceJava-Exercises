package T01CollectionFrameWork;
import java.util.*;
public class priorityQueue {

	public static void main(String[] args) {

		PriorityQueue<String> pque=new PriorityQueue<String>();
		pque.add("Shubham");
		pque.add("Ram");
	
		pque.add("Ganesh");
		pque.add("Prem");
		pque.add("Ramesh");
		pque.add("Radha");
		pque.add("Radha");
		pque.add("sham");
		System.out.println(pque);
		System.out.println("After the itertiing the elements");
		System.out.println("head: " + pque.element());
		System.out.println("head(peek()): " + pque.peek());
	
		Iterator<String> itr=pque.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		pque.remove();
		pque.poll();
		System.out.println("After the removing the elements");
		
		Iterator<String> itr2=pque.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
