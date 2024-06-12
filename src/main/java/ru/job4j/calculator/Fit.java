package ru.job4j.calculator;

public class Fit {

    public static double calculateWeight(int height, boolean isMan) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be greater than 0");
        }
        int base = isMan ? 100 : 110;
        return (height - base) * 1.15;
    }

    public static void main(String[] args) {
        int heightMan = 187;
        int heightWoman = 170;
        double man = Fit.calculateWeight(heightMan, true);
        double woman = Fit.calculateWeight(heightWoman, false);
        System.out.println(String.format("Man %d cm is %.2f kg", heightMan, man));
        System.out.println(String.format("Woman %d cm is %.2f kg", heightWoman, woman));
    }
}
