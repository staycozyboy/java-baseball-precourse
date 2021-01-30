package baseball;
import utils.RandomUtils;

public class Computer {
    public int getBallCount(String randomStr, String receivedNumStr) {    //ballCount 계산
        int ballCount = 0;
        for (int i = 0; i < randomStr.length(); i++) {
            if (randomStr.charAt(i) != receivedNumStr.charAt(i) && randomStr.contains(receivedNumStr.subSequence(i, i + 1))) {
                ballCount++;
            }
        }

        return ballCount;
    }

    public int getStrikeCount(String randomStr, String receivedNumStr) {    //strikeCount 계산
        int strikeCount = 0;
        for (int i = 0; i < randomStr.length(); i++) {
            if (randomStr.charAt(i) == receivedNumStr.charAt(i)) {
                strikeCount++;
            }
        }

        return strikeCount;
    }
}
