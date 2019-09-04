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
    String output = calculator.calculate(amount, price, "");

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
    String output = calculator.calculate(amount, price, "");

    // Then
    assertThat(output)
        .isEqualTo("$1041.63");

  }

  @Test
  public void shouldMultiplyAmountAndPriceAndAddTaxForInput() {
    // Given
    String amount = "10";
    String price = "10";
    String tax = "1";

    // When
    String output = calculator.calculate(amount, price, tax);

    // Then
    assertThat(output)
        .isEqualTo("$101.00");

  }

  @Test
  public void shouldMultiplyAmountAndPriceAndIncludeDiscountAndAddTaxForInput() {
    // Given
    String amount = "10";
    String price = "200";
    String tax = "1";

    // When
    String output = calculator.calculate(amount, price, tax);

    // Then
    assertThat(output)
        .isEqualTo("$1959.40");

  }

}
