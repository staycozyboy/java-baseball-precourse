import baseball.NumberCreator;
import org.junit.jupiter.api.Test;
import utils.RandomUtils;

import static org.assertj.core.api.Assertions.*;

public class NumberCreatorTest {
    public boolean isNonDuplicateRandomNum(int num) {
        if (num / 100 != num / 10 % 10 && num / 100 != num % 10) {
            if (num / 10 % 10 != num % 10) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void 세자리_숫자가_각기_다른수로_만들어졌는지() {
        NumberCreator numberCreator = new NumberCreator();

        int random1 = numberCreator.createNonDuplicateRandomNum();
        int random2 = numberCreator.createNonDuplicateRandomNum();
        int random3 = numberCreator.createNonDuplicateRandomNum();

        assertThat(isNonDuplicateRandomNum(random1));
        assertThat(isNonDuplicateRandomNum(random2));
        assertThat(isNonDuplicateRandomNum(random3));
    }
}
