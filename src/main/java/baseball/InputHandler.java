package baseball;

public class InputHandler {
    public static boolean isValidReceivedNum(int receivedNum) {
        try {
            if(receivedNum < 100 || receivedNum > 999) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return true;
    }

    public static boolean isValidRestartNum(int restartOrNot) {
        if(restartOrNot != 1 && restartOrNot != 2) {
            throw new IllegalArgumentException();
        }
        return true;
    }
}
