package T03HashsetAndTreeset;

import java.util.*;

public class TreesetNavigableSetOperation {

	public static void main(String[] args) {
		// Perform various NavigableSet Operation

		TreeSet<String>set=new TreeSet<String>();
		
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		System.out.println("Intial Set"+set);
		
		System.out.println("Reverse set"+set.descendingSet());
	
		System.out.println("Head Set" +set.headSet("C",true));

		System.out.println("SubSet " +set.subSet("B",false ,"E" ,true));
		
		System.out.println("TailSet"+set.tailSet("C",false));
	}

}
