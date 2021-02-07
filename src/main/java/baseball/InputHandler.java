package baseball;

import java.util.Scanner;

public class InputHandler {     //입력받는 모둔 수에 대해 try-catch문으로 예외처리
    private static final String STARTINGMESSAGE = "숫자를 입력하세요 : ";
    private static final String ENDMESSAGE = "3개의 숫자를 모두 맞히셨습니다.";
    private static final String REMESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    private static final Scanner scanner = new Scanner(System.in);

    private InputHandler() {}

    public static boolean isInValidRange(int receivedNum) {
        if (Integer.toString(receivedNum).length() != 3) {
            throw new IllegalArgumentException();
        }

        return true;
    }

    public static boolean isNonDuplicated(int receivedNum) {
        String numStr = Integer.toString(receivedNum);

        if (numStr.charAt(0) == numStr.charAt(1) || numStr.charAt(0) == numStr.charAt(2)
                || numStr.charAt(1) == numStr.charAt(2)) {
            throw new IllegalArgumentException();
        }

        return true;
    }

    public static int getValidReceivedNum() {
        int receivedNum;
        while (true) {
            System.out.print(STARTINGMESSAGE);
            receivedNum = scanner.nextInt();
            try {
                isNonDuplicated(receivedNum);
                isInValidRange(receivedNum);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                continue;
            }
            break;
        }

        return receivedNum;
    }

    public static boolean isValidRestartNum(int restartNum) {
        if(restartNum != 1 && restartNum != 2) {
            throw new IllegalArgumentException();
        }
        return true;
    }

    public static int getValidRestartNum() {
        int restartNum;
        System.out.println(ENDMESSAGE);
        while (true) {
            try {
                System.out.println(REMESSAGE);
                restartNum = scanner.nextInt();
                isValidRestartNum(restartNum);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                continue;
            }
            break;
        }

        return restartNum;
    }
}
