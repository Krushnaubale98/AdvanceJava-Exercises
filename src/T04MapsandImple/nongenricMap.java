package T04MapsandImple;
import java.util.*;
public class nongenricMap {

	public static void main(String[] args) {

		Map<Integer, String> map=new HashMap<Integer, String>();
		// Adding elements into  map
		
		map.put(1, "Amit");
		map.put(2," Rahu");
		map.put(3,"Jai");
		map.put(4,"Amit");
		
		// Traversing map
		
	 @SuppressWarnings("rawtypes")
	Set set=map.entrySet();// Converting to set so that we can traverse
	 @SuppressWarnings("rawtypes")
	Iterator itr=set.iterator();
	 while(itr.hasNext()){
		 // Converting to map.Entry so that we can get key and value separately
		 
		 @SuppressWarnings("rawtypes")
		Map.Entry entry=(Map.Entry)itr.next();
		System.out.println(entry.getKey() +" "+entry.getValue());
	 }
		
		
		
	}

}
