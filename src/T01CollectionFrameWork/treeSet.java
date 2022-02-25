package T01CollectionFrameWork;

import java.util.*;

public class treeSet {

	public static void main(String[] args) {
		// creating Treeset and add elements
		TreeSet<String> tset = new TreeSet<String>();

		tset.add("Sham");
		tset.add("Ganesh");
		tset.add("Ramesh");
		tset.add("Ram");
		// Trversing elements
		Iterator<String> itr = tset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
