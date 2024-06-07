package DSA.Backtracking;

public class nQueens {

    public static void nqueens(char board[][], int row){
        //base
        if(row == board.length){
            printBoard(board);
            return;
        }
        //plasing queens
        for(int j = 0; j < board.length; j++){
            board[row][j] = 'Q';
            nqueens(board, row+1);
            board[row][j] = 'X';
        }
    }
    public static void printBoard(char board[][]){
        System.out.println("------------ chess board -----------");
        for(int i = 0; i< board.length; i++){
            for(int j = 0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n =2;
        char board[][] = new char[n][n];

        for(int i = 0; i<n;i++){
            for(int j = 0; j < n; j++){
                board[i][j] = 'X';
            }
        }
        nqueens(board, 0);

    }
}
