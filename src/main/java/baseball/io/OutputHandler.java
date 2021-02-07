package baseball.io;

public class OutputHandler {
    private static final int NONE = 0;
    private static final int OUT = 3;

    private OutputHandler() {
    }

    public static void printResult(int strike, int ball) {
        StringBuilder sb = new StringBuilder();

        if (strike == NONE && ball == NONE) {
            System.out.println("낫싱");
            return;
        }

        if (ball > NONE) {
            sb.append(String.format("%d 볼 ", ball));
        }

        if (strike > NONE) {
            sb.append(String.format("%d 스트라이크", strike));
        }

        System.out.println(sb.toString());
        if (strike == OUT) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        }
    }
}