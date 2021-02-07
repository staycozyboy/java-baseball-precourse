package baseball;

import baseball.build.Number;
import baseball.io.InputHandler;
import baseball.io.OutputHandler;

public class BaseballGameController {
    private BaseballGameController() {
    }

    public static void run() {
        int randomNumber = new Number().getValue();
        int userNumber;
        int[] result;  // 0: Strike, 1: Ball
        System.out.println(String.format("정답 : %d", randomNumber));  // For Testing

        do {
            userNumber = InputHandler.getUserNumber();
            result = NumberComparator.compare(randomNumber, userNumber);
            OutputHandler.printResult(result[0], result[1]);
        } while (result[0] < 3);
    }
}
