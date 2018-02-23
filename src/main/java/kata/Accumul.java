package kata;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * https://www.codewars.com/kata/5667e8f4e3f572a8f2000039
 * This time no story, no theory. The examples below show you how to write function accum:
 * accum("abcd")    # "A-Bb-Ccc-Dddd"
 * accum("RqaEzty") # "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * accum("cwAt")    # "C-Ww-Aaa-Tttt"
 *
 * The parameter of accum is a string which includes only letters from a..z and A..Z.
 */

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
