package baseball;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ComputerNumberTest {
    @Test
    void isRightGeneratingRandomNumber() {
        ComputerNumber computer = new ComputerNumber();
        computer.generateNumber();
        assertThat(computer.getNumber().length()).isEqualTo(3);
    }
}
