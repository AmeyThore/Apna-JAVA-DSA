package DSA.Recursion;

public class TilingProblemAmz {
    public static int tiling(int n){// 2*n floor size
        //Base case
        if(n == 0 || n == 1){
            return 1;
        }
        //Choices
        //1.Vertical
        int  vertical = tiling(n - 1);
        //2.Horizontal
        int horizontal = tiling( n - 2);
        
        //total ways
        int totWays = vertical + horizontal;
        return totWays;
    }
    public static void main(String[] args) {
        System.out.println("Number of ways to tile a room with n*m dimensions is " +tiling(3));
    }
}
