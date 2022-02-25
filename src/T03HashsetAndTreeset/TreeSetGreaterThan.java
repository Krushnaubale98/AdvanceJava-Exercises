package T03HashsetAndTreeset;
import java.util.*;
public class TreeSetGreaterThan {

	public static void main(String[] args) {
		
		TreeSet<Integer> tset=new TreeSet<Integer>();
		tset.add(10);
		tset.add(22);
		tset.add(36);
		tset.add(25);
		tset.add(16);
		tset.add(70);
		tset.add(82);
		tset.add(89);
		tset.add(14);

		System.out.println("Initial set: " +tset);
		
		System.out.println("Strictly greater than 76:" +tset.higher(76));
		System.out.println("Stricly lessthan 25:"+tset.lower(25));
		System.out.println("Strictly greater than 36:" +tset.higher(36));
		System.out.println("Stricly lessthan 10:"+tset.lower(10));
		
	}

}
