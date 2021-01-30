package baseball;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        Computer computer = new Computer();
        User user = new User();

        while(true) {       //한 번의 게임
            int random = computer.createRandomNum();
            user.play(computer, random);

            int restartOrNotNum = scanner.nextInt();
            if(computer.restartOrNot(restartOrNotNum) == false) {   //2일 경우
                break;
            }
        }
    }
}
