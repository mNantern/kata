package kata;

public class FizzBuzz {

  public static String fizzBuzz(int input) {

    String result;

    if (input % 15 == 0) {
      result = "fizzbuzz";
    } else if (input % 3 == 0) {
      result = "fizz";
    } else if (input % 5 == 0) {
      result = "buzz";
    } else {
      result = Integer.toString(input);
    }

    return result;
  }
}
