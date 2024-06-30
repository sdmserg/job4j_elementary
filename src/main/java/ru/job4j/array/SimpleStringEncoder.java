package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 0; i < input.length(); i++) {
            if ((i + 1) < input.length() && input.charAt(i + 1) == symbol) {
                counter++;
            } else if ((i + 1) == input.length()) {
                result = counter > 1 ? result + symbol + counter : result + symbol;
            } else {
                result = counter > 1 ? (result + symbol + counter) : (result + symbol);
                symbol = input.charAt(i + 1);
                counter = 1;
            }
        }
        return result;
    }
}
