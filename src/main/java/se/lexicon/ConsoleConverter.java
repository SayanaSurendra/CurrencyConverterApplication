package se.lexicon;

import se.lexicon.constants.CurrencyRateConstants;
import se.lexicon.utils.CurrencyConversionUtil;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleConverter {

    static void runConverter(){
        CurrencyConversionUtil. displayMenu();
        Scanner in= new Scanner(System.in);
        int choice=in.nextInt();
        System.out.println("Enter the amount to be converted  : ");
        //
        try {
            double amt=in.nextDouble();
            if(inputValidation(amt)) {
                doConversion(choice, amt);
            }else{
                System.out.println("==Please enter a valid amount==");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid amount.Please specify valid amount");
        }


    }

    public static void doConversion(int choice, double amount) {
        switch (choice){
            case 1:
                double usdAmount=CurrencyConverter.conversion(amount, CurrencyRateConstants.SEK_TO_USD_RATE);
                displayConversionResults(amount,usdAmount,CurrencyRateConstants.SEK,CurrencyRateConstants.USD);
                break;

            case 2:
                double sekAmount=CurrencyConverter.conversion(amount, CurrencyRateConstants.USD_TO_SEK_RATE);
                displayConversionResults(amount, sekAmount, CurrencyRateConstants.USD, CurrencyRateConstants.SEK);
                break;

            case 3:
                double euroAmount=CurrencyConverter.conversion(amount, CurrencyRateConstants.SEK_TO_EURO_RATE);
                displayConversionResults(amount, euroAmount, CurrencyRateConstants.SEK, CurrencyRateConstants.EUR);
                break;

            case 4:
                 double euroSekAmount=CurrencyConverter.conversion(amount, CurrencyRateConstants.EURO_TO_SEK_RATE);
                displayConversionResults(amount,euroSekAmount,CurrencyRateConstants.EUR,CurrencyRateConstants.SEK);
                break;

            case 0:
                break;

            default:
                System.out.println("Please choose your choice from the menu ");
                break;
        }
    }

    private static boolean inputValidation(double amt) {
        boolean isValidAmount=false;
        if(amt > 0){
            isValidAmount=true;
        }else{
            System.out.println("Please enter a positive amount"); 
        }
        return isValidAmount;

    }

    private static void displayConversionResults(double amount, double convertedAmount, String currency, String convertedCurrency){
       System.out.println(amount+" "+currency+" = "+CurrencyConversionUtil.currencyFormat(convertedAmount)+" "+convertedCurrency+ " as on "+CurrencyConversionUtil.currentDate()+" "+CurrencyConversionUtil.currentTime());
    }


}
