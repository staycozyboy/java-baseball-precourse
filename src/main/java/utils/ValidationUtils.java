package utils;

public class ValidationUtils {
    private static final int NUMBER_LIMIT = 3;
    private static final int START = 1;
    private static final int END = 9;

    private ValidationUtils() {
    }

    /**
     * 숫자가 유효한지 확인하는 메서드
     * @param number 숫자
     * @throws IllegalArgumentException 숫자의 길이가 3이 아니거나, 숫자가 아니거나, 중복되면 발생
     */
    public static boolean isValidateNumber(String number) throws IllegalArgumentException {
        return isRightLength(number) && isRightValue(number) && isDuplicated(number);
    }

    /**
     * 숫자가 유효한지 확인하는 메서드
     * @param number 숫자
     * @throws IllegalArgumentException 숫자가 1또는 2가 아닐때 발생
     */
    public static boolean isValidateNumber(int number) throws IllegalArgumentException {
        if (number == 1 || number == 2) {
            return true;
        }
        throw new IllegalArgumentException("잘못된 입력값입니다.");
    }

    private static boolean isRightLength(String number) {
        if (number.length() != NUMBER_LIMIT) {
            throw new IllegalArgumentException("숫자는 3자리여야 합니다.");
        }
        return true;
    }

    private static boolean isRightValue(String number) {
        for (int i = 0; i < NUMBER_LIMIT; i++) {
            if ((number.charAt(i) - 48) < START || (number.charAt(i) - 48) > END) {
                throw new IllegalArgumentException("숫자만 입력 가능합니다.");
            }
        }
        return true;
    }

    private static boolean isDuplicated(String number) {
        for (int i = 0; i < NUMBER_LIMIT - 1; i++) {
            if (number.charAt(i) == number.charAt(i+1)) {
                throw new IllegalArgumentException("중복된 숫자가 있습니다.");
            }
        }// 1번째 - 2번째, 2번째 - 3번째 같은지 비교
        if (number.charAt(0) == number.charAt(2)) {
            throw new IllegalArgumentException("중복된 숫자가 있습니다.");
        }// 1번째 - 3번째 같은지 비교
        return true;
    }
}
