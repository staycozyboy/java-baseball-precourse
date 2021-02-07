package utils;

import java.util.Set;
import java.util.stream.Collectors;


public class ValidationUtils {
    private static final int DECIMAL = 10;
    private static final int OUTRANGED = 0;

    private ValidationUtils() {
    }

    public static boolean isInRange(int number) {
        while (number > 0) {
            int digit = number % DECIMAL;
            if (digit == OUTRANGED) {
                return false;
            }
            number /= DECIMAL;
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
