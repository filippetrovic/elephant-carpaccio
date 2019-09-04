package software.crafting.serbia;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

  private Calculator calculator = new Calculator();

  @Test
  public void shouldFail() {
    // Given
    String input = "5";

    // When
    String output = calculator.calculate(input);

    // Then
    assertThat(output)
        .isEqualTo("5");

  }
}
