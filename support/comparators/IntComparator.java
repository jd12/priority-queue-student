package comparators;

import java.util.Comparator;
/**
 * A {@link Comparator} that compares
 * {@link Integer} values.
 * @author jddevaughnbrown
 *
 */
public class IntComparator implements Comparator<Integer> {

  @Override
  public final int compare(final Integer arg0, final Integer arg1) {
    if (arg0.intValue() < arg1.intValue()) {
      return -1;
    }
    return 0;
  }

}
