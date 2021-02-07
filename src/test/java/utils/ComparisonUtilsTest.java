package utils;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ComparisonUtilsTest {
    @Test
    @DisplayName("컵퓨터 넘버랑 플레이어 넘버랑 비교가 잘되는지")
    void isMessageWell1() {
        assertThat(ComparisonUtils.getResultMessage("123", "234")).isEqualTo("2볼");
    }
    @Test
    @DisplayName("컵퓨터 넘버랑 플레이어 넘버랑 비교가 잘되는지")
    void isMessageWell2() {
        assertThat(ComparisonUtils.getResultMessage("123", "145")).isEqualTo("1스트라이크");
    }
    @Test
    @DisplayName("컵퓨터 넘버랑 플레이어 넘버랑 비교가 잘되는지")
    void isMessageWell3() {
        assertThat(ComparisonUtils.getResultMessage("123", "134")).isEqualTo("1볼 1스트라이크");
    }
}
