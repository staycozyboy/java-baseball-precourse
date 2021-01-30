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

    public boolean restartOrNot(int n) {        //true면 재시작, false면 종료
        if(n == 1) {
            return true;
        } else if (n == 2) {        //2일 경우
            return false;
        } else {
            throw new IllegalArgumentException("1이나 2를 입력해주세요.");
        }
    }

    public int createRandomNum() {         //서로 다른 수를 지닌 임의의 3자릿수 만들기.
        int oneDigit = RandomUtils.nextInt(1, 9);
        int tenDigit;
        int hundredDigit;
        do{
            tenDigit = RandomUtils.nextInt(1, 9);
        } while (oneDigit == tenDigit);
        do{
            hundredDigit = RandomUtils.nextInt(1, 9);
        } while (hundredDigit == tenDigit || hundredDigit == oneDigit);

        return hundredDigit * 100 + tenDigit * 10 + oneDigit * 1;
    }

    public int filterReceivedNum(int receivedNum) {
        if(100 <= receivedNum && receivedNum <= 999) {
            return receivedNum;
        } else {
            throw new IllegalArgumentException("100부터 999 이하의 숫자만 입력 가능합니다.");
        }
    }
}
