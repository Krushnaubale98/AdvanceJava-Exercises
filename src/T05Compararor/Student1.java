package T05Compararor;

import java.util.ArrayList;
import java.util.Collections;


public class Student1 {

	public static void main(String[] args) {

		ArrayList<Student> ali = new ArrayList<Student>();

		ali.add(new Student(102, "akash", 21));
		ali.add(new Student(101, "chanchal", 23));
		ali.add(new Student(103, "bachan", 25));
	
		//Asper the method print data
		
		System.out.println("Sorting by name ");
		Collections.sort(ali, new NameComparator());
		for (Student st : ali) {
			System.out.println(+st.rollno + " " + st.name + " " + st.age);
		}
		System.out.println("\nSorting by age");	
		Collections.sort(ali,new ageComparator());
		for(Student st:ali) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		System.out.println("\nSortin by rollno");
		Collections.sort(ali,new RollnoComparator());
		
		for(Student st:ali) {
			System.out.println(st.rollno+" " +st.name+" "+ st.age);
		}
		
		
	}

}
