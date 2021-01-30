package baseball;
import java.util.Scanner;

public class User {
    Scanner scanner = new Scanner(System.in);

    public void play(Computer computer, int randomNum) {
        while (true) {
            computer.printPlaying();
            int receivedNum = computer.filterReceivedNum(scanner.nextInt());

            String randomNumStr = Integer.toString(randomNum);
            String receivedNumStr = Integer.toString(receivedNum);

            computer.printCount(randomNumStr, receivedNumStr);

            if (computer.getStrikeCount(randomNumStr, receivedNumStr) == 3) {
                computer.printEndGame();
                break;
            }
        }
    }
}
