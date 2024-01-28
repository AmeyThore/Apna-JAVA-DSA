public class DecimalToBinary {
    public static void DecNo(int DecNo){
        int mynum = DecNo;
        int pow = 0;
        int BinNo = 0;
       

        while(DecNo > 0){
            int remainder = DecNo % 2;

             BinNo = BinNo + remainder * (int)Math.pow(10, pow);

             pow++;
             DecNo/=2;
        }
        System.out.println("Binary no of "+ mynum +" is = "+BinNo);

    }
    public static void main(String[] args) {
        DecNo(7);
        
    }
}
