package software.crafting.serbia;

public class Calculator {

  private static final double UTAH_TAX_RATE = 1.0685;

  public String calculate(String amountString, String priceString, String tax) {
    final int amount = Integer.parseInt(amountString);
    final double price = Double.parseDouble(priceString);

    final double totalPrice = amount * price;
    final double finalPrice = totalPrice * discountFor(totalPrice) * taxFor(tax);

    return String.format("$%.2f", finalPrice);
  }

  private double taxFor(String tax) {
    if (tax != null && !tax.isBlank()) {
      return 1 + Double.parseDouble(tax) / 100;
    }
    return UTAH_TAX_RATE;
  }

  private double discountFor(double price) {
    if (price > 50000) {
      return 1 - 0.15;
    }
    if (price > 10000) {
      return 1 - 0.10;
    }
    if (price > 7000) {
      return 1 - 0.07;
    }
    if (price > 5000) {
      return 1 - 0.05;
    }
    if (price > 1000) {
      return 1 - 0.03;
    }
    return 1;
  }
}
