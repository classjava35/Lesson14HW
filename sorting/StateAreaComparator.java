package sorting;

import java.util.Comparator;

public class StateAreaComparator implements Comparator<State> {

	@Override
	public int compare(State s1, State s2) {
		
		int a = s1.getArea();
		int b = s2.getArea();
		int max = a > b ? 1 : a < b ? -1 : 0;

		return max;
	}

}
