package software.crafting.serbia;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

  private Calculator calculator = new Calculator();

  @Test
  public void shouldMultiplyAmountAndPriceAndAddTax() {
    // Given
    String amount = "5";
    String price = "1.2";

    // When
    String output = calculator.calculate(amount, price);

    // Then
    assertThat(output)
        .isEqualTo("$6.41");

  }

  @Test
  public void shouldMultiplyAmountAndPriceAndIncludeDiscountAndAddTax() {
    // Given
    String amount = "5";
    String price = "201";

    // When
    String output = calculator.calculate(amount, price);

    // Then
    assertThat(output)
        .isEqualTo("$1041.63");

  }

}
