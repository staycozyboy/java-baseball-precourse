package baseball;

public class Calculator {
    private static Calculator calculator = new Calculator();
    private final int MAX_COUNT = 3;

    private Calculator() { }      //메모리 낭비 방지 : 싱글턴

    public static Calculator getInstance() {
        return calculator;
    }

    public int getBallCount(int random, int receivedNum) {    //ballCount 계산
        int ballCount = 0;

        for (int i = 0; i < getString(receivedNum).length(); i++) {
            if (getString(random).charAt(i) != getString(receivedNum).charAt(i)
                    && getString(random).contains(String.valueOf(getString(receivedNum).charAt(i)))) {
                ballCount++;
            }
        }
        return ballCount;
    }

    public int getStrikeCount(int random, int receivedNum) {    //strikeCount 계산
        int strikeCount = 0;

        for (int i = 0; i < getString(receivedNum).length(); i++) {
            if (getString(random).charAt(i) == getString(receivedNum).charAt(i)) {
                strikeCount++;
            }
        }
        return strikeCount;
    }

    public boolean isThreeStrike(int random, int receivedNum) {
        if (getStrikeCount(random, receivedNum) != MAX_COUNT){
            return false;
        }
        return true;
    }

    public String getString(int num) {
        return Integer.toString(num);
    }
}
