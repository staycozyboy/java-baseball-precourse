package baseball;

public class GameLogic {
    public static User user = new User();
    public static NumberCreator numberCreator = new NumberCreator();

    public static void run() {
        RestartController.gameReady();
        do {
            int random = numberCreator.createNonDuplicateRandomNum();

            user.play(random);

            RestartController.restartOrNot(InputHandler.getValidRestartNum());
        } while (!RestartController.getGAMEOVER());
    }
}
