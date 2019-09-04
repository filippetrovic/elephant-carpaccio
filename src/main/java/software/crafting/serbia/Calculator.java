package software.crafting.serbia;

public class Calculator {

  public String calculate(String amountString, String priceString) {
    final int amount = Integer.parseInt(amountString);
    final double price = Double.parseDouble(priceString);

    final double result = amount * price;

    return String.format("$%.2f", result);
  }
}
