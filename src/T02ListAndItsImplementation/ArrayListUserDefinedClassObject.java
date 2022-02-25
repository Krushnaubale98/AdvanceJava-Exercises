package T02ListAndItsImplementation;
import java.util.*;
// Lets see an example where are sorting ArrayListUserDefinedClassObject class object in array list.
public class ArrayListUserDefinedClassObject {

	int rollno;
	String name;
	int age;
	
	public ArrayListUserDefinedClassObject(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		
		ArrayListUserDefinedClassObject s1=new ArrayListUserDefinedClassObject(101,"Sonoo",23);
		ArrayListUserDefinedClassObject s2=new ArrayListUserDefinedClassObject(102,"Ravi",21);
		ArrayListUserDefinedClassObject s3=new ArrayListUserDefinedClassObject(103,"Hanumant",25);
		
		// creating arrayList
		
		ArrayList<ArrayListUserDefinedClassObject> arlist=new ArrayList<ArrayListUserDefinedClassObject>();
		arlist.add(s1);
		arlist.add(s2);
		arlist.add(s3);
		// Gattin Iterator
		Iterator<ArrayListUserDefinedClassObject> itr=arlist.iterator();
		while(itr.hasNext()) {
			ArrayListUserDefinedClassObject st=(ArrayListUserDefinedClassObject)itr.next();
		System.out.println(st.rollno+" "+ st.name+" " + st.age);
		}
		

	
	}

}
