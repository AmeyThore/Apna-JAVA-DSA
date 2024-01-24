public class Prime {

    public static boolean isPrime(int n){

        boolean isPrime = true;
        
        if(n % 2 == 0){
            isPrime = false;
        }
        return isPrime;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(12));;
    }
    
}
