package DSA.BitManipulation;

public class UpdateIthBit {
    public static int setithbit(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static int clearIthBit(int n, int i){
        int bitmask = ~(1<<i);

        return  n & bitmask;
    }
    public static int updateIthBit(int n, int i, int nwBit){

        // if (nwBit == 0){
        //     return  clearIthBit(n, i);
        // }else{
        //     return  setithbit(n, i);
        // }

        n = clearIthBit(n, i);
        int bitmask = nwBit<<i;
        return n | bitmask;

    }
    public static void main(String[] args) {
        System.out.println("Update ith bit becomes to "+updateIthBit(10, 2, 1));
    }
}
