import baseball.InputHandler;
import baseball.NumberCreator;
import org.junit.jupiter.api.Test;
import utils.RandomUtils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ReceivedNumberTest {
    @Test
    public void 범위에_맞지_않는수를_입력했을때_예외발생시키는지() {
         int receivedNum1 = RandomUtils.nextInt(1,99);
         int receivedNum2 = RandomUtils.nextInt(1000, 2000);
         int receivedNum3 = RandomUtils.nextInt(2000, 3000);

        assertThatThrownBy(() -> {
            InputHandler.isValidReceivedNum(receivedNum1);
        }).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> {
            InputHandler.isValidReceivedNum(receivedNum2);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void 범위안의_수를_입력했을때_잘실행되는지() {
        int receivedNum1 = RandomUtils.nextInt(100, 999);
        int receivedNum2 = RandomUtils.nextInt(100, 999);
        int receivedNum3 = RandomUtils.nextInt(100, 999);

        assertThat(InputHandler.isValidReceivedNum(receivedNum1));
        assertThat(InputHandler.isValidReceivedNum(receivedNum2));
        assertThat(InputHandler.isValidReceivedNum(receivedNum3));
    }
}
