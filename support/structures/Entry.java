package structures;

/**
 * An {@link Entry} describes an element of a {@link PriorityQueue}.
 * @author jcollard, jddevaug
 * @param <P> the priority type for this {@link Entry}
 * @param <V> the value type for this {@link Entry}
 */
public final class Entry<P, V> {

  private final P priority;
  private final V value;

  /**
   * @param priority
   *                the priority type for this {@link Entry}
   * @param value
   *                the value type for this {@link Entry}
   */
  public Entry(final P priority, final V value) {
    if (priority == null || value == null) {
      throw new NullPointerException("The priority and value must be non-null.");
    }
    this.priority = priority;
    this.value = value;
  }

  /**
   * Returns the priority of this {@link Entry}.
   * @return the priority of this {@link Entry}
   */
  public P getPriority() {
    return priority;
  }

  /**
   * Returns the value of this {@link Entry}.
   * @return the value of this {@link Entry}
   */
  public V getValue() {
    return value;
  }

}
