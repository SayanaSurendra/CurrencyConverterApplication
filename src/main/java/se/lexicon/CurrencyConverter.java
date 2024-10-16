package se.lexicon;

public class CurrencyConverter {

    public static double conversion(double amount, double conversionRate) {
      if (amount>0){
          amount=amount *conversionRate;
          System.out.println("amount = " + amount);
      }else{
          System.out.println("Please enter a valid amount");
      }
        return amount;
    }
}
