package T04MapsandImple;
import java.util.*;
public class LinkdHashMapkeyvaluepair {

	public static void main(String[] args) {

		LinkedHashMap<Integer,String> lhmap= new LinkedHashMap<Integer,String>();
	
		lhmap.put(101, "Ram");
		lhmap.put(102, "Sham");
		lhmap.put(103, "Ganesh");
		lhmap.put(104, "Ramesh");
		//featching key
		System.out.println("keys:" +lhmap.keySet());
		//fetching value
		System.out.println("Value:" +lhmap.values() );

		//fetching key-value pair
		System.out.println("key-value :"+ lhmap.entrySet());
	}
	

}
