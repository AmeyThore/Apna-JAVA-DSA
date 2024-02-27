package DSA.BitManipulation;

public class IsPowerOfTwo {
    public static boolean isPowerOfTwo(int n){
        return ((n) & (n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(4)); // true
        System.out.println(isPowerOfTwo(5)); // false
        System.out.println(isPowerOfTwo(8)); // true
    }
}
