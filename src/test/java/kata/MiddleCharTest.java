package kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MiddleCharTest {

  @Test
  void runBF_should_return_A_with_input_A() {
    // Given
    String input = "A";

    // When
    String result = MiddleChar.getMiddle(input);

    // Then
    assertThat(result).isEqualTo(input);
  }

  @Test
  void runBF_should_return_t_with_input_testing() {
    // Given
    String input = "testing";

    // When
    String result = MiddleChar.getMiddle(input);

    // Then
    assertThat(result).isEqualTo("t");
  }


  @Test
  void runBF_should_return_es_with_input_test() {
    // Given
    String input = "test";

    // When
    String result = MiddleChar.getMiddle(input);

    // Then
    assertThat(result).isEqualTo("es");
  }

  @Test
  void runBF_should_return_dd_with_input_middle() {
    // Given
    String input = "middle";

    // When
    String result = MiddleChar.getMiddle(input);

    // Then
    assertThat(result).isEqualTo("dd");
  }
}
