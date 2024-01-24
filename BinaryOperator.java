public class BinaryOperator {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 5;
        // int x = a++;
        // int y = ++b;
        int x1 = a--;
        int y1 = --b;
        
        
           
        System.out.println("b ="+ b ); // 10
        
        System.out.println("a: " + a); // 6

        // System.out.println(y);
        // System.out.println(x);
        System.out.println(y1); //u
        System.out.println(x1);
        System.out.println("add : " + (a+b));
        System.out.println("divide : " + (a/b));
        System.out.println("subtract : " + (a-b));
        System.out.println("multi : "  +  (a*b));
        System.out.println("modulo(remainder) : "+ (a%b));
    }
}
