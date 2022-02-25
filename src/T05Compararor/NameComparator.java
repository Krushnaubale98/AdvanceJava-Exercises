package T05Compararor;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

	@Override
	public int compare(Student n1, Student n2) {
		return n1.name.compareTo(n2.name);
	}

}
