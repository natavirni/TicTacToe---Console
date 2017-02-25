package TicTacToe;

public class Winner {

    public boolean getWinner(int[][] board) {

        //Warunki wygranej dla kółek

        if (((board[0][0] == 1) && (board[0][1] == 1) && (board[0][2]) == 1)) {
            System.out.println("GRATULACJE - kółka wygrały");
            return false;
        } else if (((board[1][0] == 1) && (board[1][1] == 1) && (board[1][2]) == 1)) {
            System.out.println("GRATULACJE - kółka wygrały");
            return false;
        } else if (((board[2][0] == 1) && (board[2][1] == 1) && (board[2][2]) == 1)) {
            System.out.println("GRATULACJE - kółka wygrały");
            return false;
        } else if (((board[0][0] == 1) && (board[1][0] == 1) && (board[2][0]) == 1)) {
            System.out.println("GRATULACJE - kółka wygrały");
            return false;
        } else if (((board[0][1] == 1) && (board[1][1] == 1) && (board[2][1]) == 1)) {
            System.out.println("GRATULACJE - kółka wygrały");
            return false;
        } else if (((board[0][2] == 1) && (board[1][2] == 1) && (board[2][2]) == 1)) {
            System.out.println("GRATULACJE - kółka wygrały");
            return false;
        } else if (((board[0][0] == 1) && (board[1][1] == 1) && (board[2][2]) == 1)) {
            System.out.println("GRATULACJE - kółka wygrały");
            return false;
        } else if (((board[0][2] == 1) && (board[1][1] == 1) && (board[2][2]) == 1)) {
            System.out.println("GRATULACJE - kółka wygrały");
            return false;
        }

        //Warunki wygranej dla krzyżyków

        if (((board[0][0] == 2) && (board[0][1] == 2) && (board[0][2]) == 2)) {
            System.out.println("GRATULACJE - krzyżyki wygrały");
            return false;
        } else if (((board[1][0] == 2) && (board[1][1] == 2) && (board[1][2]) == 2)) {
            System.out.println("GRATULACJE - krzyżyki wygrały");
            return false;
        } else if (((board[2][0] == 2) && (board[2][1] == 2) && (board[2][2]) == 2)) {
            System.out.println("GRATULACJE - krzyżyki wygrały");
            return false;
        } else if (((board[0][0] == 2) && (board[1][0] == 2) && (board[2][0]) == 2)) {
            System.out.println("GRATULACJE - krzyżyki wygrały");
            return false;
        } else if (((board[0][1] == 2) && (board[1][1] == 2) && (board[2][1]) == 2)) {
            System.out.println("GRATULACJE - krzyżyki wygrały");
            return false;
        } else if (((board[0][2] == 2) && (board[1][2] == 2) && (board[2][2]) == 2)) {
            System.out.println("GRATULACJE - krzyżyki wygrały");
            return false;
        } else if (((board[0][0] == 2) && (board[1][1] == 2) && (board[2][2]) == 2)) {
            System.out.println("GRATULACJE - krzyżyki wygrały");
            return false;
        } else if (((board[0][2] == 2) && (board[1][1] == 2) && (board[2][2]) == 2)) {
            System.out.println("GRATULACJE - kółka wygrały");
            return false;
        } else {
            return true;
        }
    }
}
