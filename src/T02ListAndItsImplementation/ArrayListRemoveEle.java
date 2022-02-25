package T02ListAndItsImplementation;
import java.util.*;
 // here , we see differnt way to remove elements.
public class ArrayListRemoveEle {

	public static void main(String[] args) {
		ArrayList<String> arli=new ArrayList<String>();
		
		arli.add("Raju");
		arli.add("Sham");
		arli.add("Sonam");
		arli.add("Ram");
		
		
		System.out.println("An initial list of elements:" +arli);
		// removing specific elements from arraylist
		arli.remove("Sonam");
		System.out.println("After invoking remove(object)method: "+arli);
	
		//Removing element on the basis of specific position
		arli.remove(0);
		System.out.println("After invoking remove(index)method: " +arli);
		
		//Creating anothe arraylist
		ArrayList <String>arli1=new ArrayList<String>();
		arli1.add("Ravi");
		arli1.add("Hanumant");
		
		System.out.println("new arraylist"+arli1);
		
		//Adding new elements to arraylist
		arli.addAll(arli1);
		System.out.println("Updated list:" +arli);
		
		//Removing all the new elements from arraylist
	    
		arli.removeAll(arli1);
		System.out.println("After invoking removeAll() method: " +arli);
		
		//Remove elements on the basis of specified condition
		
		arli.removeIf(str->str.contains("Sham")); // Here we are using lambda ecpression
		System.out.println("After invoking removeif() method: " +arli);
		
		//Removing all the elements available in the list
		arli.clear();
		System.out.println("After invoing clear() method " + arli);
	}

}
