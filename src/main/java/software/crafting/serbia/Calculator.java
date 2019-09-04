package software.crafting.serbia;

public class Calculator {

  private static final double UTAH_TAX_RATE = 1.0685;

  public String calculate(String amountString, String priceString) {
    final int amount = Integer.parseInt(amountString);
    final double price = Double.parseDouble(priceString);

    final double result = amount * price * UTAH_TAX_RATE;

    return String.format("$%.2f", result);
  }
}
