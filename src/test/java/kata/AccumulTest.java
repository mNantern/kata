package kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AccumulTest {


  @Test
  void accum_uppercase_first_char() {
    // Given
    String input = "a";

    // When
    String result = Accumul.accum(input);

    // Then
    assertThat(result).isEqualTo("A");
  }

  @Test
  void accum_test_abcd() {
    // Given
    String input = "abcd";

    // When
    String result = Accumul.accum(input);

    // Then
    assertThat(result).isEqualTo("A-Bb-Ccc-Dddd");
  }

  @Test
  void accum_test_RqaEzty() {
    // Given
    String input = "RqaEzty";

    // When
    String result = Accumul.accum(input);

    // Then
    assertThat(result).isEqualTo("R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy");
  }

  @Test
  void accum_test_cwAt() {
    // Given
    String input = "cwAt";

    // When
    String result = Accumul.accum(input);

    // Then
    assertThat(result).isEqualTo("C-Ww-Aaa-Tttt");
  }

}
