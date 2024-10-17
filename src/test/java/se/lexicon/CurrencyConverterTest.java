package se.lexicon;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyConverterTest {

    @Test
    void testCurrencyConversion() {
        double amount=8.90;
        double conversionRate=10.4;
        double expected=92.56;
        assertEquals(expected,CurrencyConverter.conversion(8.90,10.4));
    }

    @Test
    void testCurrencyConversionFails(){
        double amount=8;
        double conversionRate=10.4;
        double expected=82;
        assertNotEquals(expected,CurrencyConverter.conversion(8,10.4));
    }

}