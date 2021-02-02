package baseball;

public class GameLogic {
    public static void run() {
        Controller.setGAMEOVER(false);
        do {
            NumberCreator numberCreator = new NumberCreator();
            int random = numberCreator.createNonDuplicateRandomNum();

            User user = new User();
            user.play(random);

            Controller.restartOrNot(Controller.getRestartNumber());
        } while (!Controller.getGAMEOVER());
    }
}
