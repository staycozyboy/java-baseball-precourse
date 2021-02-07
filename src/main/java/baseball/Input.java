package baseball;

import utils.ValidationUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    private Input() {
    }

    public static String getCreatedNumber() {
        String inputNumber;
        do {
            System.out.print("숫자를 입력해주세요 : ");
            inputNumber = scanner.nextLine();
        } while (!ValidationUtils.isValidateNumber(inputNumber));

        return inputNumber;
    }

    public static int getReplayNumber(){
        int inputNumber = 0;
        do {
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            try {
                inputNumber = scanner.nextInt();
            } catch (InputMismatchException e) {

            }
            scanner.nextLine(); //버퍼비우기
        } while (!ValidationUtils.isValidateNumber(inputNumber));

        return inputNumber;
    }
}
