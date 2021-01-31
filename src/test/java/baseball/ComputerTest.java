package baseball;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ComputerTest {
    @Test
    void isRightGeneratingRandomNumber() {
        Computer computer = new Computer();
        computer.generateNumber();
        assertThat(computer.getNumber().length()).isEqualTo(3);
    }
}
