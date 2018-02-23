package kata;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReversedSequence {

  public static Collection reverse(int n) {
    if (n < 0) {
      throw new InvalidParameterException("input must not be negative");
    }
    return IntStream.iterate(n, i -> i-1).limit(n).boxed().collect(Collectors.toCollection(ArrayList::new));
  }
}
