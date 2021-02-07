package baseball;

public class GamePlayController {
    private static final int RESTART = 1;
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
        int replayNumber = 0;
        try {
            replayNumber = Input.getReplayNumber();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            isReplay();
        }
        return replayNumber == RESTART;
    }
}
