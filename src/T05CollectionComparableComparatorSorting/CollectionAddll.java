package T05CollectionComparableComparatorSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Add list as well as array to existing list using addAll() method of collection
public class CollectionAddll {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();

		li.add("C");
		li.add("Core Java");
		li.add("Advance java");

		System.out.println("Intial collection  valu" + li);
		Collections.addAll(li, "servlet","JSP");
		System.out.println("After adding elements collection value"+li);
		
		String[] strArr= {"C#",".Net"};
		Collections.addAll(li, strArr);
		System.out.println("After adding array colection vlue"+li);
		
		
	}

}
