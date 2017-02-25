package TicTacToe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Hit {

    public int[] getInput() throws IOException {

        boolean validation = true;
        String hit = "";
        while (validation) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Podaj pole");
            hit = br.readLine();
            if (hit == null || !hit.matches("\\d([,\\s])\\d")) {
                System.out.println("Podałeś złe współrzędne");
                validation = true;
            } else {
                validation = false;
            }
        }

        String[] coordinates = hit.split(" ");
        int x = Integer.parseInt(coordinates[0]);
        int y = Integer.parseInt(coordinates[1]);
        int[] hits = {x, y};
        return hits;
    }
}

