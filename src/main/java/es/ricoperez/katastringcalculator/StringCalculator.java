package es.ricoperez.katastringcalculator;

public class StringCalculator {
    public Integer sum(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }
        return Integer.valueOf(input);
    }
}
