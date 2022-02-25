package T03HashsetAndTreeset;

import java.util.*;

public class HashsetExp {

	public static void main(String[] args) {
		// Creating HashSet and adding new Elements

		HashSet<String> hset = new HashSet<String>();
		hset.add("One");
		hset.add("Two");
		hset.add("three");
		hset.add("Four");

		System.out.println("HashSet not contains the duplicate elements");
		hset.add("Four");

		// hset.add("Five");
		hset.add("Five");

		// Iterate the HashSet
		Iterator<String> itr = hset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		// HashSet
		System.out.println("\nPrinted HashSet");
		System.out.println(hset);

		System.out.println("After the  using method remove ");
		hset.remove("Two");
		System.out.println(hset);

		System.out.println("Update the set");
		hset.add("vijay");
		System.out.println(hset);

		System.out.println("After the remove all");
		hset.removeAll(hset);
		System.out.println(hset);

		// System.out.println("After the removeIF methos");
		// hset.removeIf(hset);
		// System.out.println(hset);\
		
		System.out.println("Using clear method");
		hset.clear();
		System.err.println(hset);

	}

}
