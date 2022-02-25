package T04MapsandImple;

import java.util.*;

public class LinkedHahMapExp {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<Integer, String>();

		lhmap.put(101, "Sham");
		lhmap.put(102, "Ramesh");
		lhmap.put(103, "Ganesh");
		lhmap.put(104, "Rahul");

		for (Map.Entry m : lhmap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
 
}
