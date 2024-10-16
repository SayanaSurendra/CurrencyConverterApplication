package se.lexicon;

import se.lexicon.constants.CurrencyRateConstants;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ConsoleConverter {

    static void runConverter(){
        displayMenu();
        Scanner in= new Scanner(System.in).useLocale(Locale.US);
        int choice=in.nextInt();
        doConversion(choice,in);


    }

    public static void doConversion(int choice,Scanner in) {
        switch (choice){
            case 1:
                System.out.println("Enter SEK amount to be converted to USD : ");
                double sek= in.nextDouble();
                double usdAmount=CurrencyConverter.conversion(sek, CurrencyRateConstants.SEK_TO_USD_RATE);
                System.out.println(sek+" SEK = "+currencyFormat(usdAmount)+" USD");
                break;

            case 2:
                System.out.println("Enter USD amount to be converted to SEK : ");
                double usd= in.nextDouble();
                double sekAmount=CurrencyConverter.conversion(usd, CurrencyRateConstants.USD_TO_SEK_RATE);
                System.out.println(usd+" USD = "+currencyFormat(sekAmount)+" SEK");
                break;

            case 3:
                System.out.println("Enter SEK amount to be converted to Euro : ");
                double sekEuro= in.nextDouble();
                double sekEuroAmount=CurrencyConverter.conversion(sekEuro, CurrencyRateConstants.SEK_TO_EURO_RATE);
                System.out.println(sekEuro+" SEK = "+currencyFormat(sekEuroAmount)+" EUR" );
                break;

            case 4:
                System.out.println("Enter Euro amount to be converted to SEK : ");
                double euroAmount= in.nextDouble();
                double euroSekAmount=CurrencyConverter.conversion(euroAmount, CurrencyRateConstants.SEK_TO_EURO_RATE);
                System.out.println(euroAmount+" SEK = "+currencyFormat(euroSekAmount)+" EUR");
                break;

            case 0:
                break;

            default:
                System.out.println("Please enter the amount to be converted");
                break;
        }
    }

    private static String currencyFormat(double amount) {
        NumberFormat localeAmountFormat=NumberFormat.getCurrencyInstance(Locale.US);
        DecimalFormat decimalFormat = (DecimalFormat)localeAmountFormat;
        decimalFormat.applyPattern("#,##0.00");
        String format = decimalFormat.format(amount);

         return  format;

    }

    private static void displayMenu() {
        System.out.println("  Currency Converter App  ");
        System.out.println("1. Convert SEK to USD");
        System.out.println("2. Convert USD to SEK");
        System.out.println("3. Convert SEK to Euro");
        System.out.println("4. Convert Euro to SEK");
        System.out.println("0. Exit");
        System.out.println("Enter your choice:");
    }
}
