package utils;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ValidationUtilsTest {

    @Test
    @DisplayName("3자리 난수가 1~9사이의 숫자로 이루어져 있는지 테스트")
    void validate_digits_are_ranged() {
        assertThat(ValidationUtils.validateDigitRange(1235213423)).isTrue();
        assertThat(ValidationUtils.validateDigitRange(10)).isFalse();
        assertThat(ValidationUtils.validateDigitRange(123240342)).isFalse();
        assertThat(ValidationUtils.validateDigitRange(12130)).isFalse();
    }
}