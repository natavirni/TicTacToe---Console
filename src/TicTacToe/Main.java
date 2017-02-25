package TicTacToe;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<Integer> hits = new ArrayList<Integer>();

        int[] hit;
        boolean noWinner = true;
        boolean repeat = true;
        int len = hits.size();

        BoardCoordinates boardGraph = new BoardCoordinates();
        boardGraph.board();

        // Wybór startującego
        Start start = new Start();
        int choice = start.getChoice();


        // Główna pętla - jeśli nie wyłonimy zwycięzcy to będzie działać
        while (noWinner) {
            Hit a = new Hit();
            Board b = new Board();
            hit = a.getInput();

            // Sprawdzenia czy współrzędne już nie zostały użyte

            if (len == 0) {
                hits.add(hit[0]);
                hits.add(hit[1]);
                System.out.println("Współrzędne prawidłowe");
            } else {
                for (int i = 0; i < len; i = i + 2) {
                    repeat = hits.get(i) == hit[0] && hits.get(i + 1) == hit[1];
                }
                if (repeat) {
                    System.out.println("Współrzędne istanieją");
                } else {
                    hits.add(hit[0]);
                    hits.add(hit[1]);
                }
            }
            noWinner = b.setInput(hits, choice);
        }
    }
}



