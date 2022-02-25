package T03HashsetAndTreeset;

import java.util.*;

public class TreesetHighestandLowestELExp {
	public static void main(String[] args) {

		// Remove Highest and lowest elements
		
		TreeSet<Integer> tset=new TreeSet<Integer>();
		
		tset.add(15);
		tset.add(16);
		tset.add(17);
		tset.add(18);
		tset.add(19);
		tset.add(20);
		System.out.println("\n Treeset");
		System.out.println(tset);
		
		System.out.println("Highest Value in set=>"+tset.pollFirst());
		System.out.println("Lowest value in set=>" +tset.pollLast());

	}

}
