package T02ListAndItsImplementation;

import java.util.*;

public class ArrayListRetainmethod {

	public static void main(String[] args) {

		ArrayList<String> arli = new ArrayList<String>();
		arli.add("Ram");
		arli.add("Ganesh");
		arli.add("Ramesh");
		arli.add("Raju");

		ArrayList<String> arli1 = new ArrayList<String>();

		arli1.add("Ram");
		arli1.add("Hanumant");
		
		arli.retainAll(arli1);
		System.out.println("iterating the elements after retaining the elements of arli2");
		Iterator<String> itr=arli.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
