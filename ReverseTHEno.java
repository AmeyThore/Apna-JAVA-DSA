import java.util.*;

public class ReverseTHEno {
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the no which you want to reverse : ");
        // int n = sc.nextInt();
        int n = 345452;
        int rev = 0;       

        while (n > 0 ){
            int lastdigit = n % 10;
            //System.out.print(lastdigit);
            rev = (rev*10) + lastdigit;
            n = n/10; // n /= 10
        }
        System.out.println(rev);
    }
    
}
