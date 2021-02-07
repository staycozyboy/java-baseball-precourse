import baseball.NumberCreator;
import baseball.InputHandler;
import org.junit.jupiter.api.Test;
import utils.RandomUtils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ReceivedNumberTest {
    @Test
    public void 범위에_맞지_않거나_중복되는_수를_입력했을때_예외발생시키는지() {
         int receivedNum1 = RandomUtils.nextInt(1,99);
         int receivedNum2 = RandomUtils.nextInt(1000, 2000);
         int receivedNum3 = RandomUtils.nextInt(2000, 3000);

        assertThatThrownBy(() -> {
            InputHandler.isInValidRange(receivedNum1);
            InputHandler.isNonDuplicated(receivedNum1);
        }).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> {
            InputHandler.isInValidRange(receivedNum2);
            InputHandler.isNonDuplicated(receivedNum2);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void 범위안이면서_중복되지_않은_수를_입력했을때_잘실행되는지() {
        NumberCreator numberCreator = new NumberCreator();
        int receivedNum1 = numberCreator.createNonDuplicateRandomNum();
        int receivedNum2 = numberCreator.createNonDuplicateRandomNum();
        int receivedNum3 = numberCreator.createNonDuplicateRandomNum();

        assertThat(InputHandler.isInValidRange(receivedNum1));
        assertThat(InputHandler.isInValidRange(receivedNum2));
        assertThat(InputHandler.isInValidRange(receivedNum3));
        assertThat(InputHandler.isNonDuplicated(receivedNum1));
        assertThat(InputHandler.isNonDuplicated(receivedNum2));
        assertThat(InputHandler.isNonDuplicated(receivedNum3));
    }
}
