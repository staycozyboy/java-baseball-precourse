package baseball;

import baseball.Calculator;

public class ResultPrinter {
    private static final String NOTHING = "낫싱 ";
    private static final String BALL = "볼 ";
    private static final String STRIKE = "스트라이크 ";

    public static void printCountingMessage(int random, int receivedNum) {
        Calculator calculator = Calculator.getInstance();

        int ballCount = calculator.getBallCount(random, receivedNum);
        int strikeCount = calculator.getStrikeCount(random, receivedNum);

        System.out.println(getCountResult(ballCount, strikeCount).toString());
    }

    public static StringBuilder getCountResult (int ballCount, int strikeCount) {
        StringBuilder stringBuilder = new StringBuilder();

        if (ballCount != 0) {
            stringBuilder.append(ballCount).append(BALL);
        }

        if (strikeCount != 0) {
            stringBuilder.append(strikeCount).append(STRIKE);
        }

        if (ballCount == 0 && strikeCount == 0) {
            stringBuilder.append(NOTHING);
        }

        return stringBuilder;
    }
}
