package TicTacToe;

import java.io.IOException;
import java.util.List;

public class Board {

    private int[] hitGraph;
    int[][] board = new int[3][3];

    public boolean setInput(List<Integer> hitGraph, int choice) throws IOException {


        int len = hitGraph.size();

        for (int i = 0; i < len; i = i + 2) {
            int x = hitGraph.get(i) - 1;
            int y = hitGraph.get(i + 1) - 1;
            if (i == 0 || i == 4 || i == 8 || i == 12 || i == 16 || i == 20) {
                board[x][y] = choice;
            } else if (choice == 1) {
                board[x][y] = 2;
            } else {
                board[x][y] = 1;
            }
        }

        for (int y = 0; y <= 2; y++) {
            for (int x = 0; x <= 2; x++) {
                if (board[x][y] == 0) {
                    System.out.print(" ");
                } else if (board[x][y] == 1) {
                    System.out.print("O");
                } else if (board[x][y] == 2) {
                    System.out.print("X");
                }
                if (x == 2) {
                    continue;
                }
                System.out.print("|");
            }
            System.out.println();
            if (y != 2) {
                System.out.print("-----");
                System.out.println();
            }
        }
        Winner w = new Winner();
        boolean winner = w.getWinner(board);

        return winner;
    }
}
