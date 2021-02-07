package utils;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RandomUtilsTest {
    // 테스트에 스태틱을 쓰지 않는 것을 권장하는 이유가 뭘까? 매직넘버를 그냥 이렇게만 해라는 걸까? 아예 매직넘버가 들어갈 여지를 주지 말라는 걸까?
    private final int START = 100;
    private final int END = 999;
    private final int NUMBER_LENGTH = 3;

    @Test
    @DisplayName("3자리 난수를 생성하는지 테스트")
    void nextInt_return3digits() {
        int randomNumber = RandomUtils.nextInt(START, END);
        assertThat(String.valueOf(randomNumber).length()).isEqualTo(NUMBER_LENGTH);
    }
}
