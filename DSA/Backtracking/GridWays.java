package DSA.Backtracking;

public class GridWays{

    public static int WaysToSolveGrid(int i, int j, int n, int m){
        //base
        if( i == n-1 && j == m-1){
            return 1;
        }else if(i == n || j == m){
            return 0;
        }

        //sol
        int way1 = WaysToSolveGrid(i+1, j, n, m);
        int way2 = WaysToSolveGrid(i, j+1, n, m);
        return way1 + way2;

    }
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(WaysToSolveGrid(0, 0, n, m));
    }
}