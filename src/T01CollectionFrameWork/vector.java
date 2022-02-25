package T01CollectionFrameWork;

import java.util.Iterator;
import java.util.Vector;

// vector uses a dynamic array to store the data elements. it is similar to ArrayList. however, it is 
//synchronized and contains many methods that are not part of the collection framework.
public class vector {

	public static void main(String[] args) {

		Vector<String> vtr = new Vector<String>();
		vtr.add("Ravi");
		vtr.add("Ajay");
		vtr.add("Ravi");
		vtr.add("Amit");
		System.out.println(vtr);
		// Traversing list through
		Iterator<String> itr = vtr.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
	}

}
