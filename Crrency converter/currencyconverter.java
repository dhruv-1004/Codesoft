import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class currencyconverter {
    public static final Map<String,Double> exchangerates= new HashMap<>();
    static{
        exchangerates.put("RUP", 83.41);
        exchangerates.put("USD", 1.00);
        exchangerates.put("EUR", 0.92);
        exchangerates.put("YEN", 153.23);
        exchangerates.put("AFG", 71.89);
    }

    public static double convert(double amount, String fcurrency, String tcurrency){
        if(!exchangerates.containsKey(tcurrency)||!exchangerates.containsKey(fcurrency)){
            throw new IllegalArgumentException("Invalid Currency code");
        }
        double amountUSD= amount/exchangerates.get(fcurrency);
        return (amountUSD)*exchangerates.get(tcurrency);
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter amount:");
       double amount=sc.nextDouble();

      System.out.println("Enter fcurrency:");
      sc.nextLine();
      String f=sc.nextLine().toUpperCase();

      System.out.println("Enter amount tcurrency:");
      String t=sc.nextLine().toUpperCase();
        try{
            amount = convert(amount, f, t);
            System.out.printf(+amount+f+t);
            }
        catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
    }
}
