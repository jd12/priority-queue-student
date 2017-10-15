package comparators;

import java.util.Comparator;

public class IntComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer arg0, Integer arg1) {
		if(arg0.intValue() < arg1.intValue())
			return -1;
		return 0;
	}

}
