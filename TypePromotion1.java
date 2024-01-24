public class TypePromotion1 {
    public static void main(String[] args) {
        // char a = 'a';
        // char b = 'b';
        // System.out.println(a-b);//97-98

        int a = 4;
        float b = 4.5f;
        double c = 55.6;
        long d = 45;
        double sum = a + b + c + d;
        System.out.println(sum);

        byte x = 5;
        byte y = (byte) (x * 2);
        System.out.println(y);

    }
    
}
