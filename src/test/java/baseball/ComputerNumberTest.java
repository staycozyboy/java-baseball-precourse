package baseball;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ComputerNumberTest {
    @Test
    @DisplayName("컴퓨터가 숫자를 잘 생성하는지")
    void isRightGeneratingRandomNumber() {
        ComputerNumber computer = new ComputerNumber();
        computer.generateNumber();
        assertThat(computer.getNumber().length()).isEqualTo(3);
    }
}
