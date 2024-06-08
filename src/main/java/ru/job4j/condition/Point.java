package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double result = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(1, 0, 5, 2);
        System.out.println("result (1, 0) to (5, 2) " + result);
        result = Point.distance(-3, 2, 4, 5);
        System.out.println("result (-3, 2) to (4, 5) " + result);
        result = Point.distance(10, 1, 2, 3);
        System.out.println("result (10, 1) to (2, 3) " + result);
        result = Point.distance(-5, 9, 1, 4);
        System.out.println("result (-5, 9) to (1, 4) " + result);
        
    }
}
