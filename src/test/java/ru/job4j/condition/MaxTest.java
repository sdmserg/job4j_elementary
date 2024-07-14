package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To3Then5() {
        int left = 5;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To9Then9() {
        int left = 2;
        int right = 9;
        int result = Max.max(left, right);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax7To7Then7() {
        int left = 7;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax0To7To5Then7() {
        int first = 0;
        int second = 7;
        int third = 5;
        int result = Max.max(first, second, third);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMinus3ToMinus5ToMinus6ThenMinus3() {
        int first = -3;
        int second = -5;
        int third = -6;
        int result = Max.max(first, second, third);
        int expected = -3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMinus7To1To5Then5() {
        int first = -7;
        int second = 1;
        int third = 5;
        int result = Max.max(first, second, third);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    public void whenMinus7To0To0Then0() {
        int first = -7;
        int second = 0;
        int third = 0;
        int result = Max.max(first, second, third);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMinus7ToMinus3ToMinus5ToMinus1ThenMinus1() {
        int first = -7;
        int second = -3;
        int third = -5;
        int fourth = -1;
        int result = Max.max(first, second, third, fourth);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMinus7To1To5ToMinus5Then5() {
        int first = -7;
        int second = 1;
        int third = 5;
        int fourth = -5;
        int result = Max.max(first, second, third, fourth);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMinus7To0To0To0Then0() {
        int first = -7;
        int second = 0;
        int third = 0;
        int fourth = 0;
        int result = Max.max(first, second, third, fourth);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}