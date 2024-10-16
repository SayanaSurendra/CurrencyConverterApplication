package se.lexicon;

import se.lexicon.constants.CurrencyRateConstants;
import se.lexicon.utils.CurrencyConversionUtil;
import java.util.Locale;
import java.util.Scanner;

public class ConsoleConverter {

    static void runConverter(){
       CurrencyConversionUtil. displayMenu();
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
                System.out.println(sek+" SEK = "+CurrencyConversionUtil.currencyFormat(usdAmount)+" USD"+ " as on "+CurrencyConversionUtil.cuurentDate()+" "+CurrencyConversionUtil.currentTime());
                break;

            case 2:
                System.out.println("Enter USD amount to be converted to SEK : ");
                double usd= in.nextDouble();
                double sekAmount=CurrencyConverter.conversion(usd, CurrencyRateConstants.USD_TO_SEK_RATE);
                System.out.println(usd+" USD = "+CurrencyConversionUtil.currencyFormat(sekAmount)+" SEK"+ " as on "+CurrencyConversionUtil.cuurentDate()+" "+CurrencyConversionUtil.currentTime());
                break;

            case 3:
                System.out.println("Enter SEK amount to be converted to Euro : ");
                double sekEuro= in.nextDouble();
                double sekEuroAmount=CurrencyConverter.conversion(sekEuro, CurrencyRateConstants.SEK_TO_EURO_RATE);
                System.out.println(sekEuro+" SEK = "+CurrencyConversionUtil.currencyFormat(sekEuroAmount)+" EUR"+ " as on "+CurrencyConversionUtil.cuurentDate()+" "+CurrencyConversionUtil.currentTime() );
                break;

            case 4:
                System.out.println("Enter Euro amount to be converted to SEK : ");
                double euroAmount= in.nextDouble();
                double euroSekAmount=CurrencyConverter.conversion(euroAmount, CurrencyRateConstants.EURO_TO_SEK_RATE);
                System.out.println(euroAmount+" EUR = "+CurrencyConversionUtil.currencyFormat(euroSekAmount)+" SEK"+ " as on "+CurrencyConversionUtil.cuurentDate()+" "+CurrencyConversionUtil.currentTime());
                break;

            case 0:
                break;

            default:
                System.out.println("Please enter the amount to be converted");
                break;
        }
    }




}
