package baseball;

import java.util.Scanner;

public class GamePlay {
    private Computer computer = new Computer();
    private Player player;
    private String number = "";
    public GamePlay(Scanner scanner){
        player = new Player(scanner);
    }
    public void playGame(){
        while (true) {

            System.out.print("숫자를 입력해주세요 : ");
            try {
                number = player.createNumber();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            }
            if (isGameOver(computer.getNumber(), number)) {
                break;
            }
            System.out.println(CompareNumber.resultMessage(computer.getNumber(), number));
        }
    }

    public boolean isGameOver(String computerNumber, String playerNumber) {
        if (computerNumber.equals(playerNumber)) {
            System.out.println("3스트라이크");
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return true;
        }
        return false;
    }
}