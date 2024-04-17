package automationTesting;

import java.util.ArrayList;
import java.util.List;

public class ListOfArray {

	public static void main(String[] args) {
		
		List<String> names= new ArrayList<String>();
		
		names.add("Arish");
		names.add("Bilal");
		names.add("Mani");
		names.remove(0);
		names.add(0,"Appu");
		System.out.println(names);

	}

}
