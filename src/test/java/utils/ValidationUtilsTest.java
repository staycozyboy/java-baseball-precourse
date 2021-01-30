package utils;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ValidationUtilsTest {

    @Test
//    @DisplayName("입력 받은 수가 1~9사이의 숫자로 이루어져 있는지 테스트")
    void testDigitsAreRanged() {
        assertThat(ValidationUtils.isInRange(1235213423)).isTrue();
        assertThat(ValidationUtils.isInRange(10)).isFalse();
        assertThat(ValidationUtils.isInRange(123240342)).isFalse();
        assertThat(ValidationUtils.isInRange(12130)).isFalse();
        assertThat(ValidationUtils.isInRange("1235213423")).isTrue();
        assertThat(ValidationUtils.isInRange("10")).isFalse();
        assertThat(ValidationUtils.isInRange("123240342")).isFalse();
        assertThat(ValidationUtils.isInRange("12130")).isFalse();
    }

    @Test
//    @DisplayName("입력 받은 수에 중복된 숫자가 있는지 확인")
    void testDuplication() {
        assertThat(ValidationUtils.isDuplicated(123)).isFalse();
        assertThat(ValidationUtils.isDuplicated(119)).isTrue();
        assertThat(ValidationUtils.isDuplicated(12345067)).isFalse();
        assertThat(ValidationUtils.isDuplicated(93242359)).isTrue();
        assertThat(ValidationUtils.isDuplicated(33333)).isTrue();
        assertThat(ValidationUtils.isDuplicated("123")).isFalse();
        assertThat(ValidationUtils.isDuplicated("119")).isTrue();
        assertThat(ValidationUtils.isDuplicated("12345067")).isFalse();
        assertThat(ValidationUtils.isDuplicated("93242359")).isTrue();
        assertThat(ValidationUtils.isDuplicated("33333")).isTrue();
    }
}