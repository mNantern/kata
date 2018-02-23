package kata;

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
