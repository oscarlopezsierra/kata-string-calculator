package es.ricoperez.katastringcalculator;

public class StringCalculator {
    public Integer sumOf(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        if (input.startsWith("//") && input.length() > 4 && input.charAt(3) == '/') {
            String character = input.substring(2, 3);
            if (!Character.isDigit(character.charAt(0))) {
                input = input.substring(4);
                input = input.replace(character, ",");
            }
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
