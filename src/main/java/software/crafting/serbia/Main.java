package software.crafting.serbia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    final Calculator calculator = new Calculator();

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String amount = reader.readLine();
    String price = reader.readLine();
    String tax = reader.readLine();

    final String output = calculator.calculate(amount, price, tax);

    System.out.println(output);

  }

}