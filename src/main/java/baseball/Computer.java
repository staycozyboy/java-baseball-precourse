package baseball;
import utils.RandomUtils;

public class Computer {
    private static Computer COMPUTER = new Computer();

    private Computer() { }      //메모리 낭비 방지 : 싱글턴

    public static Computer getInstance() {
        return COMPUTER;
    }

    public int getBallCount(int random, int receivedNum) {    //ballCount 계산
        int ballCount = 0;

        for (int i = 0; i < goString(receivedNum).length(); i++) {
            if (goString(random).charAt(i) != goString(receivedNum).charAt(i)
                    && goString(random).contains(goString(receivedNum).subSequence(i, i + 1))) {
                ballCount++;
            }
        }
        return ballCount;
    }

    public int getStrikeCount(int random, int receivedNum) {    //strikeCount 계산
        int strikeCount = 0;

        for (int i = 0; i < goString(receivedNum).length(); i++) {
            if (goString(random).charAt(i) == goString(receivedNum).charAt(i)) {
                strikeCount++;
            }
        }
        return strikeCount;
    }

    public String goString(int num) {
        return Integer.toString(num);
    }
}
