package baseball;
import utils.RandomUtils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class NumberCreator {
    public final Set<Integer> randomNumbers = new HashSet<>();

    public boolean isValidSize(Set<Integer> randomNumbers) {
        if (randomNumbers.size() == 3) {
            return true;
        }
        return false;
    }

    public void createValidSet() {
        while (!isValidSize(randomNumbers)) {
            randomNumbers.add(RandomUtils.nextInt(1, 9));
        }
    }

    public int createNonDuplicateRandomNum() {         //서로 다른 수를 지닌 임의의 3자릿수 만들기.
        createValidSet();
        Iterator<Integer> iterator = randomNumbers.iterator();
        int randomNum = 0;
        int digit = 1;
        while (iterator.hasNext()) {
            randomNum += iterator.next() * digit;
            digit *= 10;
        }
        return randomNum;
    }
}
