package baseball;

import java.util.Scanner;

public class GamePlay {
    private Computer computer = new Computer();
    private Player player;
    private String number = "";
    public GamePlay(Scanner scanner){
        player = new Player(scanner);
    }
    public void playGame(){

    }
}