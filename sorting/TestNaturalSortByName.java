package sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestNaturalSortByName {
	public static void main(String[] args) {
		
		ArrayList<State> list = new ArrayList<>();
		list.add(new State("Brazil", 6,1));
		list.add(new State("UK", 2,9));
		list.add(new State("US", 4,7));
		list.add(new State("Albania", 9,2));
		
		System.out.println("order of inserting data - to the ArrayList");
		System.out.println(list); //order of inserting data
		
		Collections.sort(list);
		
		System.out.println();

		System.out.println("Natural sorting - by country Name");
		System.out.println(list); //Natural sorting 
		
		StatePopulationComparator s = new StatePopulationComparator();
		
		Collections.sort(list ,s);
		
		System.out.println();
		System.out.println("External  sorting - by Population");
		System.out.println(list);
		
		StateAreaComparator a = new StateAreaComparator();
		
		Collections.sort(list ,a);
		
		System.out.println();
		System.out.println("External sorting - by Area ");
		System.out.println(list);

		
	}
	

}
