package ru.job4j.condition;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PointTest {

    @Test
    void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when10To52Then4Dot4721() {
        Point a = new Point(1, 0);
        Point b = new Point(5, 2);
        double expected = 4.4721;
        double output = a.distance(b);
        double delta = 0.0001;
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }

    @Test
    void whenMinus32To45Then7Dot6157() {
        Point a = new Point(-3, 2);
        Point b = new Point(4, 5);
        double expected = 7.6157;
        double output = a.distance(b);
        double delta = 0.0001;
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }

    @Test
    void when101To23Then8Dot2462() {
        Point a = new Point(10, 1);
        Point b = new Point(2, 3);
        double expected = 8.2462;
        double output = a.distance(b);
        double delta = 0.0001;
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }

    @Test
    void whenMinus59To14Then7Dot8102() {
        Point a = new Point(-5, 9);
        Point b = new Point(1, 4);
        double expected = 7.8102;
        double output = a.distance(b);
        double delta = 0.0001;
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }
}