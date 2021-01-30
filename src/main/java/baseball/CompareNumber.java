package baseball;

public class CompareNumber {
    public static String resultMessage(String computerNumber, String playerNumber) {
        int strike = countStrike(computerNumber, playerNumber);
        int ball = countBall(computerNumber, playerNumber);

        if (strike == 0 && ball == 0) {
            return "낫싱";
        }
        if (strike == 0) {
            return ball + "볼";
        }
        if (ball == 0) {
            return strike + "스트라이크";
        }
        return ball + "볼" + strike + "스트라이크";
    }
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
