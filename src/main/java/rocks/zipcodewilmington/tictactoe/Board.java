package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    public int xCounter = 0;
    public int oCounter = 0;


    public Board(Character[][] matrix) {
        // 2 dimensional Character Array "matrix"
        char x = 'X';
        char o = 'O';

        int i; // Row Number
        int j; // Column Number


        // Iterate through rows left to right, checks for a sequence of 3 x's or o's in a row, if true, break.
            for (i = 0; i < matrix.length; i++) {
                for (j = 0; j < matrix.length; j++) {
                    if (matrix[i][j] == x) {
                        xCounter++;
                    } else if (matrix[i][j] == o) {
                        oCounter++;
                    }
                }
                if (xCounter == 3 || oCounter == 3) {
                    break;
                } else {
                    xCounter = 0;
                    oCounter = 0;
                }
            }

        if (xCounter == 0 && oCounter == 0) {
            for (i = 0; i < matrix.length; i++) {
                for (j = 0; j < matrix.length; j++) {
                    if (matrix[j][i] == x) {
                        xCounter++;
                    } else if (matrix[j][i] == o) {
                        oCounter++;
                    }
                }
                if (xCounter == 3 || oCounter == 3) {
                    break;
                } else {
                    xCounter = 0;
                    oCounter = 0;
                }
            }
        }

        if (xCounter == 0 && oCounter == 0) {
            for (i = 0; i < matrix.length; i++) {
                for (j = 0; j < matrix.length; j++) {
                    if (matrix[j][j] == x) {
                        xCounter++;
                    } else if (matrix[j][j] == o) {
                        oCounter++;
                    }
                }
                if (xCounter == 3 || oCounter == 3) {
                    break;
                } else {
                    xCounter = 0;
                    oCounter = 0;
                }
            }
        }

        if (xCounter == 0 && oCounter == 0){
            for (i = 2; i >= 0; i--) {
                for (j = 0; j < matrix.length; j++) {
                    if (matrix[i][j] == x) {
                        xCounter++;
                    } else if (matrix[i][j] == o) {
                        oCounter++;
                    }
                    i--;
                }
                if (xCounter == 3 || oCounter == 3) {
                    break;
                } else {
                    xCounter = 0;
                    oCounter = 0;
                }
            }
        }
    }



    public Boolean isInFavorOfX() {
        return xCounter == 3;
    }

    public Boolean isInFavorOfO() {
        return oCounter == 3;
    }

    public Boolean isTie() {
        return (!isInFavorOfO() && !isInFavorOfX());
    }

    public String getWinner() {

        if (isInFavorOfX()){
            return "X";
        } else if (isInFavorOfO()) {
            return  "O";
        } else if (isTie()) {
            return "";
        }
        return "Unreachable statement";
    }

}
