package T02ListAndItsImplementation;

import java.util.*;

public class Arraylist {

	public static void main(String[] args) {

		ArrayList<String> li = new ArrayList<String>();
		li.add("Ravi");
		li.add("Vijay");
		li.add("Ravi");
		li.add("Ajay");
		// invoking ArrayList object
		System.out.println(li);

		//
		System.out.println("traverse the elements using iterator");
		Iterator<String> itr = li.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Iterating colection through the for_each loop");
		for (String obj : li)
			System.out.println(obj);

		System.out.println("Iterating collection through remaining ways\n");

		System.out.println("Traversing list through list Iterator");
		// here,elements iterates in reverse order
		ListIterator<String> litr = li.listIterator(li.size());
		while (litr.hasPrevious()) {
			String str = litr.previous();
			System.out.println(str);
		}
		System.out.println("Treversing list through for loop");
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}

		System.out.println("Treversing list through forEach()method:");
		// The foeEach() method is a new feture,introduced in java 8.
		li.forEach(a -> { // Here we are using a lambda Expression
			System.out.println(a);

		});
		
		System.out.println("Treversing list through forEachRemaining() method:");
		Iterator<String>itr2=li.iterator();
		itr2.forEachRemaining(a-> // Here we are using  lambda expression);
		{
		System.out.println(a);
	});
	}
}
