package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    public void whenExceptionIsFalse() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Factorial.calc(-1);
                });
        assertThat(exception.getMessage()).isEqualTo("Number could not be less than 0");
    }
    @Test
    public void whenException() {
        int start = 5;
        int expected = 120;
        int result = Factorial.calc(start);
        assertThat(result).isEqualTo(expected);
    }

}