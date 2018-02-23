package kata;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/5a00e05cc374cb34d100000d
 *
 * Get the number n (n>0) to return the reversed sequence from n to 1.
 *
 * Example : n=5 >> [5,4,3,2,1]
 *
 */
public class ReversedSequence {

  public static Collection reverse(int n) {
    if (n < 0) {
      throw new InvalidParameterException("input must not be negative");
    }
    return IntStream.iterate(n, i -> i-1).limit(n).boxed().collect(Collectors.toCollection(ArrayList::new));
  }
}
