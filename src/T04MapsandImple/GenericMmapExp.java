package T04MapsandImple;
import java.util.*;
public class GenericMmapExp {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		// add elements to map
		
		map.put(1, "Amit");
		map.put(2, "Smit");
		map.put(3, "Ramesh");
		map.put(4, "Ganesh");
		map.put(5, "Ram");
		
		// Elements can traverse in any order
		
		for(@SuppressWarnings("rawtypes") Map.Entry  m:map.entrySet()) {
			System.out.println(m.getKey()+" "+ m.getValue());
		}
		

	}

}
