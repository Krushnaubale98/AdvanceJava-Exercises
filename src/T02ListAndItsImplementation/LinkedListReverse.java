package T02ListAndItsImplementation;

import java.util.*;

public class LinkedListReverse {

	public static void main(String[] args) {

		LinkedList<String> lkli = new LinkedList<String>();

		lkli.add("Ram");
		lkli.add("Raju");
		lkli.add("Ruturaj");
		lkli.add("Rjendara");
		lkli.add("Ramesh");
		lkli.add("Sham");

		System.out.println("Inital Linkedlist " + lkli);

		// Traverse the list of elements in reverse order
		Iterator<String> itr = lkli.descendingIterator();
		while (itr.hasNext()) {
			System.out.print(", " +itr.next());
		}

	}

}
