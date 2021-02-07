package baseball;

public class NumberComparator {
    private static final int NUMBER_LENGTH = 3;
    private NumberComparator() {
    }

    public static int[] compare(String randomNumber, String userInput) {
        int[] result = {0, 0};
        for (int i = 0; i < NUMBER_LENGTH; i++) {
            for (int j = 0; j < NUMBER_LENGTH; j++)
                if (randomNumber.charAt(i) == userInput.charAt(j)) {
                    result[1]++;
                }
        }

        for (int i = 0; i < NUMBER_LENGTH; i++) {
            if (randomNumber.charAt(i) == userInput.charAt(i)) {
                result[0]++;
            }
        }

        result[1] -= result[0];
        return result;
    }

    public static int[] compare(int randomNumber, int userInput) {
        return compare(Integer.toString(randomNumber), Integer.toString(userInput));
    }
}
