package baseball;

import utils.ValidationUtils;

import java.util.Scanner;

public class Input {
    private Input() {
    }

    public static String createNumber(Scanner scanner) {
        String inputNumber;
        while(true) {
            try {
                System.out.print("숫자를 입력해주세요 : ");
                inputNumber = scanner.nextLine();
                if (ValidationUtils.isValidateNumber(inputNumber)) {
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return inputNumber;
    }
}
