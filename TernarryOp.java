import java.util.*;

public class TernarryOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. : ");
        int a = sc.nextInt();
        // tenarry oprator
        String type = ( a % 2 == 0) ? "Even" : "Odd";

        System.out.println(type);
    }
    
}
