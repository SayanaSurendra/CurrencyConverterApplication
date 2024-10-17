package se.lexicon.utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class CurrencyConversionUtil {

    public static void displayMenu() {
        System.out.println("  Currency Converter App  ");
        System.out.println("1. Convert SEK to USD");
        System.out.println("2. Convert USD to SEK");
        System.out.println("3. Convert SEK to Euro");
        System.out.println("4. Convert Euro to SEK");
        System.out.println("0. Exit");
        System.out.println("Enter your choice:");
    }

    public static String currencyFormat(double amount) {
        NumberFormat localeAmountFormat=NumberFormat.getCurrencyInstance(Locale.US);
        DecimalFormat decimalFormat = (DecimalFormat)localeAmountFormat;
        decimalFormat.applyPattern("#,##0.00");
        String format = decimalFormat.format(amount);

        return  format;

    }

    public static String cuurentDate(){
        LocalDate dt=LocalDate.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd MMMM, yyyy");
        String formattedDate = dt.format(formatter);
        return formattedDate;

    }

    public static String currentTime(){
        LocalTime currentTime=LocalTime.now();
        DateTimeFormatter formattedTime=DateTimeFormatter.ofPattern("hh:mm a");
        String formatTime= formattedTime.format(currentTime);
        return formatTime;
    }
}
