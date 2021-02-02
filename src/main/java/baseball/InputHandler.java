package baseball;

public class InputHandler {
    public static void isVaildReceivedNum(int receivedNum) {
        try {
            if(receivedNum < 100 || receivedNum > 999) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }

    public static void isVaildRestartNum(int restartOrNot) {
        if(restartOrNot != 1 && restartOrNot != 2) {
            throw new IllegalArgumentException();
        }
    }
}
