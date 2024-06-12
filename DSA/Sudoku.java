package DSA.Backtracking;

public class Sudoku {
    public static boolean sudokuSolver(int sudoku[][], int row , int col){
        //base 

        //recursion

        for(int digit=1; digit<=9; digit++){
            if(isSafe(sudoku , row, col, digit)){
                sudoku[row][col] = digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)){
                    return true;
                }
                sudoku[row][col]= 0;
            }
        }
    }
    public static void main(String[] args) {
        int sudoku[][] = 
        {  {7, 0, 0, 0, 0, 0, 2, 0, 0},   
        {4, 0, 2, 0, 0, 0, 0, 0, 3},   
        {0, 0, 0, 2, 0, 1, 0, 0, 0},   
        {3, 0, 0, 1, 8, 0, 0, 9, 7},   
        {0, 0, 9, 0, 7, 0, 6, 0, 0},   
        {6, 5, 0, 0, 3, 2, 0, 0, 1},   
        {0, 0, 0, 4, 0, 9, 0, 0, 0},   
        {5, 0, 0, 0, 0, 0, 1, 0, 6},   
        {0, 0, 6, 0, 0, 0, 0, 0, 8}   
     } ;
    
    }
}
