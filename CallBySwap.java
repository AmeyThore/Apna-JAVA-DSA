//Call by vaalues in java

public class CallBySwap {
    public static void swap(int a, int b){
        a=10;
        b=5;

        System.out.println("After Swapping:");

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public static void main (String[] args) {
        System.out.println("Before Swapping:");
        
        int a = 5;
        int b = 10;
        
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        int temp = a;
        a = b;
        b = temp;

        swap(a, b);
}
    
}
