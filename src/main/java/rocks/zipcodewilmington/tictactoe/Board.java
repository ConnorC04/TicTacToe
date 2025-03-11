package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    public int xInRow = 0;
    public int oInRow = 0;
    public int xInColumn = 0;
    public int oInColumn = 0;
    public int xInDiagonal = 0;
    public int oInDiagonal = 0;

    public Board(Character[][] matrix) {
        // 2 dimensional Character Array "matrix"
        char x = 'X';
        char o = 'O';


        // Iterate through rows
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                if (matrix[i][j] == x){
                    xInRow++;
                } else if (matrix[i][j] == o) {
                    oInRow++;
                }
            }
        }
    }

    public Boolean isInFavorOfX() {
        return (xInRow == 3 || xInColumn == 3 || xInDiagonal == 3);
    }

    public Boolean isInFavorOfO() {
        return (oInRow == 3 || oInColumn == 3 || oInDiagonal == 3);
    }

    public Boolean isTie() {
        return (!isInFavorOfO() && !isInFavorOfX());
    }

    public String getWinner() {

        return null;
    }

}
