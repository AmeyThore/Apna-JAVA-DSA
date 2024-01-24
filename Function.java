import java.util.*;

public class Function {
    public static void HelloWorld(){
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        return;
    }
        public static int HelloWorld1(){
        System.out.println("Hello Mommy!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        return 3;
    }
    public static int Calculate(int a , int b){
        int sum = a + b;
        System.out.println(sum);
        return sum;
        

    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        Calculate(a,  b);
    }
    
}
