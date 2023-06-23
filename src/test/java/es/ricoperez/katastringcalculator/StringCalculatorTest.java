package es.ricoperez.katastringcalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {

    StringCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new StringCalculator();
    }

    @Test
    void should_return_0_when_input_is_null_or_empty() {
        assertThat(calculator.sum(null)).isEqualTo(0);
        assertThat(calculator.sum("")).isEqualTo(0);
    }

    @Test
    void should_return_the_same_number_when_input_is_a_single_number() {
        assertThat(calculator.sum("1")).isEqualTo(1);
    }

    @Test
    void should_return_the_sum_of_two_or_more_numbers_when_input_is_two_or_more_numbers_separated_by_commas() {
        assertThat(calculator.sum("1,2")).isEqualTo(3);
        assertThat(calculator.sum("1,2,3")).isEqualTo(6);
    }

    @Test
    void should_ignore_elements_that_arent_numbers() {
        assertThat(calculator.sum("1,a,2")).isEqualTo(3);
        assertThat(calculator.sum("1,2,b,3,12a")).isEqualTo(6);
        assertThat(calculator.sum("1,2,b,3,a12,4")).isEqualTo(10);
    }
}
