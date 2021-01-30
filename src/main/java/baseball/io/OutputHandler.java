package baseball.io;

public class OutputHandler {
    private OutputHandler() {
    }

    public static void printResult(int strike, int ball) {
        StringBuilder sb = new StringBuilder();

        if(strike == 0 && ball == 0) {
            System.out.println("낫싱");
            return;
        }

        if(ball > 0) {
            sb.append(String.format("%d 볼 ", ball));
        }

        if(strike > 0) {
            sb.append(String.format("%d 스트라이크", strike));
        }

        System.out.println(sb.toString());
        if(strike == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        }
    }
}
