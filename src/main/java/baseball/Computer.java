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

    public void printCount(String randomStr, String receivedNum) {       //출력
        if (getStrikeCount(randomStr, receivedNum) == 0 && getBallCount(randomStr, receivedNum) == 0) {   //둘 다 0일 경우
            System.out.println("낫싱");
        } else if (getStrikeCount(randomStr, receivedNum) != 0 && getBallCount(randomStr, receivedNum) == 0) {    //볼카운트만 0일 경우
            System.out.printf("%d스트라이크 \n", getStrikeCount(randomStr, receivedNum));
        } else if (getStrikeCount(randomStr, receivedNum) == 0 && getBallCount(randomStr, receivedNum) != 0) {    //스트라잌카운트만 0일 경우
            System.out.printf("%d볼 \n", getBallCount(randomStr, receivedNum));
        } else  {    //둘다 0이 아닐 경우
            System.out.printf("%d볼 %d스트라이크 \n", getBallCount(randomStr, receivedNum), getStrikeCount(randomStr, receivedNum));
        }
    }

    public void printPlaying() {
        System.out.print("숫자를 입력하세요 : ");
    }

    public void printEndGame() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
    }
}
