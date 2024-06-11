package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RblThen2Euro() {
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertEquals(expected, output, value);
    }

    @Test
    void whenConvert240RblThen4Dollars() {
        float input = 240;
        float expected = 4;
        float output = Converter.rubleToDollar(input);
        float value = 0.0001f;
        assertEquals(expected, output, value);
    }

    @Test
    void whenConvert100DollarsThen85Euro() {
        float input = 100;
        float expected = 85;
        float output = Converter.dollarToEuro(input);
        float value = 0.0001f;
        assertEquals(expected, output, value);
    }

    @Test
    void whenConvert1000EuroThen1170Dollars() {
        float input = 1000;
        float expected = 1170;
        float output = Converter.euroToDollar(input);
        float value = 0.0001f;
        assertEquals(expected, output, value);
    }
}