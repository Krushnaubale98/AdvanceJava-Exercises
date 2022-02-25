package T04MapsandImple;

import java.util.*;

public class THashTable {

	public static void main(String[] args) {

		Hashtable<Integer, String> htbl = new Hashtable<Integer, String>();

		htbl.put(101, "Raju");
		htbl.put(102, "kaju");
		htbl.put(103, "Faiju");
		htbl.put(105, "Soham");
		htbl.put(104, "Rajesh");
		
		for (@SuppressWarnings("rawtypes") Map.Entry m : htbl.entrySet()) {

			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("Intia; Hashtable:"+htbl);
		htbl.remove(102);
		System.out.println("After the remove 102: "+ htbl);
		
		// if have absent than putIfAbsent() method
		
		htbl.putIfAbsent(106, "Mohan");
		System.out.println("Absent 106: "+htbl);
		
		

	}

}
