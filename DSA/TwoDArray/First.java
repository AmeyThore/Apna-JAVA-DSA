package DSA.TwoDArray;
import java.util.*;

public class First {

    public static boolean search(int matrix[][], int key){

        for(int i =0 ; i < matrix.length; i++){
            for(int j  = 0; j<matrix[i].length;j++ ){
                if (matrix[i][j] == key){
                    System.out.println("the key in found at"+ "row "+ i +" column "+ j);
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3]; // 2 rows and 4 columns
        /* Fill the array with some values */
        int row = matrix.length; 
        int colm = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<row; i++)  {
            for(int j =0; j<colm; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i =0; i < row; i++){
            for(int j = 0; j < colm; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        int key = sc.nextInt();
        search(matrix, key);
    }
    
}
