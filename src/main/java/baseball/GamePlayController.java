package baseball;

public class GamePlayController {
    private final GamePlay gamePlay = new GamePlay();

    public void executeProgram() {
        while (true) {
            gamePlay.playGame();
            if (!isReplay()) {
                break;
            }
        }
        System.out.println("종료");
    }

    private boolean isReplay() {
        int replay = 0;
        try {
            replay = Input.replayGame();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            isReplay();
        }
        return replay == 1;
    }
}
