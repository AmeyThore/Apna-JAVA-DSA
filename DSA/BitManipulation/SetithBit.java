package DSA.BitManipulation;

public class SetithBit {
    public static int setithbit(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static void main(String[] args) {
        System.out.println(setithbit(10, 2 )); //set the 4th bit of number  5 to be 1 and print it out
    }
}
//5 = 0101 , i = 2 means 0101 | 0100 OR gate  operation will give us : 0101 | 0100 = 0011 = 