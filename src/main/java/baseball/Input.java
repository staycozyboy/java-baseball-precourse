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

    public static int replayGame(Scanner scanner){
        int inputNumber;
        while(true) {
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            try {
                inputNumber = scanner.nextInt();
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
