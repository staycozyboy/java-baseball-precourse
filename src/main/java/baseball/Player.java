package baseball;


public class Player{
    private static final int NUMBER_LIMIT = 3;
    private static final int START = 1;
    private static final int END = 9;

    private String number = "";

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}