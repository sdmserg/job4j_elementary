package ru.job4j.loop;

public class Factorial {

    public static int calculate(int number) {
        int result = 1;
        if (number != 0) {
            for (int index = 1; index <= number; index++) {
                result *= index;
            }
        }
        return result;
    }
}
