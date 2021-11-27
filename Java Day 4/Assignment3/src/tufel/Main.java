package tufel;


import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		//Sorted unique collection of objects
		Set<CD> myCollection=new TreeSet<CD>(new SortCD());
		
		myCollection.add(new CD("AVB", "RAJ"));
		myCollection.add(new CD("RAWS", "ABBY"));
		myCollection.add(new CD("EWA", "EVA"));
		myCollection.add(new CD("EWAD", "JC"));
		
		System.out.println(myCollection);
		System.out.println("SORTING CDs");
		System.out.println("Size of Collection :"+myCollection.size());
		for(CD obj:myCollection) {
			System.out.println(obj);
		}

		

	}

}
