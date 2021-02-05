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
        String isRestart;

        computer.generateNumber();
        while (true) {
            player.setNumber(Input.createNumber(scanner));
            System.out.println(ComparisonUtils.getResultMessage(computer.getNumber(), player.getNumber()));
            if (isGameOver(computer.getNumber(), player.getNumber())) {
                break;
            }
        }

        isRestart = replayGame();
        if (isRestart.equals("1")) {
            playGame();
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

    private String replayGame(){
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = scanner.nextLine();

        try {
            isRightInput(input);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            replayGame();
        }
        return input;
    }

    private void isRightInput(String input) throws IllegalArgumentException {
        if (!isValidInput(input)) {
            throw new IllegalArgumentException("잘못된 입력값입니다.");
        }
    }

    private boolean isValidInput(String input){
        return input.equals("1") || input.equals("2");
    }
}