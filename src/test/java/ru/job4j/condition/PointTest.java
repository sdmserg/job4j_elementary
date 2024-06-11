package ru.job4j.condition;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PointTest {

    @Test
    void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when10To52Then4Dot4721() {
        int x1 = 1;
        int y1 = 0;
        int x2 = 5;
        int y2 = 2;
        double expected = 4.4721;
        double output = Point.distance(x1, y1, x2, y2);
        double delta = 0.0001;
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }

    @Test
    void whenMinus32To45Then7Dot6157() {
        int x1 = -3;
        int y1 = 2;
        int x2 = 4;
        int y2 = 5;
        double expected = 7.6157;
        double output = Point.distance(x1, y1, x2, y2);
        double delta = 0.0001;
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }

    @Test
    void when101To23Then8Dot2462() {
        int x1 = 10;
        int y1 = 1;
        int x2 = 2;
        int y2 = 3;
        double expected = 8.2462;
        double output = Point.distance(x1, y1, x2, y2);
        double delta = 0.0001;
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }

    @Test
    void whenMinus59To14Then7Dot8102() {
        int x1 = -5;
        int y1 = 9;
        int x2 = 1;
        int y2 = 4;
        double expected = 7.8102;
        double output = Point.distance(x1, y1, x2, y2);
        double delta = 0.0001;
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }
}