package baseball;

import utils.ComparisonUtils;

import java.util.Scanner;

public class GamePlay {
    private final Player player = new Player();
    private final Computer computer = new Computer();
    private final Scanner scanner;

    public GamePlay(Scanner scanner){
        this.scanner = scanner;
    }

    public void playGame(){
        int isRestart = 0;

        computer.generateNumber();
        while (isRestart != 2) {
            player.setNumber(Input.createNumber(scanner));
            System.out.println(ComparisonUtils.getResultMessage(computer.getNumber(), player.getNumber()));
            if (isGameOver(computer.getNumber(), player.getNumber())) {
                isRestart = Input.replayGame(scanner);
                scanner.nextLine(); // 버퍼 비우기
            }
            if (isRestart == 1) {
                computer.generateNumber(); // 다시 시작되면 컴퓨터넘버 다시 생성
            }
        }
        System.out.println("종료");
    }

    private boolean isGameOver(String computerNumber, String playerNumber) {
        if (computerNumber.equals(playerNumber)) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return true;
        }
        return false;
    }
}