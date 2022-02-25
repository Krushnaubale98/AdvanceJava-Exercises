package T02ListAndItsImplementation;

import java.util.*;

public class linkedlist {

	public static void main(String[] args) {

		LinkedList<String> lkli = new LinkedList<String>();

		System.out.println("Initial list of elements: " + lkli);
		lkli.add("Ramesh");
		lkli.add("Raju");
		lkli.add("Rajendra");
		lkli.add("Rupesh");
		lkli.add("Ruturaj");

		System.out.println("After invoking add(E e)method :" + lkli);
		// Adding an element ar the specific position

		lkli.add(1, "Gaurav");
		System.out.println("After invoking add(int index,E element)method: " + lkli);

		// create a anothe LinkedList

		LinkedList<String> lkli1 = new LinkedList<String>();
		lkli1.add("Sonoo");
		lkli1.add("Hanumant");
		// Adding second list elements to the first list

		lkli.addAll(lkli1);
		System.out.println("After invoking addAll(Collection<?extends E>c)method: " + lkli);

		// create 3 LinkedList
		LinkedList<String> lkli2 = new LinkedList<String>();
		lkli2.add("Jhon");
		lkli2.add("Rahul");

		// adding second list elements to the list first list at a specific elements

		lkli.addAll(1, lkli2);
		System.out.println("After invoking AddAll(int index,Collection<?extends E>c)mehtod " + lkli);

		// Adding an elemtns at the first position
		lkli.addFirst("Lokesh");
		System.out.println("Add first position(AddFirst()Method:" +lkli);

		// Adding an elements at the last position
		lkli.addLast("Harsh");
		System.out.println("Add fLast position(AddLast()Method:" +lkli);

	}
}
