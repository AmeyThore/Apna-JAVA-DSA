public class Factorial {
    public static int factorial(int n) {
        int f =1;
        for(int i = 1; i <= n; i++){
            f *=i ;//f = f * i

        }
        return f;
        
    }
    public static int BinomialCoeff(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        int BiCoeff  = n_fact/(r_fact*nmr_fact);
        return BiCoeff;
        
    }
    public static void main(String[] args) {
        //System.out.println("Factorial is " + factorial(5));
        System.out.println(BinomialCoeff(5, 2));
        
    
    }
}
