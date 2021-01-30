package baseball;

import java.util.Scanner;

public class Player{
    private static final int NUMBER_LIMIT = 3;
    private static final int START = 1;
    private static final int END = 9;
    private String number = "";
    private Scanner scanner;
    public Player(Scanner scanner){
        this.scanner = scanner;
    }

    public String createNumber() throws IllegalArgumentException {
        number = scanner.nextLine();
        isRightLength(number);
        isDuplicated(number);
        return number;
    }
    public void isRightLength(String number) {
        if(number.length() != 3){
            throw new IllegalArgumentException();
        }
    }
    public void isRightValue(String number) {
        for (int i = 0; i < NUMBER_LIMIT; i++) {
            if ((number.charAt(i) - 48) < START || (number.charAt(i) - 48) > END) {
                throw new IllegalArgumentException();
            }
        }
    }
    public void isDuplicated(String number) {
        for (int i = 0; i < NUMBER_LIMIT - 1; i++) {
            if (number.charAt(i) == number.charAt(i+1)) {
                throw new IllegalArgumentException();
            }
        }// 1번째 - 2번째, 2번째 - 3번째 같은지 비교
        if(number.charAt(0) == number.charAt(2)) {
            throw new IllegalArgumentException();
        }// 1번째 - 3번째 같은지 비교
    }
}