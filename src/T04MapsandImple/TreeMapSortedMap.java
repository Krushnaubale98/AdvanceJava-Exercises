package T04MapsandImple;

import java.util.*;

public class TreeMapSortedMap {

	public static void main(String[] args) {


		SortedMap<Integer,String> srmap=new TreeMap<Integer,String>();
	
		srmap.put(101, "Raju");
		srmap.put(102, "kaju");
		srmap.put(103, "Faiju");
		srmap.put(105, "Soham");
		srmap.put(104, "Rajesh");
		//Returns key-value pairs whose kyes are less than the speciied key
		System.out.println("headMap:"+srmap.headMap(102));
	
		//Returns key-value pairs whose kyes are greather than or equal the specified key.
		System.out.println("tailMap:" +srmap.tailMap(102));
		
		//Returns key-value pairs exists in between the specified key.
		System.out.println("subMap:"+ srmap.subMap(102, 104));
		
	}
	

}
