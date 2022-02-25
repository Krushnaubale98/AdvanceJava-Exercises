package T01CollectionFrameWork;

import java.util.*;

public class stack {

	public static void main(String[] args) {

		// Stack declaration

		Stack<String> st = new Stack<String>();

		st.push("Ram");
		st.push("Sham");
		st.push("Ganesh");
		st.push("Ramesh");
		System.out.println("Initial stack :" + st);

		// remove the one last elements
		System.out.println("\nAfter the remove one element");
		st.pop();
		Iterator<String> itr = st.iterator();
		while (itr.hasNext()) {
			System.out.println("=>" + itr.next());
		}

	}

}
