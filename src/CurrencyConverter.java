import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[]args){
        HashMap<Integer, String> currencyCodes = new HashMap<Integer, String>();

        // Addition of the currency codes
        currencyCodes.put(1, "GBP");
        currencyCodes.put(2, "USD");
        currencyCodes.put(3, "INR");
        currencyCodes.put(4, "EUR");
        currencyCodes.put(5, "SAR");

        // fromCode is the currency denomination we are changing from
        // toCode is the currency denomination we are changing to
        // amount is the currency amount we are converting

        String fromCode, toCode;
        double amount;

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello user, please type in the currency you will like to change from");
        System.out.println("1: Great Britain Pounds (GBP) \t 2. US Dollars \t 3. Indian Rupees \t 4. European Euros \t 5. Saudi Arabian Riyal");
        fromCode = currencyCodes.get(sc.nextInt());

        System.out.println("What currency will you like to convert to?");
        System.out.println("1: Great Britain Pounds (GBP) \t 2. US Dollars \t 3. Indian Rupees \t 4. European Euros \t 5. Saudi Arabian Riyal");
        toCode = currencyCodes.get(sc.nextInt());

        System.out.println("Enter an amount to convert");
        amount = sc.nextFloat();

       // sendHttpGETRequest(fromCode, toCode, amount);

        System.out.println("Thank you for using this currency converter application");

    }
}
