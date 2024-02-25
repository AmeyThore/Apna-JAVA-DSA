package DSA.BitManipulation;

public class ithBit {
    public static int getithBit(int n, int i){
        int BitMask = 1<<i;  //Creating a bitmask for the required position i.e 1 left shit left shift i
        if((n & BitMask) == 0){
            return  0;   //Returns 0 if the i-th bit is 0
        }else {
            return 1;   //Returns 1 if the i-th bit is  1
        }
        }
    public static void main(String[] args) {
        System.out.println(getithBit(7,2));//Output
    }
}