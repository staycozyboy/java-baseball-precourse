package utils;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ComparisonUtilsTest {
    @Test
    void isMessageWell1() {
        assertThat(ComparisonUtils.getResultMessage("123", "234")).isEqualTo("2볼");
    }
    @Test
    void isMessageWell2() {
        assertThat(ComparisonUtils.getResultMessage("123", "145")).isEqualTo("1스트라이크");
    }
    @Test
    void isMessageWell3() {
        assertThat(ComparisonUtils.getResultMessage("123", "134")).isEqualTo("1볼 1스트라이크");
    }
}
