package T02ListAndItsImplementation;

import java.util.*;

public class ArrayLIstSetGetMethod {

	public static void main(String[] args) {

		ArrayList<String> arli = new ArrayList<String>();
		arli.add("Raju");
		arli.add("Ganesh");
		arli.add("Sham");
		arli.add("Rajesh");
		System.err.println("Before update: " + arli.get(1));

		// Updating an element ar specific position
		arli.set(1, "Gaurav");
		System.err.println("After update: " + arli.get(1));

	}

}
