package baseball;

import baseball.io.InputHandler;

public class BaseballProgramController {
    private BaseballProgramController() {
    }

    public static void run() {
        do {
            BaseballGameController.run();
        } while (InputHandler.getTerminateOrNot());
    }
}
