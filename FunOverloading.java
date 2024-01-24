public class FunOverloading {
    public static int sum(int a , int b){
        return a + b;
 
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("Sum of two integers: " +sum(5,7));
        System.out.println("Sum of two integers: " +sum(5.0f,7.0f));
    }
    
}
