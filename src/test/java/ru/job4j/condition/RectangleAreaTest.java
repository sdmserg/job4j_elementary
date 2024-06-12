package ru.job4j.condition;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RectangleAreaTest {

    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP4K1Square1() {
        int expected = 1;
        int p = 4;
        double k = 1;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenP9K7Square2Dot2148() {
        double expected = 2.2148;
        int p = 9;
        double  k = 7;
        double output = RectangleArea.square(p, k);
        double delta = 0.0001;
        assertThat(output).isEqualTo(expected, withPrecision(delta));
    }
}