package baseball;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberComparatorTest {
    @Test
    @DisplayName("사용자 입력과 난수를 비교하여 올바른 결과를 반환하는 지 테스트")
    void compare_validReturn() {
        // 테스트 코드를 짤때 하나의 시나리오의 정의가 애매하다.. 스트라이크와 볼 둘 다 한꺼번에 검증하니, result로 퉁쳐서 테스트한다고 일단은 생각이 된다.
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