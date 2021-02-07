import baseball.Calculator;
import baseball.NumberCreator;
import org.junit.jupiter.api.Test;
import utils.RandomUtils;

import static org.assertj.core.api.Assertions.*;


public class CountTest {
    private static int MAX_COUNT = 3;
    private static int MIN_COUNT = 0;

    Calculator calculator = Calculator.getInstance();
    NumberCreator numberCreator = new NumberCreator();

    @Test
    public void 볼계산이_잘되는지() {
        int random = numberCreator.createNonDuplicateRandomNum();
        int receivedNum1 = RandomUtils.nextInt(100, 999);
        int receivedNum2 = RandomUtils.nextInt(100, 999);
        int receivedNum3 = RandomUtils.nextInt(100, 999);

        int ballCount1 = calculator.getBallCount(random, receivedNum1);
        int ballCount2 = calculator.getBallCount(random, receivedNum2);
        int ballCount3 = calculator.getBallCount(random, receivedNum3);
        assertThat(ballCount1 >= MIN_COUNT && ballCount1 <= MAX_COUNT);
        assertThat(ballCount2 >= MIN_COUNT && ballCount2 <= MAX_COUNT);
        assertThat(ballCount3 >= MIN_COUNT && ballCount3 <= MAX_COUNT);
    }

    @Test
    public void 스트라이크계산이_잘되는지() {
        int random = numberCreator.createNonDuplicateRandomNum();
        int receivedNum1 = RandomUtils.nextInt(100, 999);
        int receivedNum2 = RandomUtils.nextInt(100, 999);
        int receivedNum3 = RandomUtils.nextInt(100, 999);

        int strikeCount1 = calculator.getStrikeCount(random, receivedNum1);
        int strikeCount2 = calculator.getStrikeCount(random, receivedNum2);
        int strikeCount3 = calculator.getStrikeCount(random, receivedNum3);

        assertThat(strikeCount1 >= MIN_COUNT && strikeCount1 <= MAX_COUNT);
        assertThat(strikeCount2 >= MIN_COUNT && strikeCount2 <= MAX_COUNT);
        assertThat(strikeCount3 >= MIN_COUNT && strikeCount3 <= MAX_COUNT);
    }

    @Test
    public void 쓰리스트라이크검사메서드가_잘_실행되는지() {
        int num1 = RandomUtils.nextInt(100, 999);
        int num2 = RandomUtils.nextInt(100, 999);
        int num3 = RandomUtils.nextInt(100, 999);

        assertThat(calculator.isThreeStrike(num1, num1));
        assertThat(calculator.isThreeStrike(num2, num2));
        assertThat(calculator.isThreeStrike(num3, num3));
    }

}
