package baseball;

public class BaseballProgramController {
    public void run() {
        boolean play = true;

        while(play) {
            play = !BaseballGameController.run();
        }
    }
}
