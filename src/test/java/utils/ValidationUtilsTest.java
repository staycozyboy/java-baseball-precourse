package utils;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidationUtilsTest {
    @Test
    @DisplayName("입력받은 숫자가 길이가 틀렸을때 예외가 발생하는지")
    void rightLengthException() {
        String number = "1234";
        assertThatIllegalArgumentException().isThrownBy(() -> ValidationUtils.isValidateNumber(number));
    }
    @Test
    @DisplayName("입력받은 숫자가 값이 틀렸을때 예외가 발생하는지")
    void rightValueException() {
        String number = "asd";
        assertThatIllegalArgumentException().isThrownBy(() -> ValidationUtils.isValidateNumber(number));
    }
    @Test
    @DisplayName("입력받은 숫자가 중복됐을때 예외가 발생하는지")
    void duplicatedException() {
        String number = "121";
        assertThatIllegalArgumentException().isThrownBy(() -> ValidationUtils.isValidateNumber(number));
    }
    @Test
    @DisplayName("재시작시 1,2가 아니면 예외가 발생하는지")
    void replayException() {
        assertThatIllegalArgumentException().isThrownBy(() -> ValidationUtils.isValidateNumber(3));
        assertThatIllegalArgumentException().isThrownBy(() -> ValidationUtils.isValidateNumber(4));
        assertThatIllegalArgumentException().isThrownBy(() -> ValidationUtils.isValidateNumber(10));
    }
}
