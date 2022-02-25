package T04MapsandImple;

import java.util.*;

public class Treemapexp {

	public static void main(String[] args) {

		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();

		tmap.put(101, "Raju");
		tmap.put(102, "kaju");
		tmap.put(103, "Faiju");
		tmap.put(105, "Soham");
		tmap.put(104, "Rajesh");
		System.out.println("Intial treeMap:" + tmap);
		for (@SuppressWarnings("rawtypes") Map.Entry m : tmap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
