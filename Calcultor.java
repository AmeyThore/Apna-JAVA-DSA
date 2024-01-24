import java.util.*;

public class Calcultor{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a : ");
        int a = sc.nextInt();
        System.out.println("Enter the b : ");
        int b = sc.nextInt();
        System.out.println("Enter the Operator : ");
        char oprator = sc.next().charAt(0);      
        
        switch (oprator) {
            case '+' : System.out.println(a+b);
                          break ;
            case '-' : System.out.println(a-b);
                           break ;
            case '*' : System.out.println(a*b);
                           break;
            case '/' : System.out.println(a/b);
                           break ;
            case '%' : System.out.println(a%b);
                            break ;
            default : System.out.println("Out of the capabilities");
            
                
        }

    }
}