package es.ricoperez.katastringcalculator;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    public Integer sumOf(String input) {

        if (input == null || input.isEmpty()) {
            return 0;
        }

        String delimiter = ",";
        if (input.startsWith("//") && input.length() > 4 && input.charAt(3) == '/') {
            String character = input.substring(2, 3);
            if (!Character.isDigit(character.charAt(0))) {
                input = input.substring(4);
                delimiter = character;
            }
        }

        List<Integer> numbers = extractValues(input, delimiter);

        return numbers.stream().reduce(Integer::sum).orElse(0);

    }

    private List<Integer> extractValues(String input, String delimiter) {
        List<Integer> numbers = new ArrayList<>();
        int start = 0;
        int end = input.length();
        while (start < end) {
            int index = input.indexOf(delimiter, start);
            if (index == -1) {
                index = end;
            }
            String number = input.substring(start, index);
            if (number.matches("[0-9]+")) {
                numbers.add(Integer.parseInt(number));
            } else {
                numbers.add(0);
            }
            start = index + 1;
        }
        return numbers;
    }
}
