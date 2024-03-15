package DSA.Recursion;

public class FactorialOfn {
    public static int Factorial(int n) {
        if(n == 0){
            return 1;
        }
        //int fnm1 = Factorial(n-1);
        int fn = n * Factorial(n-1);
        return fn;
        
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Factorial(n));
    }
}
