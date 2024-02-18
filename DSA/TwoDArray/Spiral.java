package DSA.TwoDArray;

public class Spiral {

    public static void spiral(int spiral[][]){
        int sr = 0; //Starting row
        int er = spiral.length-1; //end row
        int sc = 0; // start cloum
        int  ec = spiral[0].length-1; // end column
    
        while (sr <= er && sc <= ec) {
            //top
            for(int j=sr; j <= er ;j++){
                System.out.print(spiral[sr][j]+" ");
            }

            //right
            for(int i=sr+1; i <= er; i++){
                System.out.print(spiral[i][ec]+" ");
            }

            //bottom
            for(int j=ec-1; j >= sc; j--){
                System.out.print(spiral[er][j]+" ");
            }
            
            //left
            for(int i=ec-1; i>=sc+1; i--) {
                System.out.print(spiral[i][sr]+" ");
            }    
            sr++;
            sc++;
            ec--;
            er--;
        
        }
        System.out.println();  
    }

    public static void main(String[] args) {
        int spiral[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        spiral(spiral);    

    }
    
}
