package T01CollectionFrameWork;
import java.util.*;
public class arraydeque {

	public static void main(String[] args) {

		
		// Creating deque and adding element
		Deque<String> deq=new ArrayDeque<String>();
		deq.add("Ramesh");
		deq.add("Rajesh");
		deq.add("Suresh");
		deq.add("Ganga");
		System.out.println( "Intial deque:"+deq);
		//Traversing the array
		for(String str:deq) {
			System.out.println(str);
		}
		
	}

}
