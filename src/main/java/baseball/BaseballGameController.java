package baseball;

import baseball.build.Number;
import baseball.io.InputHandler;
import baseball.io.OutputHandler;

public class BaseballGameController {
    private BaseballGameController() {
    }

    public static boolean run() {
        int randomNumber = new Number().getValue();
        int userInput;
        int[] result = new int[2];
        boolean terminate;
        System.out.println(String.format("정답 : %d", randomNumber));

        do {
            userInput = InputHandler.getNumber().getValue();
            result = NumberComparator.compare(randomNumber, userInput);
            OutputHandler.printResult(result[0], result[1]);
        } while (result[0] < 3);

        terminate = InputHandler.getTerminateOrNot();
        return terminate;
    }
}
