package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {

    @Test
    void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSortArrayWith3Elements() {
        int[] data = new int[] {9, 3, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {3, 8, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSortArrayWith5Elements() {
        int[] data = new int[] {10, 8, 1, 3, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 3, 8, 10};
        assertThat(result).containsExactly(expected);
    }
}