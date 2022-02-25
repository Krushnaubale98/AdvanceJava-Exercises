package T05Comparable;
// lets see the example of the of the comparable interface that sorts the list elements on the basis of age.

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student> {

	int rollno;
	String name;
	int age;

	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	// asper the age
	public int compareTo(Student stu) {

		if (age == stu.age)
			return 0;

		else if (age > stu.age) {
			return 1;
		} else
			return -1;

	}

	public static void main(String[] args) {

		ArrayList<Student> ar = new ArrayList<Student>();

		ar.add(new Student(101, "Ram", 25));
		ar.add(new Student(102, "Ganesh", 26));
		ar.add(new Student(103, "Raju", 22));

		System.out.println("Print the data asper tha age");
		Collections.sort(ar);
		for (Student a : ar) {
			System.out.println(a.rollno + " " + a.name + " " + a.age);

		}
	}

}
