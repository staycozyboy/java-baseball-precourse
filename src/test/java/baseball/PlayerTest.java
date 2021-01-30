package baseball;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import org.junit.jupiter.api.Test;
import java.util.Scanner;


public class PlayerTest {
    @Test
    void rightLengthException() {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player(scanner);
        String number = "1234";
        assertThatIllegalArgumentException().isThrownBy(() -> player.isRightLength(number));
    }
    @Test
    void rightValueException() {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player(scanner);
        String number = "asd";
        assertThatIllegalArgumentException().isThrownBy(() -> player.isRightValue(number));
    }
    @Test
    void duplicatedException() {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player(scanner);
        String number = "121";
        assertThatIllegalArgumentException().isThrownBy(() -> player.isDuplicated(number));
    }
}
