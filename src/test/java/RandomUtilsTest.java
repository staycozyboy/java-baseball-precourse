import org.junit.jupiter.api.Test;
import utils.RandomUtils;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

public class RandomUtilsTest {
    public boolean isInRange(int num) {
        if (num < 1 || num > 9) {
            return false;
        }
        return true;
    }

    @Test
    public void 정해진범위_내에서_숫자를_생성하는지() {
        int num1 = RandomUtils.nextInt(1, 9);
        int num2 = RandomUtils.nextInt(1, 9);
        int num3 = RandomUtils.nextInt(1, 9);

        assertThat(isInRange(num1));
        assertThat(isInRange(num2));
        assertThat(isInRange(num3));
    }
}
