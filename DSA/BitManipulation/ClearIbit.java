package DSA.BitManipulation;

public class ClearIbit {
    public static int clearIbit(int n, int i){
        int BitMask = (~0)<<i; //or (-1)<<i
        return n & BitMask;
    }
    public static void main(String[] args) {
        System.out.println("Clear Ith bit of number 9 is : " +clearIbit(9,2));//Output: 8
        System.out.println("Clear Ith bit of number 15 is : " +clearIbit(15,2));
    }
}
