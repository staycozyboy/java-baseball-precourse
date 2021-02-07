package utils;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidationUtilsTest {
    @Test
    void rightLengthException() {
        String number = "1234";
        assertThatIllegalArgumentException().isThrownBy(() -> ValidationUtils.isValidateNumber(number));
    }
    @Test
    void rightValueException() {
        String number = "asd";
        assertThatIllegalArgumentException().isThrownBy(() -> ValidationUtils.isValidateNumber(number));
    }
    @Test
    void duplicatedException() {
        String number = "121";
        assertThatIllegalArgumentException().isThrownBy(() -> ValidationUtils.isValidateNumber(number));
    }
}
