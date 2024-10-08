public class InOut {

    public static void printBoard(int[][] board) {
        for (int row = 0; row < 9; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.println("------+-------+------");
            }
            for (int column = 0; column < 9; column++) {
                if (column % 3 == 0 && column != 0) {
                    System.out.print("| "); 
                }
                System.out.print(board[row][column] + " ");
            }
            System.out.println();
        }
    }
}
