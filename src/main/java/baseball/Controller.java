package baseball;

import baseball.verification.InputHandler;
import baseball.verification.OutputHandler;

import java.util.Scanner;

public class Controller {
    private static int START = 1;
    private static int END = 2;
    private static int MAX_COUNT = 3;
    private static boolean GAMEOVER;

    public static int getRestartNumber() {
        Scanner scanner = new Scanner(System.in);
        OutputHandler.printEnd();
        int num = scanner.nextInt();
        return num;
    }
    public static void restartOrNot(int n) {
        InputHandler.isValidRestartNum(n);

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

    public static boolean getGAMEOVER() {
        return GAMEOVER;
    }

    public static void gameReady() {
        GAMEOVER = false;
    }
}
