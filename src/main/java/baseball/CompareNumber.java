package baseball;

public class CompareNumber {
    private static int countStrike(String computerNumber, String playerNumber) {
        int strike = 0;
        for (int i = 0; i < computerNumber.length(); i++) {
            if (computerNumber.charAt(i) == playerNumber.charAt(i)) {
                strike++;
            }
        }
        return strike;
    }
    private static int countBall(String computerNumber, String playerNumber) {
        int ball = 0;
        for (int i = 0; i < computerNumber.length(); i++) {
            if (computerNumber.indexOf(playerNumber.charAt(i)) >= 0) {
                ball++;
            }
        }
        return ball - countStrike(computerNumber, playerNumber);
    }
}
