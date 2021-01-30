package baseball;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import org.junit.jupiter.api.Test;


public class PlayerTest {
    @Test
    void rightLengthException() {
        Player player = new Player();
        String number = "1234";
        assertThatIllegalArgumentException().isThrownBy(() -> player.validNumber(number));
    }
    @Test
    void rightValueException() {
        Player player = new Player();
        String number = "asd";
        assertThatIllegalArgumentException().isThrownBy(() -> player.validNumber(number));
    }
    @Test
    void duplicatedException() {
        Player player = new Player();
        String number = "121";
        assertThatIllegalArgumentException().isThrownBy(() -> player.validNumber(number));
    }
}
