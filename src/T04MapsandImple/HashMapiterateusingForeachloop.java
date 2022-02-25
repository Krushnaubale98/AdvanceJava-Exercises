

package T04MapsandImple;

import java.util.*;
import java.util.Map.Entry;

public class HashMapiterateusingForeachloop {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		HashMap<String, String> hmap = new HashMap<String, String>();

		hmap.put("Home loan", "city-bank");
		hmap.put("Personal loan", "Wells fargo");
		// Iterating or looping map using java 5 Foreach loop
		for (String key : hmap.keySet()) {
			System.out.println("****************************\n");
			System.out.println("1 Iterating or looping map using java5 foreach loop");
			System.out.println("key:" + key + " value:" + hmap.get(key));
		}
		// nIterating Map in java using KeySet Iterator

		Set<String> keyset = hmap.keySet();
		Iterator<String> itr = keyset.iterator();
		while (itr.hasNext()) {
			System.out.println("************************************\n");
			System.out.println("2 Iterating Map in java using KeySey Iterator");
			String key = itr.next();
			System.out.println("Key: " + key + " value: " + hmap.keySet());
		}
		// looping HashMap in java using EntrySet and java 5 for loop

		Set<Map.Entry<String, String>> entryset = hmap.entrySet();
		for (Entry entry : entryset) {
			System.out.println("************************************\n");
			System.out.println("3 Looping HashMap in java  using entrySet and java5 loop");
			System.out.println("key:" + entry.getKey() + " value:" + entry.getValue());

		}

		// Iterating HashMap in java using EntrySet and java Iterator

		Set<Map.Entry<String, String>> entryset1 = hmap.entrySet();
		Iterator<Map.Entry<String, String>> itr1 = entryset1.iterator();
		while (itr1.hasNext()) {
			System.out.println("**********************************************");
			System.out.println("4 Iterating HashMap in java using entryset and java iterator");
			Entry entry = itr1.next();
			System.out.println("key: " + entry.getKey() + " Value:" + entry.getValue());

		}

	}

}
