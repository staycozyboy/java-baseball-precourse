package utils;

public class ValidationUtils {
    private ValidationUtils() {
    }

    public static boolean validateDigitRange(int number) {
        while (number > 0) {
            int digit = number % 10;
            if(digit == 0) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}
