package baseball;


import utils.RandomUtils;

public class Computer{
    private static final int NUMBER_LIMIT = 3;
    private static final int START = 1;
    private static final int END = 9;
    private String number = "";
    public Computer() {
        generateNumber(number);
    }
    public void generateNumber(String number) {
        while(number.length() < NUMBER_LIMIT) {
            int randomNumber = RandomUtils.nextInt(START, END);
            if (!number.contains(String.valueOf(randomNumber))) {
                number = number + randomNumber;
            }
        }
    }
    public String getNumber() {
        return number;
    }
}