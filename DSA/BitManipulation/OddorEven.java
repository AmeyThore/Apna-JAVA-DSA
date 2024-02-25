package DSA.BitManipulation;

public class OddorEven {
    public static void bitMan(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.err.println("even number");
        }else{
            System.out.println("Odd number");
        }
    
    }
    public static void main(String[] args) {
        bitMan(0);
        bitMan(9);
        bitMan(-7);
        
    }
}
