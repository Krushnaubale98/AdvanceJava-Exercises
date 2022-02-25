package T01CollectionFrameWork;
//import java.lang.reflect.Array;
import java.util.*;
//The ArrayList class implements the list interface. it is uses a dynamic array to store the duplicate 
//elements of different DataTypes.

public class Arraylist {
	




		public static void main(String[] args) {

			ArrayList<String> list = new java.util.ArrayList<String>();// creating a ArrayList
			list.add("Ravi");
			list.add("Vijay");
			list.add("ravi");
			list.add("Ajay");
			System.out.println(list);

			// Traversing list through iterator

		
			Iterator<String> itr = list.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
				System.out.println(itr.next());

			}

		}
	}



