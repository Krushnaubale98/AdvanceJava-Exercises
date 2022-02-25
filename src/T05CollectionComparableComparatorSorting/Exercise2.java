package T05CollectionComparableComparatorSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//Exercise 2. modify above program to add a new class Department  with departmentname and departmentId 
// ervery employee will be part of the department . print the list of  all employees in asending order.

public class Exercise2 implements Comparable<Exercise2> {
	private int DepartmentId;
	private String DepartmentName;
	private List<Exercise1> employees;

	@Override
	public String toString() {
		return "department [DepartmentId=" + DepartmentId + ", DepartmentName=" + DepartmentName + ", employees="
				+ employees + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public Exercise2(int departmentId, String departmentName, List<Exercise1> employees) {
		super();
		this.DepartmentId = departmentId;
		this.DepartmentName = departmentName;
		this.employees = employees;
	}

	@Override
	public int compareTo(Exercise2 a) {
		if (DepartmentId > a.DepartmentId)
			return 1;
		else if (DepartmentId < a.DepartmentId)
			return -1;
		else
			return 0;

	}

	public static void main(String[] args) {
		ArrayList<Exercise1> al = new ArrayList<Exercise1>();
		al.add(new Exercise1(101, "Ram"));
		al.add(new Exercise1(102, "Sham"));
		al.add(new Exercise1(103, "Raju"));
		Collections.sort(al);
		ArrayList<Exercise2> ar1 = new ArrayList<Exercise2>();
		ar1.add(new Exercise2(01, "AC", al));
		ar1.add(new Exercise2(02, "HR", al));

		Collections.sort(ar1);

		Iterator<Exercise2> itr = ar1.iterator();
		while (itr.hasNext()) {
			Exercise2 a = (Exercise2) itr.next();
			System.out.println(a.DepartmentId + a.DepartmentName + a.employees);
		}
	}

}
