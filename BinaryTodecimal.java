public class BinaryTodecimal{

    public static void BtD(int bitNum){
        int mynum = bitNum;
        int pow = 0;
        int decN = 0;

        while(bitNum > 0){
            int LD = bitNum % 10;
            decN = decN + (LD * (int)Math.pow(2, pow));

            pow++;
            bitNum /= 10;
        }
        System.out.println("decimal of "+ mynum+"="+decN);


    }
    public static void main(String[] args) {
        BtD(101);
}
}