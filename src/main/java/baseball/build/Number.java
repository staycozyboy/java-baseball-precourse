package baseball.build;

import utils.RandomUtils;
import utils.ValidationUtils;

public class Number {
    private final int START = 100;
    private final int END = 999;

    private int number;

    public Number() {
        createNumber();
    }

    public Number(String userInput) {
        // 여기서 뭔가 error를 raise한 하는 방법 없을까? 이거 호출하는 곳에서는 error 안나올때까지 반복하고.
        // 리팩토링 무조건 해야할 부분. 빌더 패턴의 잘못된 예.
        this.number = Integer.parseInt(userInput);
    }

    private void createNumber() {
        int number;

        do {
            number = RandomUtils.nextInt(START, END);
        } while ((!ValidationUtils.isInRange(number) || ValidationUtils.isDuplicated(number)));

        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }
}
