package se.lexicon.utils;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

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
        DecimalFormat decimalFormat = new DecimalFormat(("#,##0.00"));
        return decimalFormat.format(amount);

    }

    public static String currentDate(){
        LocalDate date=LocalDate.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd MMMM,yyyy");
        return date.format(formatter);

    }

    public static String currentTime(){
        LocalTime currentTime=LocalTime.now();
        DateTimeFormatter formattedTime=DateTimeFormatter.ofPattern("hh:mm a");
        return formattedTime.format(currentTime);
    }
}
