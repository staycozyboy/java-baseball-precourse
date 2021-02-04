package baseball;

public class InputHandler {
    public static boolean isValidReceivedNum(int receivedNum) {
        isInValidRange(receivedNum);
        isNonDuplicated(receivedNum);

        return true;
    }

    public static void isInValidRange(int receivedNum) {
        if (Integer.toString(receivedNum).length() != 3) {
            throw new IllegalArgumentException();
        }
    }

    public static void isNonDuplicated(int receivedNum) {
        String numStr = Integer.toString(receivedNum);

        if (numStr.charAt(0) == numStr.charAt(1) || numStr.charAt(0) == numStr.charAt(2)
                || numStr.charAt(1) == numStr.charAt(2)) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean isValidRestartNum(int restartOrNot) {
        if(restartOrNot != 1 && restartOrNot != 2) {
            throw new IllegalArgumentException();
        }
        return true;
    }
}
