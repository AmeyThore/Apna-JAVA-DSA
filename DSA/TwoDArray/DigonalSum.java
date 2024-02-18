package DSA.TwoDArray;

public class DigonalSum {

    public static int Diagonal(int matrix[][]){
        int sum = 0;
        // for(int i= 0; i<matrix.length; i++){
        //     for(int j = 0; j<matrix[0].length;j++){

        //         if(i == j){
        //             sum += matrix[i][j]; 
        //         }
        //         if(i + j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        // return sum;
        // Method 2: Using only one loop and adding elements of the main diagonal, sub

        for(int i = 0; i< matrix.length; i++){
            //primary diagonal
            sum += matrix[i][i];
            //secondary diagonal
            if(i != matrix[0].length-1-i)
            sum += matrix[i][matrix[0].length-i-1];
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}};
            System.out.println("Diagonal Sum of the Matrix is : " + Diagonal(matrix));
    }
}
