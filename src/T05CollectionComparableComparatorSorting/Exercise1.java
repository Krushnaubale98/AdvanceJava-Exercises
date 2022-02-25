package T05CollectionComparableComparatorSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//Exercise 1 : Create a employee class with name and employeeId . Print the sorted list of employees by name .
public class Exercise1 implements Comparable<Exercise1> {
	int rollno;
	String name;

	public Exercise1(int rollno, String name) {
		super();
		this.name = name;
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "employeeid [name=" + name + ", rollno=" + rollno + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(Exercise1 k2) {

		return name.compareTo(k2.name);
	}

	public static void main(String[] args) {

		ArrayList<Exercise1> al = new ArrayList<Exercise1>();
		al.add(new Exercise1(104, "Aaju"));
		al.add(new Exercise1(101, "Ram"));
		al.add(new Exercise1(102, "Sham"));
		System.err.println("Sorting by name");
		Collections.sort(al);
		Iterator<Exercise1> itr = al.iterator();
		while (itr.hasNext()) {
			Exercise1 st = (Exercise1) itr.next();
			System.out.println(st.rollno + "  " + st.name);

		}

	}

}