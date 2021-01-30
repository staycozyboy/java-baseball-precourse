package utils;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ValidationUtils {
    private ValidationUtils() {
    }

    public static boolean isInRange(int number) {
        while (number > 0) {
            int digit = number % 10;
            if(digit == 0) {
                return false;
            }
            number /= 10;
        }
        return true;
    }

    public static boolean isInRange(String number) {
        return isInRange(Integer.parseInt(number));
    }

    public static boolean isDuplicated(String number) {
        Set<Character> digits = number.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());

        return digits.size() != number.length();
    }

    public static boolean isDuplicated(int number) {
        return isDuplicated(Integer.toString(number));
    }


}
