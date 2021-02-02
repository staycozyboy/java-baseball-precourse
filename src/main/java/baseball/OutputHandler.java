package baseball;

public class OutputHandler {
    private static String MESSAGE = "숫자를 입력하세요 : ";
    private static String ENDMESSAGE = "3개의 숫자를 모두 맞히셨습니다.";
    private static String REMESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    private static String NOTHING = "낫싱";
    private static String BALL = "볼";
    private static String STRIKE = "스트라이크";

    public static void printCount(int random, int receivedNum) {
        Computer computer = Computer.getInstance();

        int ballCount = computer.getBallCount(random, receivedNum);
        int strikeCount = computer.getStrikeCount(random, receivedNum);

        printBallAndStrike(ballCount, strikeCount);
    }

    public static void printStart() {
        System.out.print(MESSAGE);
    }

    public static void printEnd() {
        System.out.println(ENDMESSAGE);
        System.out.println(REMESSAGE);
    }

    public static void printBallAndStrike (int ballCount, int strikeCount) {
        if(ballCount == 0 && strikeCount == 0) {
            System.out.println(NOTHING);
        } else if(ballCount == 0 && strikeCount != 0) {
            System.out.println(strikeCount + STRIKE);
        } else if(ballCount != 0 && strikeCount == 0) {
            System.out.println(ballCount + BALL);
        } else {        //ballCount != 0 && strikeCount != 0
            System.out.println(ballCount + BALL + " "+ strikeCount + STRIKE);
        }
    }
}
