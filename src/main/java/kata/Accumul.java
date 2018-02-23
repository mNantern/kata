package kata;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Accumul {

  public static String accum(String input) {

    char[] charArray = input.toCharArray();

    return IntStream.range(0, charArray.length)
        .mapToObj(i -> nCopies(charArray[i], i))
        .collect(Collectors.joining("-"));
  }

  private static String nCopies(char c, int nb) {
    String stringChar = String.valueOf(c).toLowerCase();
    return Stream.concat(Stream.of(stringChar.toUpperCase()), Collections.nCopies(nb, stringChar).stream())
        .collect(Collectors.joining(""));

  }
}
