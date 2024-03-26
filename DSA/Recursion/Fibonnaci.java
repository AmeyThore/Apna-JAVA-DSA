package DSA.Recursion;

public class Fibonnaci {
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int  f = fnm1 + fnm2;
        // System.out.println("f["+n+"]="+f);
        return f;
    }
    public static void main(String[] args) {
        int n = 9;
        System.out.print("Fibonacci series up to "+n+" terms: ");
        System.out.println(fib(n));
    }
}
