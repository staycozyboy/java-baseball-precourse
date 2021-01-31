package baseball;

public class BaseballProgramController {
    private BaseballProgramController() {
    }

    public static void run() {
        boolean play = true;

        while (play) {
            play = !BaseballGameController.run();
        }
    }
}
