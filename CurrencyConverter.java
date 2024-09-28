import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {

    private static final Map<String, Double> exchangeRates = new HashMap<>();

    static {
        exchangeRates.put("USD_TO_INR", 74.85);
        exchangeRates.put("EUR_TO_INR", 87.53);
        exchangeRates.put("GBP_TO_INR", 102.45);
        exchangeRates.put("INR_TO_USD", 0.013);
        exchangeRates.put("EUR_TO_USD", 1.18);
        exchangeRates.put("GBP_TO_USD", 1.37);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Currency Converter!");
        System.out.print("Enter the base currency (e.g., USD, INR, EUR): ");
        String baseCurrency = scanner.next().toUpperCase();
        System.out.print("Enter the target currency (e.g., USD, INR, EUR): ");
        String targetCurrency = scanner.next().toUpperCase();
        String currencyPair = baseCurrency + "_TO_" + targetCurrency;
        if (!exchangeRates.containsKey(currencyPair)) {
            System.out.println("Sorry, this currency pair is not available.");
            return;
        }
        System.out.print("Enter the amount in " + baseCurrency + ": ");
        double amount = scanner.nextDouble();
        double exchangeRate = exchangeRates.get(currencyPair);
        double convertedAmount = amount * exchangeRate;
        System.out.printf("Converted Amount: %.2f %s\n", convertedAmount, targetCurrency);
    }
}
