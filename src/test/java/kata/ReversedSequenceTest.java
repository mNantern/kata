package kata;

import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;

class ReversedSequenceTest {

  @Test
  void reverse_negative_n() {
    // Given
    int input = -1;

    // When
    assertThatExceptionOfType(InvalidParameterException.class).isThrownBy(() -> ReversedSequence.reverse(input))
        .withMessage("input must not be negative");

    //Then
  }

  @Test
  void reverse() {
    // Given
    int input = 5;

    // When
    Collection output = ReversedSequence.reverse(input);

    // Then
    assertThat(output).containsExactly(5,4,3,2,1);
  }
}
