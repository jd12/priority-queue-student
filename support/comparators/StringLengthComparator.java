package comparators;

import java.util.Comparator;

/**
 * A {@link StringLengthComparator} compares strings by their
 * length such that shorter string come before longer strings. Strings of the
 * same length are sorted lexicographically.
 * @author jcollard, jddevaug
 */
public class StringLengthComparator implements Comparator<String> {

  @Override
  public final int compare(final String arg0, final String arg1) {
    if (arg0.length() < arg1.length()) {
      return -1;
    }
    if (arg0.length() > arg1.length()) {
      return 1;
    }
    return arg0.compareTo(arg1);
  }
}
