package baseball.build;

import utils.RandomUtils;

public class Number {
    private final int START = 100;
    private final int END = 999;

    private int number;

    public Number() {
        createNumber();
    }

    public Number(String userInput) {

    }

    private void createNumber() {
        int number = RandomUtils.nextInt(START, END);
    }

    public int getNumber() {
        return 0;
    }
}
