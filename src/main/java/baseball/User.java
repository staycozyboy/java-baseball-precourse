package baseball;
import java.util.Scanner;

public class User {
    private static boolean THREESTRIKE;

    public void play(int random) {
        THREESTRIKE = false;
        do {
            OutputHandler.printStart();
            int receivedNum = insert();

            InputHandler.isValidReceivedNum(receivedNum);

            OutputHandler.printCount(random, receivedNum);

            if(Controller.isThreeStrike(random, receivedNum) == true) {
                THREESTRIKE = true;
            }
        } while (!THREESTRIKE);
    }

    public int insert() {
        Scanner scanner = new Scanner(System.in);
        int receivedNum = scanner.nextInt();
        return receivedNum;
    }
}
