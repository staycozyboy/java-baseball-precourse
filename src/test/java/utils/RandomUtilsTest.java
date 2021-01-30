package utils;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RandomUtilsTest {
    private final int START = 100;
    private final int END = 999;
    private final int NUMBER_LENGTH = 3;

    @Test
    void create_3digits_random_number() {
        int randomNumber = RandomUtils.nextInt(START, END);
        assertThat(String.valueOf(randomNumber).length()).isEqualTo(NUMBER_LENGTH);
    }
}
