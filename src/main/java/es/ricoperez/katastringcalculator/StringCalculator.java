package es.ricoperez.katastringcalculator;

public class StringCalculator {
    public Integer sum(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] numbers = input.split(",");

        int sum = 0;
        for (String number : numbers) {
            if (number.matches("[0-9]+")) {
                sum += Integer.parseInt(number);
            }
        }

        return sum;
    }
}
