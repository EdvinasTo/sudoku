public class App {
    
    public static void main(String[] args) throws Exception {
        int[][] board = {
            {6, 0, 0, 9, 5, 0, 0, 0, 2},
            {0, 1, 0, 0, 8, 3, 4, 0, 0},
            {4, 0, 0, 6, 0, 1, 0, 5, 0},
            {0, 0, 9, 8, 0, 0, 7, 0, 5},
            {5, 2, 7, 4, 1, 9, 6, 0, 3},
            {0, 0, 4, 3, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 1, 2, 9, 6, 5, 0, 0},
            {7, 0, 6, 0, 0, 8, 9, 0, 1},
        };

        System.out.println();
        InOut.printBoard(board);
        System.out.println();
        Utils.solve(board);
        System.out.println();
        InOut.printBoard(board);
        System.out.println();
    }
}
