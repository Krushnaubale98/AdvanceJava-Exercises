package T01CollectionFrameWork;

import java.util.*;

public class hashset {

	public static void main(String[] args) {

		// creating Hashset and adding elements

		HashSet <String>hset = new HashSet<String>();

		hset.add("Ramesh");
		hset.add("Suresh");
		hset.add("Datta");
		hset.add("Raju");
		//traversing array
		for(String str:hset) {
			System.out.println(str);
		}
		// Traverse the elements using iterator
		System.out.println("Traverse elements using iterator:");
		Iterator<String>itr=hset.iterator();
		while(itr.hasNext()) {
		
			System.out.println(itr.next());
		}
	}

}
