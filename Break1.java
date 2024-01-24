// Keep entering numbers till user enters a multiple of 10
import java.util.Scanner;

public class Break1 {
    public static void main(String[] args) {
        do{
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter a number");
            int n = sc.nextInt();
            if( n % 10 == 0){
                System.out.println("The no. is divisible by 10 , please enter another no.");
                break;
            }
           

        }while(true);
    }
}
