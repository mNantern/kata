package kata;

/**
 * https://www.codewars.com/kata/56747fd5cb988479af000028
 *
 * You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.
 *
 * runBF("test\0") should return "es"
 * runBF("testing\0") should return "t"
 * runBF("middle\0") should return "dd"
 * runBF("A\0") should return "A"
 *
 * A word (string) of length 0 < str < 200 For BF, all the input strings end with "\0". You do not need to test for this. This is only here to tell you that you do not need to worry about your solution timing out.
 *
 * The middle character(s) of the word represented as a string.
 */
public class MiddleChar {

  public static String getMiddle(String input) {
    int size = input.length();
    if (size % 2 == 0 ) {
      int div = (size - 2) / 2;
      return input.substring(div,div + 2);
    } else {
      int div = (size - 1) / 2;
      return input.substring(div,div + 1);
    }
  }
}
