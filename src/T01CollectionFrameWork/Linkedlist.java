package T01CollectionFrameWork;

import java.util.Iterator;
import java.util.LinkedList;

//it uses a doubly linked list internally to store the elements. it can store the elements. it can store the 
// dublicate elements. it maintains the insertion order insertion order and is not synchronized.
public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<String> linkedlist=new LinkedList<String>();
		linkedlist.add("ravi");
		linkedlist.add("vijay");
		linkedlist.add("ravi");
		linkedlist.add("Aajay");
		
		System.out.println(linkedlist);
		// Traversing list through iterator
		
		Iterator<String> itr=linkedlist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
