package baseball;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        try {
            GameLogic.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
