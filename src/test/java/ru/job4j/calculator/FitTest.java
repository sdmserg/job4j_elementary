package ru.job4j.calculator;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FitTest {

    @Test
    void whenManHeight187ThenWeight99Dot55() {
        int height = 187;
        double expected = 100.05;
        double actual = Fit.calculateWeight(height, true);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenWomanHeight170ThenWeight69Dot0() {
        int height = 170;
        double expected = 69.0;
        double actual = Fit.calculateWeight(height, false);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenHeightIsNegativeThenThrowException() {
        int height = -150;
        assertThatThrownBy(() -> Fit.calculateWeight(height, true))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Height must be greater than 0");
    }

    @Test
    void whenHeightIsZeroThenThrowException() {
        int height = 0;
        assertThatThrownBy(() -> Fit.calculateWeight(height, true))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Height must be greater than 0");
    }
}