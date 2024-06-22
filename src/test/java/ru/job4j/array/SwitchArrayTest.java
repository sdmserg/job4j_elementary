package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {

    @Test
    void whenSwapBorderArrayLengthIs4() {
        int[] input = {1, 2, 3, 4};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs6() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {6, 2, 3, 4, 5, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs3() {
        int[] input = {1, 2, 3};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {3, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs1() {
        int[] input = {1};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int destination = input.length - 1;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap4to6() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int source = 4;
        int destination = 6;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1, 2, 3, 4, 7, 6, 5, 8, 9, 10};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap7to2() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int source = 7;
        int destination = 2;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1, 2, 8, 4, 5, 6, 7, 3, 9, 10};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap5to6() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int source = 5;
        int destination = 6;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1, 2, 3, 4, 5, 7, 6, 8, 9, 10};
        assertThat(result).containsExactly(expected);
    }
}