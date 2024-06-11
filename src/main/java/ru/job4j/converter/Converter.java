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
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2. Test result : " + passed);

        input = 240;
        expected = 4;
        output = Converter.rubleToDollar(input);
        passed = expected == output;
        System.out.println("240 rubles are 4. Test result : " + passed);

        input = 100;
        expected = 85;
        output = Converter.dollarToEuro(input);
        passed = expected == output;
        System.out.println("100 dollars are 85. Test result : " + passed);

        input = 1000;
        expected = 1170;
        output = Converter.euroToDollar(input);
        passed = expected == output;
        System.out.println("1000 euro are 1170. Test result : " + passed);
    }
}
