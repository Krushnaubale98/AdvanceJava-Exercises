package T02ListAndItsImplementation;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class ArrayListSerializationDeseri {

	public static void main(String[] args) {

		ArrayList<String>arli=new ArrayList<String>();
		
		arli.add("Raju");
		arli.add("Ramesh");
		arli.add("Ganesh");
		arli.add("Ravi");
		try {
			
			//Serialization
			FileOutputStream fos=new FileOutputStream("File");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(arli);
			fos.close();
			oos.close();
			
			
			// Deserialization
			FileInputStream file=new FileInputStream("File");
			ObjectInputStream ois= new ObjectInputStream(file);
	        @SuppressWarnings("unchecked")
			ArrayList<String> list=(ArrayList<String>)ois.readObject();
	        System.out.println(list);
	        ois.close();
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
