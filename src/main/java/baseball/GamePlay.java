package baseball;

import utils.ComparisonUtils;

public class GamePlay {
    private final PlayerNumber playerNum = new PlayerNumber();
    private final ComputerNumber computerNum = new ComputerNumber();


    public void playGame(){
        computerNum.generateNumber();
        do {
            try {
                playerNum.setNumber(Input.getCreatedNumber());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            }

            System.out.println(ComparisonUtils.getResultMessage(computerNum.getNumber(), playerNum.getNumber()));

        } while (!isGameOver(computerNum.getNumber(), playerNum.getNumber()));
    }

    private boolean isGameOver(String computerNumber, String playerNumber) {
        if (computerNumber.equals(playerNumber)) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return true;
        }
        return false;
    }
}