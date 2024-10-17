package se.lexicon.utils;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CurrencyConversionUtilTest {
    @Test
    void testCurrentDate(){
        String date="2024-10-17";
        LocalDate currentDate=LocalDate.parse(date);
        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd MMMM,yyyy");
        String expectedDate=currentDate.format(format);
        assertEquals(expectedDate, CurrencyConversionUtil.currentDate());
    }


    @Test
    void testCurrentDateFail(){
        String expectedFormatdate="2024-10-17";
        assertNotEquals(expectedFormatdate, CurrencyConversionUtil.currentDate());
    }


    @Test
    void testCurrentTime(){
        LocalTime time=LocalTime.now();
        DateTimeFormatter formattedTime=DateTimeFormatter.ofPattern("hh:mm a");
        String expectedTime= formattedTime.format(time);
        assertEquals(expectedTime,CurrencyConversionUtil.currentTime());
    }

    @Test
    void testCurrentTimeFail(){
        String expectedTimeFormat= "20:30 pm";
        assertNotEquals(expectedTimeFormat,CurrencyConversionUtil.currentTime());
    }

}
