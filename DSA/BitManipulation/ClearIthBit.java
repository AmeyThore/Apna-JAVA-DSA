package DSA.BitManipulation;

public class ClearIthBit {
    public static int clearIthBit(int n, int i){
        int bitmask = ~(1<<i);

        return  n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println("5 with the 2nd bit cleared: " + clearIthBit(5, 2)); //prints 5 with the 2nd bit cleared
        System.out.println("10 without 1st bit cleared: " + clearIthBit(10, 1)); //prints   
    }
}
