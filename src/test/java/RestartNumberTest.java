import baseball.InputHandler;
import org.junit.jupiter.api.Test;
import utils.RandomUtils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


public class RestartNumberTest {
    @Test
    public void 재시작관련해서_범위밖의_숫자_받을_때_예외_잘_발생하는지() {
        int num1 = RandomUtils.nextInt(3, 100);
        int num2 = RandomUtils.nextInt(101, 200);

        assertThatThrownBy(() -> {
            InputHandler.isValidRestartNum(num1);
        }).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> {
            InputHandler.isValidRestartNum(num2);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void 재시작관련해서_범위안의_숫자_받을_때_잘_실행되는지() {
        int num1 = 1;
        int num2 = 2;

        assertThat(InputHandler.isValidRestartNum(num1));
        assertThat(InputHandler.isValidRestartNum(num2));
    }


}
