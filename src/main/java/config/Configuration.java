package config;

import java.util.Comparator;

import structures.AbstractArrayHeap;
import structures.PriorityQueue;

/**
 * The {@link Configuration} class is a set of static definitions we will use to
 * grade your assignment.
 * @author jcollard, jddevaug
 */
public class Configuration {
  /**
   * Given a {@link Comparator} returns the {@link AbstractArrayHeap} to be
   * graded.
   * @param <P>
   *            the priority type of this {@link AbstractArrayHeap}
   * @param <V>
   *            the value type of this {@link AbstractArrayHeap}
   * @param comparator
   *            the comparator that will be used
   * @return the {@link AbstractArrayHeap} implementation to be graded.
   */
  public static <P, V> AbstractArrayHeap<P, V> getArrayHeap(
      final Comparator<P> comparator) {
    return null;
  }

  /**
   * Returns a {@link PriorityQueue} that uses integer values for priority and
   * dequeues values who have the smallest priority.
   * @param <V>
   *            the value type of this {@link PriorityQueue}
   * @return a {@link PriorityQueue} that uses integer values for priority and
   *         dequeues values who have the smallest priority.
   */
  public static <V> PriorityQueue<Integer, V> getMinQueue() {
    return null;
  }

  /**
   * Returns a {@link PriorityQueue} that uses integer values for priority and
   * dequeues values who have the largest priority.
   * @param <V>
   *            the value type of this {@link PriorityQueue}
   * @return a {@link PriorityQueue} that uses integer values for priority and
   *         dequeues values who have the largest priority.
   */
  public static <V> PriorityQueue<Integer, V> getMaxQueue() {
    return null;
  }

}
