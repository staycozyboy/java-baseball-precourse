package baseball;

import utils.ValidationUtils;

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
        } while(!ValidationUtils.isValidateNumber(inputNumber));

        return inputNumber;
    }

    public static int getReplayNumber(){
        int inputNumber;
        do {
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            inputNumber = scanner.nextInt();
        } while(!ValidationUtils.isValidateNumber(inputNumber));
        scanner.nextLine(); //버퍼비우기

        return inputNumber;
    }
}
