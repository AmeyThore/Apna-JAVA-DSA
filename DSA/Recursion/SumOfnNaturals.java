package DSA.Recursion;

public class SumOfnNaturals {
    public static int Sum(int n){
        if(n == 1){
            return 1;
        }
        int NM1 = Sum(n-1);
        int N = n + NM1;
        return N;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum of first " + n + " natural numbers is: "+Sum(n));
    }
}
