package T03HashsetAndTreeset;
 
import java.util.*;
public class LinkedlistHashsetExp {

	public static void main(String[] args) {
		//createing Hashset and adding elemetns
		
		@SuppressWarnings({ "unchecked", "rawtypes" })// warning 
		LinkedHashSet<String>set=new LinkedHashSet();
		
		set.add("One");
		set.add("two");
		set.add("Three");
		set.add("Four");
		// LinkedHashSet Ignoring the Duplicate Elements
		set.add("One");
		set.add("FIve");
		System.out.println("\n printed the Hashset");
		System.out.println(set);
		
		System.out.println("\n after the Iteration");
		@SuppressWarnings("rawtypes")
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
