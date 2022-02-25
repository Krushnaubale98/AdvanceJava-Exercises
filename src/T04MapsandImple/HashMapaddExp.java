package T04MapsandImple;

import java.util.*;

public class HashMapaddExp {

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		System.out.println("Intial list of elements=>" + hmap);

		hmap.put(101, "Amit");
		hmap.put(102, "Smit");
		hmap.put(103, "Ramesh");
		hmap.put(104, "Rajesh");
		System.out.println("After invoking put() method");
		for (@SuppressWarnings("rawtypes") Map.Entry m : hmap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		hmap.putIfAbsent(105, "Sham");
		System.out.println("After the invoking putAbsent() method");
		for (@SuppressWarnings("rawtypes") Map.Entry m : hmap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("After the invoking putAll() method");
		hmap.putAll(hmap);
		for (@SuppressWarnings("rawtypes") Map.Entry m : hmap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
