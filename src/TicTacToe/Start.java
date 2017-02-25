package TicTacToe;

import java.util.Random;


public class Start {

    public int getChoice() {

        Random generator = new Random();

        int choice = (int) (generator.nextDouble() * 10);
        if (choice <= 5) {
            choice = 1;
            System.out.println("Zaczynają kółka");
        } else {
            choice = 2;
            System.out.println("Zaczynają krzyżyki");
        }
        return choice;
    }
}
