package T05Compararor;
// generic comaparator example using Three class
import java.util.Comparator;
// main statrt clsas 
public class Student {

	int rollno;
	String name;
	int age;

	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

class ageComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {

		if (s1.age == s2.age)
			return 0;

		else if (s1.age > s2.age)
			return 1;
		else
			return -1;

	}

}
class RollnoComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {

		if (s1.rollno == s2.rollno)
			return 0;

		else if (s1.rollno > s2.rollno)
			return 1;
		else
			return -1;

	}

}
