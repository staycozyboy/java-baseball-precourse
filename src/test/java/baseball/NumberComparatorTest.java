package baseball;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberComparatorTest {
    @Test
//    @DisplayName("사용자 입력과 난수를 비교하여 올바른 결과를 반환하늕 지 테스트")
    void testVaildResult() {
        int[] result = {0, 0};
        assertThat(NumberComparator.compare(123, 456)).isEqualTo(result);
        result[0] = 1;
        result[1] = 2;
        assertThat(NumberComparator.compare(123, 321)).isEqualTo(result);
        result[0] = 3;
        result[1] = 0;
        assertThat(NumberComparator.compare(187, 187)).isEqualTo(result);
    }
}