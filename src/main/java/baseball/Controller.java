package baseball;

import java.util.Scanner;

public class Controller {
    private static int START = 1;
    private static int END = 2;
    private static int MAX_COUNT = 3;
    public static boolean GAMEOVER = false;     //캡슐화깨고 전역으로 게임종료에 대한 정보 받는다.


    public static void restartOrNot() {
        Scanner scanner = new Scanner(System.in);
        OutputHandler.printEnd();
        int n = scanner.nextInt();

        try {
            InputHandler.isVaildRestartNum(n);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        if(n == START) {
            GameLogic.run();
        } else if(n == END) {
            Controller.stop();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static boolean isThreeStrike(int random, int receivedNum) {
        Computer computer = Computer.getInstance();

        if (computer.getStrikeCount(random, receivedNum) == MAX_COUNT){
            return true;
        } else {
            return false;
        }
    }

    public static void stop() {
        GAMEOVER = true;
    }
}
