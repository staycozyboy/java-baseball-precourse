package baseball.io;

import utils.ValidationUtils;

import java.util.Scanner;
import baseball.build.Number;

public class InputHandler {
    private static final Scanner sc = new Scanner(System.in);

    private InputHandler() {
    }

    public static Number getNumber() {
        int inputNumber;

        do {
            System.out.println("숫자를 입력해주세요 : ");
            inputNumber = sc.nextInt();
        } while ((!ValidationUtils.isInRange(inputNumber) && ValidationUtils.isDuplicated(inputNumber)));

        return new Number(inputNumber);
    }

    public static boolean getTerminateOrNot() {
        int inputNumber;

        do {
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            inputNumber = sc.nextInt();
        } while ((inputNumber != 1) && (inputNumber != 2));

        return inputNumber == 2;
    }
}
