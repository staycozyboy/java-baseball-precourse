package baseball;

import utils.ComparisonUtils;

public class GamePlay {
    private final PlayerNumber player = new PlayerNumber();
    private final ComputerNumber computer = new ComputerNumber();


    public void playGame(){
        computer.generateNumber();
        do {
            try {
                player.setNumber(Input.createNumber());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            }

            System.out.println(ComparisonUtils.getResultMessage(computer.getNumber(), player.getNumber()));

        } while (!isGameOver(computer.getNumber(), player.getNumber()));
    }

    private boolean isGameOver(String computerNumber, String playerNumber) {
        if (computerNumber.equals(playerNumber)) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return true;
        }
        return false;
    }
}