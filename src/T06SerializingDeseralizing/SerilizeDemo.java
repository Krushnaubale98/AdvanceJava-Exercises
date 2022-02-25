package T06SerializingDeseralizing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class employee implements Serializable {

	String Name;
	String Address;
	transient int SSN;
	int Number;

}

public class SerilizeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		employee e = new employee();
		e.Name = "Ram";
		e.Address = "At aurangabad";
		e.SSN = 431121;
		e.Number = 101;

		// Serialized data
		try {
			FileOutputStream fileOut = new FileOutputStream("emp.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in 'emp.ser'");
		} catch (Exception e1) {
			System.out.println(e1);
			// Deserialized data

			try {
				FileInputStream filein = new FileInputStream("emp.ser");
				ObjectInputStream in = new ObjectInputStream(filein);
				e = (employee) in.readObject();
				in.close();
				filein.close();

			} catch (FileNotFoundException e2) {

				e2.printStackTrace();
				return;
			}

		}
		System.out.println("Deserialized Employee");
		System.out.println("Name:"+ e.Name);
		System.out.println("Address:"+e.Address);
		System.out.println("SSN:"+e.SSN);
		System.out.println("Number:"+e.Number);
	}

}
