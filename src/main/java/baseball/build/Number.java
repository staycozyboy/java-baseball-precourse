package baseball.build;

import utils.RandomUtils;
import utils.ValidationUtils;

public class Number {
    // 리팩토링 필요함. Number 빌더로 해서 난수와 인풋 둘다 생성될 때 validation을 마쳐서 생성하려 했는데, 잘 구현 못했음. 더 갈끔하게 해보자.
    private final int START = 100;
    private final int END = 999;

    private int number;

    public Number() {
        createNumber();
    }

    private void createNumber() {
        int number;

        do {
            number = RandomUtils.nextInt(START, END);
        } while ((!ValidationUtils.isInRange(number) || ValidationUtils.isDuplicated(number)));

        this.number = number;
    }

    public int getValue() {
        return this.number;
    }
}
