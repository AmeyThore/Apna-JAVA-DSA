package DSA.BitManipulation;

public class ClearBitsInRange {
    public static int clearBitsInRange(int n, int i ,int j){
        int a = ((~0)<<(j+1));//i
        int b = (1<<i) - 1;//j
        int BitMask = a | b;
        return n & BitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearBitsInRange(10,2, 4));
    }
}
