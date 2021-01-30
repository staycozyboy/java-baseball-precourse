package baseball;

import java.util.Scanner;

public class GamePlay {
    private Computer computer;
    private Player player = new Player();
    private String number = "";
    private Scanner scanner;
    public GamePlay(Scanner scanner){
        this.scanner = scanner;
    }
    public void playGame(){
        String isRestart;
        while (true) {
            computer = new Computer();
            System.out.print("숫자를 입력해주세요 : ");
            try {
                number = scanner.nextLine();
                player.validNumber(number);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            }
            if (isGameOver(computer.getNumber(), number)) {
                break;
            }
            System.out.println(CompareNumber.resultMessage(computer.getNumber(), number));
        }
        isRestart = replayGame();
        if(isRestart.equals("1")) {
            playGame();
        }
        System.out.println("종료");
    }

    private boolean isGameOver(String computerNumber, String playerNumber) {
        if (computerNumber.equals(playerNumber)) {
            System.out.println("3스트라이크");
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