package kata;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FizzBuzzTest {

  @Test
  void fizzBuzz_no_requierement_fulfilled() {
    // Given
    int input = 2;

    // When
    String result = FizzBuzz.fizzBuzz(input);

    // Then
    assertThat(result).isEqualTo(Integer.toString(input));
  }

  @Test
  void fizzBuzz_dividable_by_3() {
    // Given
    int input = 3;

    // When
    String result = FizzBuzz.fizzBuzz(input);

    // Then
    assertThat(result).isEqualTo("fizz");
  }

  @Test
  void fizzBuzz_dividable_by_5() {
    // Given
    int input = 5;

    // When
    String result = FizzBuzz.fizzBuzz(input);

    // Then
    assertThat(result).isEqualTo("buzz");
  }

  @Test
  void fizzBuzz_dividable_by_15() {
    // Given
    int input = 15;

    // When
    String result = FizzBuzz.fizzBuzz(input);

    // Then
    assertThat(result).isEqualTo("fizzbuzz");
  }
}
