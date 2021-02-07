package baseball;

import java.util.Scanner;
import baseball.BaseballProgramController;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행
        try{
            BaseballProgramController.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
