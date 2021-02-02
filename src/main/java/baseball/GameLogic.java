package baseball;

public class GameLogic {
    public static void run() {
        Controller.GAMEOVER = false;
        do {
            NumberCreator numberCreator = new NumberCreator();
            int random = numberCreator.createNonDuplicateRandomNum();

            User user = new User();
            user.play(random);

            Controller.restartOrNot();
        } while (!Controller.GAMEOVER);
    }
}
