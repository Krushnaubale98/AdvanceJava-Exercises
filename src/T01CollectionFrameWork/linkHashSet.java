package T01CollectionFrameWork;

import java.util.*;

public class linkHashSet {

	public static void main(String[] args) {

		LinkedHashSet<String> lhset = new LinkedHashSet<String>();

		lhset.add("Ram");
		lhset.add("Suresh");
		lhset.add("Ramesh");
		lhset.add("Ramu");
		lhset.add("Ram");

		// Travese elements
		Iterator<String> itr = lhset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
