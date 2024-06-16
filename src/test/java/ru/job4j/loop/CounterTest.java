package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenStartIs0FinishIs10SumIs55() {
        int start = 0;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 55;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartIs3FinishIs8SumIs33() {
        int start = 3;
        int finish = 8;
        int result = Counter.sum(start, finish);
        int expected = 33;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartIs1FinishIs1SumIs1() {
        int start = 1;
        int finish = 1;
        int result = Counter.sum(start, finish);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartIsMinus10FinishIs10SumIs0() {
        int start = -10;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartIsMinus5FinishIs0SumIsMinus15() {
        int start = -5;
        int finish = 0;
        int result = Counter.sum(start, finish);
        int expected = -15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartIsMinus20FinishIsMinus10SumIsMinus165() {
        int start = -20;
        int finish = -10;
        int result = Counter.sum(start, finish);
        int expected = -165;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartIs100FinishIs0SumIs0() {
        int start = 100;
        int finish = 0;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusTenToTenThenZero() {
        int start = -10;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusTenToMinusFiveThenMinusTwentyFour() {
        int start = -10;
        int finish = -5;
        int result = Counter.sumByEven(start, finish);
        int expected = -24;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToOneThenZero() {
        int start = 1;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromTenToOneThenZero() {
        int start = 10;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}