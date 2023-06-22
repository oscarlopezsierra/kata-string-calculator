package es.ricoperez.katastringcalculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {

    @Test
    void should_return_0_when_input_is_null_or_empty() {
        StringCalculator calculator = new StringCalculator();
        assertThat(calculator.sum(null)).isEqualTo(0);
        assertThat(calculator.sum("")).isEqualTo(0);
    }

    @Test
    void should_return_the_same_number_when_input_is_a_single_number() {
        StringCalculator calculator = new StringCalculator();
        assertThat(calculator.sum("1")).isEqualTo(1);
    }
}
