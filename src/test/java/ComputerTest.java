import baseball.Computer;
import org.junit.jupiter.api.Test;
import utils.RandomUtils;

import static org.assertj.core.api.Assertions.*;


public class ComputerTest {
    @Test
    public void 난수가_잘_생성되는지() {
        Computer computer = new Computer();
        int random = computer.createRandomNum();
        assertThat(random / 100 != random / 10 % 10 && random / 100 != random % 10);
        assertThat(random / 10 % 10 != random % 10);
    }

    @Test
    public void 볼계산이_잘되는지() {
        Computer computer = new Computer();
        String str1 = Integer.toString(computer.createRandomNum());
        String str2 = Integer.toString(computer.createRandomNum());
        int ballCount = computer.getBallCount(str1, str2);
        assertThat(ballCount >= 0 && ballCount <= 3);
    }

    @Test
    public void 스트라이크계산이_잘되는지() {
        Computer computer = new Computer();
        String str1 = Integer.toString(computer.createRandomNum());
        String str2 = Integer.toString(computer.createRandomNum());
        int strikeCount = computer.getStrikeCount(str1, str2);
        assertThat(strikeCount >= 0 && strikeCount <= 3);
    }

    @Test
    public void 범위에_맞는_수를_입력하면_성공() {
        Computer computer = new Computer();
        int receivedNum = RandomUtils.nextInt(100, 999);
        assertThat(computer.filterReceivedNum(receivedNum));
    }

    @Test
    public void 범위밖의_수를_입력하면_예외발생() {
        Computer computer = new Computer();
        int receivedNum1 = RandomUtils.nextInt(1, 99);
        assertThatThrownBy(() -> {
            computer.filterReceivedNum(receivedNum1);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("100부터 999 이하의 숫자만 입력 가능합니다.");
    }

    @Test
    public void 재시작할때_범위에_맞는_수를_입력하면_성공() {
        Computer computer = new Computer();
        int receivedNum = RandomUtils.nextInt(1, 2);
        assertThat(computer.restartOrNot(receivedNum));
    }

    @Test
    public void 재시작할때_범위밖의_수를_입력하면_예외발생() {
        Computer computer = new Computer();
        int receivedNum = RandomUtils.nextInt(3, 10);
        assertThatThrownBy(() -> {
            computer.restartOrNot(receivedNum);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("1이나 2를 입력해주세요.");
    }
}
