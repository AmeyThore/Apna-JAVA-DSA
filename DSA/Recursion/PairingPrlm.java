package DSA.Recursion;

public class PairingPrlm {
    public static int totalWays(int n){
        //base case
        if(n == 1 || n == 2){
            return n;
        }
        //single
        int fnm1 = totalWays(n-1);

        //pair
        int fnm2 = totalWays(n-2);
        int pairways = (n-1) * fnm2;

        //totalways
        int totalWays = fnm1+pairways;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(totalWays(3));
    }
}
