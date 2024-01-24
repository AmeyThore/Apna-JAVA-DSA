import java.util.*;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int lastno ;
        int rev = 0;

        while(n >= 1){
           
            lastno = n % 10;
            n = n / 10;
            rev = (rev * 10) + lastno;
            
            
        }
        System.out.println(rev);
    }
    
}
