package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static float dollarToEuro(float value) {
        float result = value * 0.85f;
        return result;
    }

    public static float euroToDollar(float value) {
        float result = value * 1.17f;
        return result;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(240);
        System.out.println("240 rubles are " + dollar + " dollars.");
        euro = Converter.dollarToEuro(100);
        System.out.println("100 dollars are " + euro + " euro.");
        dollar = Converter.euroToDollar(20);
        System.out.println("20 euro are " + dollar + " dollars.");
    }
}
