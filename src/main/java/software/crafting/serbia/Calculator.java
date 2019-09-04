package software.crafting.serbia;

public class Calculator {

  private static final double UTAH_TAX_RATE = 1.0685;

  public String calculate(String amountString, String priceString) {
    final int amount = Integer.parseInt(amountString);
    final double price = Double.parseDouble(priceString);

    final double totalPrice = amount * price;
    final double finalPrice = totalPrice * discountFor(totalPrice) * UTAH_TAX_RATE;

    return String.format("$%.2f", finalPrice);
  }

  private double discountFor(double price) {
    if (price > 1000) {
      return 1 - 0.03;
    }
    return 1;
  }
}
