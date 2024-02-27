package DSA.BitManipulation;

public class CountSetBits {
    public static int countSetBits(int n){
        int count= 0;
        while (n > 0) {
            // n = n & (n - 1); // clear the rightmost set bit in n
            // count++;          // increment count of set bits
            
                                             //OR

            if((n & 1) != 0){ // Anding  with 1 will give us the last set bit, If it is zero then we can safely say
                count++;
            }
            n = n>>1; // right shift  by one to check next bit from left side
        }
        return count;
    }
        
    public static void main(String[] args) {
        
        //counting 1's in the binary number
        System.out.println(countSetBits(5));   // Output: 2
    }
}
