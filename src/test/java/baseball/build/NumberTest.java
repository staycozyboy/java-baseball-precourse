package baseball.build;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.ValidationUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class NumberTest {
    @Test
//    @DisplayName("생성된 넘버 빌더가 조건에 맞는 유효한 3자리 숫자를 필더로 가지는지")
    void testNumberIsValidate() {
        // 가능하면 유효한 TC를 더 추가할 수 있도록 하자. 일단 시간 없어서 걍 넘어감. 테스트 코드도 리팩토링하자.
        Number randomNumber = new Number();
        assertThat((!ValidationUtils.isDuplicated(randomNumber.getValue())
                && ValidationUtils.isInRange(randomNumber.getValue()))).isTrue();
    }
}