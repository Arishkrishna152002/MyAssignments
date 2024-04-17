package automationTesting;

import java.util.HashSet;
import java.util.Set;

public class SetOfArray {

	public static void main(String[] args) {
		
		Set<String> names= new HashSet<String>();
		names.add("Arish");
		names.add("Arish");    //in SET it will not allow to add duplicate values.
		
		System.out.println(names);
		
 
	}

}
