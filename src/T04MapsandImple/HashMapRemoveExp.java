package T04MapsandImple;

import java.util.*;

public class HashMapRemoveExp {

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(100, "Ganesh");
		hmap.put(102, "Ramesh");
		hmap.put(103, "Sham");
		hmap.put(104, "Arjun");
		System.out.println("\nIntial list of elements:" + hmap);

		// value based removal
		hmap.remove(102);
		System.out.println("After value based the remove 102 elemnts " + hmap);

		// key-value based removal

		hmap.remove(104, "Arjun");
		System.out.println("After the key-value based removal 104,'Arjun'" + hmap);
	}

}
