package baseball;

public class RestartController {
    private static boolean GAMEOVER;
    private static final int START = 1;
    private static final int END = 2;

    private RestartController() {}

    public static void restartOrNot(int restartNum) {
        switch (restartNum) {
            case START:
                RestartController.gameReady();
                break;
            case END:
                RestartController.stop();
                break;
            default:
                throw new RuntimeException();
        }
    }

    public static void stop() {
        GAMEOVER = true;
    }

    public static boolean getGAMEOVER() {
        return GAMEOVER;
    }

    public static void gameReady() {
        GAMEOVER = false;
    }
}
