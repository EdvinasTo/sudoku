public class Utils {

    private final static int GRID_SIZE = 9;

    private static boolean isValidInRow(int[][] board, int row, int num){
        for (int i = 0; i < GRID_SIZE; i++)
        {
            if (board[row][i] == num) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidInColumn(int[][] board, int column, int num){
        for (int i = 0; i < GRID_SIZE; i++)
        {
            if (board[i][column] == num) {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidInSquare(int[][] board, int row, int column, int num){
        int squareRow = row - row % 3;
        int squareColumn = column - column % 3;
        for (int i = squareRow; i < squareRow + 3; i++)
            for (int j = squareColumn; j < squareColumn + 3; j++)
                if (board[i][j] == num)
                    return false;
        return true;
    }

    private static boolean isValid(int[][] board, int row, int column, int num){
        return isValidInRow(board, row, num) &&
            isValidInColumn(board, column, num) &&
            isValidInSquare(board, row, column, num);
    }

    public static boolean solve(int[][] board){
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int column = 0; column < GRID_SIZE; column++){
                if (board[row][column] == 0){
                    for (int number = 1; number <= GRID_SIZE; number++){
                        if (isValid(board, row, column, number)){
                            board[row][column] = number;
                            if(solve(board)){
                                return true;
                            }
                            else {
                                board[row][column] = 0;
                            }
                        }
                        
                    }
                    return false;
                }
                
            }
        }
        return true;
    }
}
