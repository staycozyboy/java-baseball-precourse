package baseball;

public class User {
    private static boolean THREESTRIKE;
    private static final Calculator calculator = Calculator.getInstance();

    public void play(int random) {
        THREESTRIKE = false;
        do {
            int receivedNum = InputHandler.getValidReceivedNum();

            ResultPrinter.printCountingMessage(random, receivedNum);

            if(calculator.isThreeStrike(random, receivedNum) == true) {
                THREESTRIKE = true;
            }
        } while (!THREESTRIKE);
    }
}
